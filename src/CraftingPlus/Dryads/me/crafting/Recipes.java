package CraftingPlus.Dryads.me.crafting;

import org.bukkit.Material;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import CraftingPlus.Dryads.me.main;

public class Recipes {

	public main pl;
	public Data data;
	public Items items;

	public Recipes(main instance, Items iinstance, Data dinstance) {
		pl = instance;
		data = dinstance;
		items = iinstance;;
		
	}

	public Recipe GrassRecipe() {
		
		ShapedRecipe Grass = new ShapedRecipe(items.Grass());
	    Grass.shape(new String[]{"1", "2"});
	    Grass.setIngredient('1', Material.SEEDS);
	    Grass.setIngredient('2', Material.DIRT);
	    
	    return Grass;
		
	}
	
}
