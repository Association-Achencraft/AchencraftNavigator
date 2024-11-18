package org.achencraft.achencraftnavigator;

import org.bukkit.plugin.java.JavaPlugin;
import org.achencraft.achencraftnavigator.command.Commands;




public final class AchencraftNavigator extends JavaPlugin {

    public static AchencraftNavigator instance;

    @Override
    public void onEnable() {
        // Plugin startup logic

        instance = this;
        getLogger().info("onEnable is called!");

        getCommand("nav").setExecutor(new Commands(instance));
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getLogger().info("onDisable is called!");
    }
}
