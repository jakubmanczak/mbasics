package net.manczak.mbasics.commands;

import net.manczak.mbasics.message;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class spy implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        message.send(sender, "&8[&6spy&8]&7 You used the spy command!");
        return true;
    }
}
