package com.nomic.Levels.Events;

import com.nomic.Levels.Main;
import java.util.Random;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class KillMob implements Listener {

	private Main plugin;

	public KillMob(Main pl) {
		plugin = pl;
	}
	
	String dub = "levels.double";
	String tri = "levels.triple";
	String perm = "levels.mob";

	@EventHandler
	public void onKill(EntityDeathEvent e) {
		Player p = e.getEntity().getKiller();
		EntityType mob = e.getEntity().getType();
		ConfigurationSection config = plugin.getConfig().getConfigurationSection("mobExp");
		int mult = plugin.getConfig().getInt("expMultiplier");
		if (!(p instanceof Player)) {
			return;
		}
		if (p.hasPermission("levels.mob.deny.*")) {
			e.setDroppedExp(0);
			return;
		}
		if (mob == EntityType.BAT) {
			int min = config.getConfigurationSection("bat").getInt("min");
			int max = config.getConfigurationSection("bat").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.bat")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		}
		if (mob == EntityType.BLAZE) {
			int min = config.getConfigurationSection("blaze").getInt("min");
			int max = config.getConfigurationSection("blaze").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.blaze")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.CAVE_SPIDER) {
			int min = config.getConfigurationSection("caveSpider").getInt("min");
			int max = config.getConfigurationSection("caveSpider").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.cavespider")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.CHICKEN) {
			int min = config.getConfigurationSection("chicken").getInt("min");
			int max = config.getConfigurationSection("chicken").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.chicken")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.COW) {
			int min = config.getConfigurationSection("cow").getInt("min");
			int max = config.getConfigurationSection("cow").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.cow")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.CREEPER) {
			int min = config.getConfigurationSection("creeper").getInt("min");
			int max = config.getConfigurationSection("creeper").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.creeper")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.ENDER_DRAGON) {
			int min = config.getConfigurationSection("enderDragon").getInt("min");
			int max = config.getConfigurationSection("enderDragon").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.enderdragon")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.ENDERMAN) {
			int min = config.getConfigurationSection("enderman").getInt("min");
			int max = config.getConfigurationSection("enderman").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.enderman")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.ENDERMITE) {
			int min = config.getConfigurationSection("endermite").getInt("min");
			int max = config.getConfigurationSection("endermite").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.endermite")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.GHAST) {
			int min = config.getConfigurationSection("ghast").getInt("min");
			int max = config.getConfigurationSection("ghast").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.ghast")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.GIANT) {
			int min = config.getConfigurationSection("giant").getInt("min");
			int max = config.getConfigurationSection("giant").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.giant")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.GUARDIAN) {
			int min = config.getConfigurationSection("guardian").getInt("min");
			int max = config.getConfigurationSection("guardian").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.guardian")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.HORSE) {
			int min = config.getConfigurationSection("horse").getInt("min");
			int max = config.getConfigurationSection("horse").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.horse")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.IRON_GOLEM) {
			int min = config.getConfigurationSection("ironGolem").getInt("min");
			int max = config.getConfigurationSection("ironGolem").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.irongolem")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.MAGMA_CUBE) {
			int min = config.getConfigurationSection("magmaCube").getInt("min");
			int max = config.getConfigurationSection("magmaCube").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.magmacube")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.MUSHROOM_COW) {
			int min = config.getConfigurationSection("mushroomCow").getInt("min");
			int max = config.getConfigurationSection("mushroomCow").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.mushroomcow")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.OCELOT) {
			int min = config.getConfigurationSection("ocelot").getInt("min");
			int max = config.getConfigurationSection("ocelot").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.ocelot")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.PIG) {
			int min = config.getConfigurationSection("pig").getInt("min");
			int max = config.getConfigurationSection("pig").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.pig")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.PIG_ZOMBIE) {
			int min = config.getConfigurationSection("pigZombie").getInt("min");
			int max = config.getConfigurationSection("pigZombie").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.pigzombie")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.RABBIT) {
			int min = config.getConfigurationSection("rabbit").getInt("min");
			int max = config.getConfigurationSection("rabbit").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.rabbit")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.SHEEP) {
			int min = config.getConfigurationSection("sheep").getInt("min");
			int max = config.getConfigurationSection("sheep").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.sheep")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.SILVERFISH) {
			int min = config.getConfigurationSection("silverfish").getInt("min");
			int max = config.getConfigurationSection("silverfish").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.silverfish")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.SKELETON) {
			int min = config.getConfigurationSection("skeleton").getInt("min");
			int max = config.getConfigurationSection("skeleton").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.skeleton")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.SLIME) {
			int min = config.getConfigurationSection("slime").getInt("min");
			int max = config.getConfigurationSection("slime").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.slime")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.SPIDER) {
			int min = config.getConfigurationSection("spider").getInt("min");
			int max = config.getConfigurationSection("spider").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.spider")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.SQUID) {
			int min = config.getConfigurationSection("squid").getInt("min");
			int max = config.getConfigurationSection("squid").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.squid")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.VILLAGER) {
			int min = config.getConfigurationSection("villager").getInt("min");
			int max = config.getConfigurationSection("villager").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.villager")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.WITCH) {
			int min = config.getConfigurationSection("witch").getInt("min");
			int max = config.getConfigurationSection("witch").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.witch")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.WITHER) {
			int min = config.getConfigurationSection("wither").getInt("min");
			int max = config.getConfigurationSection("wither").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.wither")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.WOLF) {
			int min = config.getConfigurationSection("wolf").getInt("min");
			int max = config.getConfigurationSection("wolf").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.wolf")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
				} else if ((!p.hasPermission(dub)) && (!p.hasPermission(tri))) {
					p.giveExp(give);
				} else if (p.hasPermission(dub)) {
					p.giveExp(2 * give);
				} else if (p.hasPermission(tri)) {
					p.giveExp(3 * give);
				}
			}
		} else if (mob == EntityType.ZOMBIE) {
			int min = config.getConfigurationSection("zombie").getInt("min");
			int max = config.getConfigurationSection("zombie").getInt("max");
			int chance = new Random().nextInt(max);
			int give = mult * min + new Random().nextInt(mult * (max - min));
			if (p.hasPermission("levels.mob.deny.zombie")) {
				e.setDroppedExp(0);
				return;
			}
			if ((min > 0) && (max > 1) && (min != max)) {
				if (!p.hasPermission(perm)) {
					e.setDroppedExp(give);
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
						e.setDroppedExp(give);
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
					e.setDroppedExp(give);
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
