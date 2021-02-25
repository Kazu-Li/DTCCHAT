package kazu_li.rpchatfordtc;

import me.clip.placeholderapi.PlaceholderAPI;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import kazu_li.rpchatfordtc.utils.HexColor;


public class chat implements Listener {
    private final main plugin;

    public chat(main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void setMessage(AsyncPlayerChatEvent event) {
        String messageformat = plugin.getConfig().getString("chatformat");
        String message = event.getMessage();



        messageformat = messageformat.replace("{message}", message);
        event.setFormat(ChatColor.translateAlternateColorCodes('&', HexColor.translateHexCodes(PlaceholderAPI.setPlaceholders(event.getPlayer(), messageformat))));
        plugin.getLogger().info(ChatColor.translateAlternateColorCodes('&',message));



    }



}
