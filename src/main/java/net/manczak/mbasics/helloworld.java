package net.manczak.mbasics;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class helloworld implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
        Material type = event.getBlock().getType();
        if(type == Material.DIRT){
            Player player = event.getPlayer();
            player.sendMessage("Hello, you just placed some dirt.");
        }
    }
}
