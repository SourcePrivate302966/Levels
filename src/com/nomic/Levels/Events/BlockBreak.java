package com.nomic.Levels.Events;

import com.nomic.Levels.Main;
import java.util.Random;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {

	private Main plugin;
	public BlockBreak(Main pl) {
		plugin = pl;
	}
	
	String dub = "levels.double";
	String tri = "levels.triple";
	String perm = "levels.block";

	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		Material b = e.getBlock().getType();
		Player p = e.getPlayer();
		ConfigurationSection config = plugin.getConfig().getConfigurationSection("blockExp");
		int mult = plugin.getConfig().getInt("expMultiplier");
		if (p.hasPermission("levels.block.deny.*")) {
			e.setExpToDrop(0);
			return;
		}
		if (b == Material.COAL_ORE) {
			int min = config.getConfigurationSection("coalOre").getInt("min");
			int max = config.getConfigurationSection("coalOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.block.deny.coalore")) {
				e.setExpToDrop(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			} else if ((min == 0) && (max > 1)) {
				if (chance == 1) {
					if (!p.hasPermission(perm)) {
						e.setExpToDrop(give);
					} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
						p.giveExp(give);
					} else if (p.hasPermission(dub)) {
						p.giveExp(2 * give);
					} else if (p.hasPermission(tri)) {
						p.giveExp(3 * give);
					}
				}
			} else if ((min == 0) && (max == 1) && (chance > 0)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (b == Material.DIAMOND_ORE) {
			int min = config.getConfigurationSection("diamondOre").getInt("min");
			int max = config.getConfigurationSection("diamondOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.block.deny.diamondore")) {
				e.setExpToDrop(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			} else if ((min == 0) && (max > 1)) {
				if (chance == 1) {
					if (!p.hasPermission(perm)) {
						e.setExpToDrop(give);
					} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
						p.giveExp(give);
					} else if (p.hasPermission(dub)) {
						p.giveExp(2 * give);
					} else if (p.hasPermission(tri)) {
						p.giveExp(3 * give);
					}
				}
			} else if ((min == 0) && (max == 1) && (chance > 0)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (b == Material.EMERALD_ORE) {
			int min = config.getConfigurationSection("emeraldOre").getInt("min");
			int max = config.getConfigurationSection("emeraldOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.block.deny.emeraldore")) {
				e.setExpToDrop(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			} else if ((min == 0) && (max > 1)) {
				if (chance == 1) {
					if (!p.hasPermission(perm)) {
						e.setExpToDrop(give);
					} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
						p.giveExp(give);
					} else if (p.hasPermission(dub)) {
						p.giveExp(2 * give);
					} else if (p.hasPermission(tri)) {
						p.giveExp(3 * give);
					}
				}
			} else if ((min == 0) && (max == 1) && (chance > 0)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (b == Material.LAPIS_ORE) {
			int min = config.getConfigurationSection("lapisOre").getInt("min");
			int max = config.getConfigurationSection("lapisOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.block.deny.lapisore")) {
				e.setExpToDrop(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			} else if ((min == 0) && (max > 1)) {
				if (chance == 1) {
					if (!p.hasPermission(perm)) {
						e.setExpToDrop(give);
					} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
						p.giveExp(give);
					} else if (p.hasPermission(dub)) {
						p.giveExp(2 * give);
					} else if (p.hasPermission(tri)) {
						p.giveExp(3 * give);
					}
				}
			} else if ((min == 0) && (max == 1) && (chance > 0)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (b == Material.REDSTONE_ORE) {
			int min = config.getConfigurationSection("redstoneOre").getInt("min");
			int max = config.getConfigurationSection("redstoneOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.block.deny.redstoneore")) {
				e.setExpToDrop(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			} else if ((min == 0) && (max > 1)) {
				if (chance == 1) {
					if (!p.hasPermission(perm)) {
						e.setExpToDrop(give);
					} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
						p.giveExp(give);
					} else if (p.hasPermission(dub)) {
						p.giveExp(2 * give);
					} else if (p.hasPermission(tri)) {
						p.giveExp(3 * give);
					}
				}
			} else if ((min == 0) && (max == 1) && (chance > 0)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (b == Material.QUARTZ_ORE) {
			int min = config.getConfigurationSection("quartzOre").getInt("min");
			int max = config.getConfigurationSection("quartzOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.block.deny.quartzore")) {
				e.setExpToDrop(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			} else if ((min == 0) && (max > 1)) {
				if (chance == 1) {
					if (!p.hasPermission(perm)) {
						e.setExpToDrop(give);
					} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
						p.giveExp(give);
					} else if (p.hasPermission(dub)) {
						p.giveExp(2 * give);
					} else if (p.hasPermission(tri)) {
						p.giveExp(3 * give);
					}
				}
			} else if ((min == 0) && (max == 1) && (chance > 0)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (b == Material.IRON_ORE) {
			int min = config.getConfigurationSection("ironOre").getInt("min");
			int max = config.getConfigurationSection("ironOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.block.deny.ironore")) {
				e.setExpToDrop(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			} else if ((min == 0) && (max > 1)) {
				if (chance == 1) {
					if (!p.hasPermission(perm)) {
						e.setExpToDrop(give);
					} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
						p.giveExp(give);
					} else if (p.hasPermission(dub)) {
						p.giveExp(2 * give);
					} else if (p.hasPermission(tri)) {
						p.giveExp(3 * give);
					}
				}
			} else if ((min == 0) && (max == 1) && (chance > 0)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (b == Material.GOLD_ORE) {
			int min = config.getConfigurationSection("goldOre").getInt("min");
			int max = config.getConfigurationSection("goldOre").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.block.deny.goldore")) {
				e.setExpToDrop(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			} else if ((min == 0) && (max > 1)) {
				if (chance == 1) {
					if (!p.hasPermission(perm)) {
						e.setExpToDrop(give);
					} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
						p.giveExp(give);
					} else if (p.hasPermission(dub)) {
						p.giveExp(2 * give);
					} else if (p.hasPermission(tri)) {
						p.giveExp(3 * give);
					}
				}
			} else if ((min == 0) && (max == 1) && (chance > 0)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (b == Material.MOB_SPAWNER) {
			int min = config.getConfigurationSection("mobSpawner").getInt("min");
			int max = config.getConfigurationSection("mobSpawner").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.block.deny.mobspawner")) {
				e.setExpToDrop(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			} else if ((min == 0) && (max > 1)) {
				if (chance == 1) {
					if (!p.hasPermission(perm)) {
						e.setExpToDrop(give);
					} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
						p.giveExp(give);
					} else if (p.hasPermission(dub)) {
						p.giveExp(2 * give);
					} else if (p.hasPermission(tri)) {
						p.giveExp(3 * give);
					}
				}
			} else if ((min == 0) && (max == 1) && (chance > 0)) {
				if (!p.hasPermission(perm)) {
					e.setExpToDrop(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
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
