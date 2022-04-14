package net.manczak.mbasics;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class message {
    public static void send(CommandSender sender, String message){
        sendInner(sender, message, "&7");
    }
    private static void sendInner(CommandSender sender, String message, String prefix){
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + message));
    }
}
