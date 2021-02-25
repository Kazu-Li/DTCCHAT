package kazu_li.rpchatfordtc;

import kazu_li.rpchatfordtc.command.CommandRP;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        //command
        getCommand("me").setExecutor(new CommandRP(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
