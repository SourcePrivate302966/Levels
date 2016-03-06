package com.nomic.Levels.Events;

import com.nomic.Levels.Main;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class ExpBottle implements Listener {

	private Main plugin;
	public ExpBottle(Main pl) {
		plugin = pl;
	}

	@EventHandler
	public void onEvent(ProjectileLaunchEvent e) {
		if (!(e.getEntity() instanceof ThrownExpBottle)) {
			return;
		}
		ThrownExpBottle bottle = (ThrownExpBottle) e.getEntity();
		if (!(bottle.getShooter() instanceof Player)) {
			return;
		}
		Player p = (Player) bottle.getShooter();
		int min = plugin.getConfig().getInt("expBottleGiveMin");
		int max = plugin.getConfig().getInt("expBottleGiveMax");
		int mult = plugin.getConfig().getInt("expMultiplier");
		if ((p.hasPermission("levels.expbottle")) || (p.isOp())) {
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			String dub = "levels.double";
			String tri = "levels.triple";
			if ((min > 0) && (max > 1) && (min != max)) {
				if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
					p.sendMessage("give2");
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
					p.sendMessage("give3");
				} else {
					p.giveExp(give);
					p.sendMessage("give");
				}
			} else if ((min == 0) && (max > 1)) {
				if (chance == 1) {
					if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
						p.giveExp(give);
					} else if (p.hasPermission(dub)) {
						p.giveExp(2 * give);
					} else if (p.hasPermission(tri)) {
						p.giveExp(3 * give);
					}
				}
			} else if ((min == 0) && (max == 1) && (chance > 0)) {
				if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
			e.setCancelled(true);
		}
	}
}
