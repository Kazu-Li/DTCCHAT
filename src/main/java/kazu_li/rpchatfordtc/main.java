package kazu_li.rpchatfordtc;




import kazu_li.rpchatfordtc.command.CommandRP;
import kazu_li.rpchatfordtc.config.ConfManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;


public final class main extends JavaPlugin {



    @Override
    public void onEnable() {
        //command
        getCommand("me").setExecutor(new CommandRP(this));



        //
        String urlfile = "plugin/DTCchat";
        File file = new File(urlfile);
        File config = new File(urlfile + "config.yml");
        if (!config.exists()) {
            getConfig().options().copyDefaults(true);
            saveDefaultConfig();
        }

        //
        getLogger().info("Hi! I Kazu! You use my plugin for Minecraft and DTC server!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
