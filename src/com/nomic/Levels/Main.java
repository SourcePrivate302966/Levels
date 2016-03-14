package com.nomic.Levels;

import com.nomic.Levels.Events.BlockBreak;
import com.nomic.Levels.Events.Cmd;
import com.nomic.Levels.Events.ExpBottle;
import com.nomic.Levels.Events.KillMob;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		registerEvents();
		registerCommands();
		registerConfig();
	}

	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();

		pm.registerEvents(new ExpBottle(this), this);
		pm.registerEvents(new KillMob(this), this);
		pm.registerEvents(new BlockBreak(this), this);
	}

	public void registerCommands() {
		getCommand("levels").setExecutor(new Cmd(this));
	}

	private void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}
