package me.luras.prefixplus.Utility;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import me.luras.prefixplus.Main;

public class MessageManager {
	
	Main plugin = Main.getPlugin(Main.class);
	
	public void sendPlayerHelpMessage(Player player) {
	    player.sendMessage(ChatColor.DARK_GRAY + "-------------(PrefixPlus Help Page)----------------\n" + 
	    	      ChatColor.YELLOW + "/prefix reload" + ChatColor.DARK_GRAY + "- " + ChatColor.GRAY + ChatColor.ITALIC + "reloads the config\n" + 
	    	      ChatColor.YELLOW + "/setprefix <prefix> <player> " + ChatColor.DARK_GRAY + "- " + ChatColor.GRAY + ChatColor.ITALIC + "Adds a prefix to the player\n" +
	    	      ChatColor.YELLOW + "/setnamecolor <&colorcode(s)> <player> " + ChatColor.DARK_GRAY + "- " + ChatColor.GRAY + ChatColor.ITALIC + "Changes the NameColor of a player\n" + 
	    	      ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + "--------------------------------------------------");
	    	  }
	
	public void consoleMessage(String msg) {
		 plugin.getServer().getConsoleSender().sendMessage(msg);
	}
	
}
