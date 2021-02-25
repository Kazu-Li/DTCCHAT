package kazu_li.rpchatfordtc.utils;

import kazu_li.rpchatfordtc.main;
import net.md_5.bungee.api.ChatColor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColor {


    private static final Pattern HEX_PATTERN = Pattern.compile("&#([A-Fa-f0-9]{6})");
    private static final char COLOR_CHAR = '\u00A7';
    private static main plugin;


    public static String translateHexCodes(String message)
    {
        return translate(HEX_PATTERN, message, plugin);
    }

    public static String translateHexCodes(String startTag, String endTag, String message, main plugin)
    {
        final Pattern hexPattern = Pattern.compile(startTag + "([a-f0-9]{6})" + endTag);
        return translate(hexPattern, message, plugin);
    }

    private static String translate(Pattern hex, String message, main plugin)
    {
        if (1 == 1)
        {
            Matcher matcher = hex.matcher(message);
            StringBuffer buffer = new StringBuffer(message.length() + 4 * 8);
            while (matcher.find())
            {
                String group = matcher.group(1);
                matcher.appendReplacement(buffer, COLOR_CHAR + "x"
                        + COLOR_CHAR + group.charAt(0) + COLOR_CHAR + group.charAt(1)
                        + COLOR_CHAR + group.charAt(2) + COLOR_CHAR + group.charAt(3)
                        + COLOR_CHAR + group.charAt(4) + COLOR_CHAR + group.charAt(5)
                );
            }
            return ChatColor.translateAlternateColorCodes('&', matcher.appendTail(buffer).toString());
        }
        else
        {
            return ChatColor.translateAlternateColorCodes('&', message);
        }
    }


}
