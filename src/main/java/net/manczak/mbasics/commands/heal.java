package net.manczak.mbasics.commands;

import net.manczak.mbasics.message;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target;
        String successMessage;
        if(args.length == 0){
            if( !(sender instanceof Player) ) { return false; }
            target = (Player)sender;
            successMessage = "&8[&6Heal&8]&7 You were healed!";
        }else{
            target = Bukkit.getPlayer(args[0]);
            successMessage = "&8[&6Heal&8]&7 " + args[0] + " was healed!";
        }

        if(target == null){
            message.send(sender, "&8[&6Heal&8]&7 Target specified wrongly.");
            return false;
        }

        target.setHealth(20.0d);
        message.send(sender, successMessage);
        return true;
    }
}
