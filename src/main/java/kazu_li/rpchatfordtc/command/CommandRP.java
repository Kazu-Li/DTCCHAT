package kazu_li.rpchatfordtc.command;

import kazu_li.rpchatfordtc.main;
import kazu_li.rpchatfordtc.utils.HexColor;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandRP implements CommandExecutor {
    private main plugin;
    public CommandRP(main plugin)
    {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(args.length == 0){
            return false;
        }
        if(!(sender instanceof Player)){
            sender.sendMessage("Only for players!");
            return true;
        }


        Player p = (Player) sender;
        String message = StringUtils.join(args, " ");
        String messageformat = "* &#23d99c" + p.getName() + "&#d699ff " + message + "."; //format message
        Bukkit.broadcastMessage(net.md_5.bungee.api.ChatColor.translateAlternateColorCodes('&', HexColor.translateHexCodes(messageformat)));


        return true;
    }
}
