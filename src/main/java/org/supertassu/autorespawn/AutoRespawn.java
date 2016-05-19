package org.supertassu.autorespawn;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoRespawn extends JavaPlugin implements Listener {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onPlayerDie(PlayerDeathEvent e) {
		if (e.getEntity().hasPermission("autorespawn.use")) {
			e.getEntity().spigot().respawn();
		}
	}

}
