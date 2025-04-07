package plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import java.util.*;

public class Commands implements CommandExecutor, TabCompleter {
    private static final List<String> SUB_CMDS = Arrays.asList("help", "reload");

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 0 || args[0].equalsIgnoreCase("help")) {
            showHelp(sender);
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "reload":
                if (!sender.hasPermission("deathcontrol.admin")) {
                    sender.sendMessage("§c[Error] No permission!");
                    return true;
                }
                DeathDropControl.getInstance().reloadConfig();
                sender.sendMessage("§a[Success] Config reloaded!");
                break;
            default:
                sender.sendMessage("§c[Error] Unknown command. Use /deathcontrol help");
        }
        return true;
    }

    private void showHelp(CommandSender sender) {
        sender.sendMessage("§6===== DeathDropControl Help =====");
        sender.sendMessage("§b/deathcontrol reload §f- Reload config");
        sender.sendMessage("§b/deathcontrol help §f- Show this menu");
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {
        if (args.length == 1) {
            List<String> completions = new ArrayList<>();
            for (String sub : SUB_CMDS) {
                if (sub.startsWith(args[0].toLowerCase())) {
                    completions.add(sub);
                }
            }
            return completions;
        }
        return null;
    }
}