package com.nomic.Levels.Events;

import com.nomic.Levels.Main;
import java.util.Random;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Block implements Listener {

	private Main plugin;
	public Block(Main pl) {
		plugin = pl;
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		Material b = e.getBlock().getType();
		Player p = e.getPlayer();
		if (!p.hasPermission("levels.block")) {
			return;
		}
		ConfigurationSection config = plugin.getConfig().getConfigurationSection("blockExp");
		int mult = plugin.getConfig().getInt("expMultiplier");
		if (b == Material.COAL_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("coalOre").getInt("min");
			int max = config.getConfigurationSection("coalOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			String dub = "levels.double";
			String tri = "levels.triple";
			if ((min > 0) && (max > 1) && (min != max)) {
				if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
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
		} else if (b == Material.DIAMOND_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("diamondOre").getInt("min");
			int max = config.getConfigurationSection("diamondOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			String dub = "levels.double";
			String tri = "levels.triple";
			if ((min > 0) && (max > 1) && (min != max)) {
				if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
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
		} else if (b == Material.EMERALD_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("emeraldOre").getInt("min");
			int max = config.getConfigurationSection("emeraldOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			String dub = "levels.double";
			String tri = "levels.triple";
			if ((min > 0) && (max > 1) && (min != max)) {
				if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
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
		} else if (b == Material.LAPIS_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("lapisOre").getInt("min");
			int max = config.getConfigurationSection("lapisOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			String dub = "levels.double";
			String tri = "levels.triple";
			if ((min > 0) && (max > 1) && (min != max)) {
				if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
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
		} else if (b == Material.REDSTONE_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("redstoneOre").getInt("min");
			int max = config.getConfigurationSection("redstoneOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			String dub = "levels.double";
			String tri = "levels.triple";
			if ((min > 0) && (max > 1) && (min != max)) {
				if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
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
		} else if (b == Material.QUARTZ_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("quartzOre").getInt("min");
			int max = config.getConfigurationSection("quartzOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			String dub = "levels.double";
			String tri = "levels.triple";
			if ((min > 0) && (max > 1) && (min != max)) {
				if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
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
		} else if (b == Material.IRON_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("ironOre").getInt("min");
			int max = config.getConfigurationSection("ironOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			String dub = "levels.double";
			String tri = "levels.triple";
			if ((min > 0) && (max > 1) && (min != max)) {
				if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
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
		} else if (b == Material.GOLD_ORE) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("goldOre").getInt("min");
			int max = config.getConfigurationSection("goldOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			String dub = "levels.double";
			String tri = "levels.triple";
			if ((min > 0) && (max > 1) && (min != max)) {
				if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
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
		} else if (b == Material.MOB_SPAWNER) {
			e.setExpToDrop(0);
			int min = config.getConfigurationSection("mobSpawner").getInt("min");
			int max = config.getConfigurationSection("mobSpawner").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			String dub = "levels.double";
			String tri = "levels.triple";
			if ((min > 0) && (max > 1) && (min != max)) {
				if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
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
		}
	}
}
