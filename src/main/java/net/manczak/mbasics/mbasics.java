package net.manczak.mbasics;

import net.manczak.mbasics.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class mbasics extends JavaPlugin {
    private static mbasics mBasicsInstance;
    @Override
    public void onEnable() {
        mBasicsInstance = this;

        //Bukkit.getPluginManager().registerEvents(new helloworld(), this);
        getCommand("heal").setExecutor(new heal());
        getCommand("feed").setExecutor(new feed());
        getCommand("more").setExecutor(new more());
//        getCommand("repair").setExecutor(new repair());

        msg msgCommand = new msg();
        getCommand("msg").setExecutor(msgCommand);
        getCommand("message").setExecutor(msgCommand);
        getCommand("m").setExecutor(msgCommand);
        getCommand("tell").setExecutor(msgCommand);
        getCommand("t").setExecutor(msgCommand);
        getCommand("pm").setExecutor(msgCommand);
        getCommand("dm").setExecutor(msgCommand);
//
//        r rCommand = new r();
//        getCommand("r").setExecutor(rCommand);
//        getCommand("reply").setExecutor(rCommand);
    }

    @Override
    public void onDisable() {
        //empty function
    }

    public static mbasics getInstance(){
        return mBasicsInstance;
    }
}
