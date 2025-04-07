package plugin;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EventListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        // Check if plugin is enabled
        if (!DeathDropControl.getInstance().getConfig().getBoolean("enable", true)) return;

        Player player = event.getEntity();
        Location deathLocation = player.getLocation();

        // World check
        List<String> enabledWorlds = DeathDropControl.getInstance().getConfig().getStringList("worlds");
        if (!enabledWorlds.contains(deathLocation.getWorld().getName())) return;

        processDeathMessage(event, player);
        processItemDrops(event, player, deathLocation);
    }

    private void processDeathMessage(PlayerDeathEvent event, Player player) {
        if (DeathDropControl.getInstance().getConfig().getBoolean("broadcast.enable", false)) {
            String message = DeathDropControl.getInstance().getConfig().getString("broadcast.message");
            if (message != null && !message.isEmpty()) {
                event.setDeathMessage(message.replace("%player%", player.getName()));
            }
        }
    }

    private void processItemDrops(PlayerDeathEvent event, Player player, Location deathLocation) {
        PlayerInventory inventory = player.getInventory();
        event.getDrops().clear();
        event.setKeepInventory(true);

        Set<Integer> protectedSlots = DeathDropControl.getInstance().getConfig()
                .getIntegerList("protected-slots")
                .stream()
                .collect(Collectors.toSet());

        for (int slot = 0; slot < 41; slot++) {
            if (protectedSlots.contains(slot)) continue;

            ItemStack item = inventory.getItem(slot);
            if (item != null && !item.getType().isAir()) {
                deathLocation.getWorld().dropItemNaturally(deathLocation, item.clone());
                inventory.setItem(slot, null);
            }
        }
    }
}