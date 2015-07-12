package com.oneshotmc.whoneedsphysics;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class WhoNeedsPhysics extends JavaPlugin implements Listener{
	private static final boolean debug = false;
	public void debug(String str){
		if(debug)this.getLogger().info(str);
	}
	public void onEnable(){
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable(){
		
	}
	
	@EventHandler(priority=EventPriority.HIGH,ignoreCancelled=true)
	public void onPhysics(BlockPhysicsEvent e){
		Material mat = e.getChangedType();
		Material mat2 = e.getBlock().getType();
		switch(mat){
		case SIGN:
		case SIGN_POST:
		case WALL_SIGN:
			e.setCancelled(true);
			break;
		default:
			break;
		}
		
		switch(mat2){
		case SIGN:
		case SIGN_POST:
		case WALL_SIGN:
			e.setCancelled(true);
			break;
		default:
			break;
		}
	}
}
