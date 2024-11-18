package org.achencraft.achencraftnavigator.command;

import org.achencraft.achencraftnavigator.AchencraftNavigator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;


public class Commands implements CommandExecutor {
    private static CommandSender sender;
    private static Player player;
    public static AchencraftNavigator instance;

    public Commands (AchencraftNavigator i) {
        instance = i;
        instance.getLogger().info("Commands is called!");
    }

    @Override
    public boolean onCommand(CommandSender cmd_sender, Command command, String label, String[] args) {

        if (!cmd_sender.hasPermission("navigator.nav")) {
            cmd_sender.sendMessage(Component.text("Vous n'avez pas la permission d'exécuter cette commande !", NamedTextColor.RED));
            return true;
        }


        if (args.length == 0) {
            return false;
        }

        sender = cmd_sender;
        if (sender instanceof Player) {
            player = (Player) sender;
        }

        switch (args[0]) {
            case "test":
                return cmd_test();
            default:
                return false;

        }
    }

    private boolean cmd_test() {
        player.sendMessage("[Nav] TEST");
        return true;
    }


}
