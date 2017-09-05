package CraftingPlus.Dryads.me.crafting;

import org.bukkit.material.MaterialData;

import CraftingPlus.Dryads.me.main;

public class Data {

	public main pl;
	public Items items;
	public Recipes recipes;

	public Data(main instance, Items iinstance, Recipes rinstance) {
		pl = instance;
		recipes = rinstance;
		items = iinstance;
	}
	
	public MaterialData Soulstone() {
		
		MaterialData Soulstone = this.items.Soulstone().getData();
		
		return Soulstone;
	}
}
