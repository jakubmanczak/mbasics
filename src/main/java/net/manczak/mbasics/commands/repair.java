package net.manczak.mbasics.commands;

import net.manczak.mbasics.message;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class repair implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if( !(sender instanceof Player) ) {
            message.send(sender,"&8[&6Repair&8]&7 You have to be a player to use this command.");
            return true;
        }
        Player target = (Player)sender;
//        target.getInventory().getItemInMainHand().getItemMeta().getItemFlags()

        message.send(sender, target.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().toString());

        return true;
    }
}
