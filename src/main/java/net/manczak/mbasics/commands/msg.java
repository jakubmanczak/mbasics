package net.manczak.mbasics.commands;

import net.manczak.mbasics.message;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class msg implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(args.length == 0 || args.length == 1){
            message.send(sender, "&8[&6msg&8]&7 Incorrect usage.");
            return false;
        }
        Player origin = (Player)sender;
        Player target = Bukkit.getPlayer(args[0]);
        if(target == null){
            message.send(sender, "&8[&6msg&8]&7 Target specified wrongly.");
            return false;
        }
        String msg = "";

        for (Integer i = 1; i < args.length; i++){
            msg += " ";
            msg += args[i];
        }

        message.send(origin,
                "&8[&7" + "You" + "&8 -> &6" + target.getDisplayName() + "&8]&7" + msg);
        message.send(target,
                "&8[&6" + origin.getDisplayName() + "&8 -> &7" + "You" + "&8]&7" + msg);

        return true;
    }
}
