package org.achencraft.achencraftnavigator.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Commands implements CommandExecutor {
    private static CommandSender sender;
    private static Player player;

    @Override
    public boolean onCommand(CommandSender cmd_sender, Command command, String label, String[] args) {

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
