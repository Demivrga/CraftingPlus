package CraftingPlus.Dryads.me;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import CraftingPlus.Dryads.me.crafting.Data;
import CraftingPlus.Dryads.me.crafting.Items;
import CraftingPlus.Dryads.me.crafting.Recipes;
import CraftingPlus.Dryads.me.lib.ActionBarAPI;
import CraftingPlus.Dryads.me.lib.CraftingConfig;
import CraftingPlus.Dryads.me.listeners.Permissions;

public class main extends JavaPlugin {

	public PluginManager pm;
	public ActionBarAPI aba;
	public Items items;
	public Recipes recipes;
	public Data data;
	public FileConfiguration config = this.getConfig();
	public CraftingConfig crafting = new CraftingConfig(this, "crafting.yml");
	

	public void onEnable() {
		
		
        pm = Bukkit.getPluginManager();
        this.saveDefaultConfig();
        
        //Initializing Crafting Data implementation
        Items items = new Items(this, recipes, data);
        Data data = new Data(this, items, recipes);
        Recipes recipes = new Recipes(this, items, data);
        
        //Initializing Permissions Structure
        pm.registerEvents(new Permissions(this, aba, items, recipes), this);
        
    
        System.out.println("[CraftingPlus]: Has been enabled!");
        
        //Adding Recipes from Crafting Section
        Bukkit.addRecipe(recipes.GrassRecipe());
    	
    	
	}

	public void onDisable() {

		System.out.println("[CraftingPlus]: Has been disabled!");
		getConfig().options().copyHeader(true);
		
		for (Player online : Bukkit.getOnlinePlayers()) {
			online.closeInventory();

		}

	}

}
