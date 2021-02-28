package kazu_li.rpchatfordtc.command;
import kazu_li.rpchatfordtc.main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandGetCords implements CommandExecutor {
    private main plugin;
    public CommandGetCords(main plugin)
    {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length > 0) {
            return false;
        }
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only for players!");
            return true;
        }


        Player p = (Player) sender;
        double X = (p.getLocation().getX());
        double Y = (p.getLocation().getY());
        double Z = (p.getLocation().getZ());
        int res = (int)X;
        int res2 = (int)Y;
        int res3 = (int)Z;
        String X1 = String.valueOf(res);
        String Y1 = String.valueOf(res2);
        String Z1 = String.valueOf(res3);
        String XYZ = ChatColor.AQUA+"Координаты "+ p.getName() + ChatColor.GOLD +  " [X: "+X1+" "+"Y: "+Y1+" "+"Z: "+Z1+"]";
        Bukkit.broadcastMessage(XYZ);


        return true;
    }
}