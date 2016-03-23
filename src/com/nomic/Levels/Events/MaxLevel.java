package com.nomic.Levels.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

import com.nomic.Levels.Main;

public class MaxLevel implements Listener {
	
	private Main plugin;

	public MaxLevel(Main pl) {
		plugin = pl;
	}
	
	@EventHandler
	public void maxlevel(PlayerLevelChangeEvent e) {
		Player p = e.getPlayer();
		String max = plugin.getConfig().getString("maxLevelMessage");
		String maxmsg = ChatColor.translateAlternateColorCodes('&', max);
		if (plugin.getConfig().getInt("maxLevel") == 0 || p.isOp())
			return;
		if (e.getNewLevel() > plugin.getConfig().getInt("maxLevel")) {
			p.setLevel(plugin.getConfig().getInt("maxLevel"));
			if (!(max.equals("none"))) {
				p.sendMessage(maxmsg);
			}
		}
	}
}
