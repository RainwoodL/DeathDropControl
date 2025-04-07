/**
 * DeathDropControl - Advanced Death Item Control
 * Copyright (C) 2025 Rainwood (github.com/RainwoodL)
 * Licensed under MIT License
 * See https://github.com/RainwoodL/DeathDropControl/blob/main/LICENSE
 */
package plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DeathDropControl extends JavaPlugin {
    private static DeathDropControl instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        Bukkit.getPluginCommand("deathcontrol").setExecutor(new Commands());
        Bukkit.getPluginCommand("deathcontrol").setTabCompleter(new Commands());
        Bukkit.getPluginManager().registerEvents(new EventListener(), this);
        getLogger().info("§a[DeathDropControl] Plugin activated! Version: " + getDescription().getVersion());
    }

    @Override
    public void onDisable() {
        getLogger().info("§c[DeathDropControl] Plugin disabled");
    }

    public static DeathDropControl getInstance() {
        return instance;
    }
}