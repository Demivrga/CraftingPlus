package CraftingPlus.Dryads.me.listeners;

import org.bukkit.event.Listener;

import CraftingPlus.Dryads.me.main;
import CraftingPlus.Dryads.me.crafting.Items;
import CraftingPlus.Dryads.me.crafting.Recipes;
import CraftingPlus.Dryads.me.lib.ActionBarAPI;

public class Permissions implements Listener {

	public main pl;
	public ActionBarAPI aba;
	public Items items;
	public Recipes recipes;

	public Permissions(main instance, ActionBarAPI ainstance, Items iinstance, Recipes rinstance) {
		pl = instance;
		aba = ainstance;
		items = iinstance;
		recipes = rinstance;
	}

}
