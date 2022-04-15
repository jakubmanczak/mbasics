package net.manczak.mbasics.commands;

import net.manczak.mbasics.message;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class more implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if( !(sender instanceof Player) ) {
            message.send(sender,"&8[&6More&8]&7 You have to be a player to use this command.");
            return true;
        }
        Player target = (Player)sender;

        ItemStack targetStack = target.getInventory().getItemInMainHand();
        Integer targetStackAmount = target.getInventory().getItemInMainHand().getAmount();
        Integer targetStackMaxAmount = target.getInventory().getItemInMainHand().getMaxStackSize();
        String targetStackItemType = target.getInventory().getItemInMainHand().getType().toString();
        targetStack.setAmount(targetStackMaxAmount);

        if (targetStackItemType == "AIR"){
            message.send(sender, "&8[&6More&8]&7 You need to be holding something first.");
        } else if (targetStackAmount == targetStackMaxAmount) {
            message.send(sender, "&8[&6More&8]&7 You already have as much as you can have of this.");
        }else {
            message.send(sender, "&8[&6More&8]&7 You were given more of " + targetStackItemType + "!");
        }

        return true;
    }
}
