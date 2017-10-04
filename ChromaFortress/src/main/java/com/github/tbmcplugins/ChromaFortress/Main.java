package com.github.tbmcplugins.ChromaFortress;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable(){
		this.getLogger().info("Chroma Fortress Loading...");
		this.getLogger().info("Chroma Fortress Loaded!");
	}
	
	@Override
	public void onDisable(){
		this.getLogger().info("Chroma Fortress Disabling...");
		this.getLogger().info("Chroma Fortress Disabled!");
		
	}
}
