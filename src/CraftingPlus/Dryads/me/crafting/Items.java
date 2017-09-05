package CraftingPlus.Dryads.me.crafting;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import CraftingPlus.Dryads.me.main;

public class Items {

	public main pl;
	public Recipes recipes;
	public Data data;

	public Items(main instance, Recipes rinstance, Data dinstance) {
		pl = instance;
		data = dinstance;
		recipes = rinstance;
		;
	}

	public ItemStack Soulstone() {
		// Item material
		ItemStack Soul = new ItemStack(Material.NETHER_STAR);
		// Item setting up meta information
		ItemMeta SoulMeta = Soul.getItemMeta();

		// Item Name
		SoulMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8&lSoulstone"));

		// Lore List
		ArrayList<String> SoulLore = new ArrayList<String>();
		SoulLore.add("Test1");
		SoulLore.add("Test2");

		// Setting lore and Meta
		SoulMeta.setLore(SoulLore);
		Soul.setItemMeta(SoulMeta);

		return Soul;

	}

	public ItemStack Grass() {
		ItemStack Grass = new ItemStack(Material.GRASS);
		return Grass;
	}

	public ItemStack Obsidian() {
		ItemStack Obsidian = new ItemStack(Material.OBSIDIAN);
		return Obsidian;
	}

	public ItemStack Leather() {
		ItemStack Leather = new ItemStack(Material.LEATHER);
		return Leather;
	}
	
	public ItemStack MossCobbleStone() {
		ItemStack MossCobbleStone = new ItemStack(Material.MOSSY_COBBLESTONE);
		return MossCobbleStone;
	}
	
	public ItemStack MossStoneBrick() {
		ItemStack MossStoneBrick = new ItemStack(Material.SMOOTH_BRICK);
		MossStoneBrick.setDurability((short)1);
		return MossStoneBrick;
	}
	
	public ItemStack CrackedStoneBrick() {
		ItemStack CrackedStoneBrick = new ItemStack(Material.SMOOTH_BRICK);
		CrackedStoneBrick.setDurability((short)2);
		return CrackedStoneBrick;
	}
	
	public ItemStack ChiseledStoneBrick() {
		ItemStack ChiseledStoneBrick = new ItemStack(Material.SMOOTH_BRICK);
		ChiseledStoneBrick.setDurability((short)3);
		return ChiseledStoneBrick;
	}
	
	public ItemStack Web() {
		ItemStack Web = new ItemStack(Material.WEB);
		return Web;
	}
	
	public ItemStack TallGrass() {
		ItemStack TallGrass = new ItemStack(Material.LONG_GRASS);
		return TallGrass;
	}
	
	public ItemStack Ice() {
		ItemStack Ice = new ItemStack(Material.ICE);
		return Ice;
	}
	
	public ItemStack Fire() {
		ItemStack Fire = new ItemStack(Material.FIRE);
		return Fire;
	}
	
	

}
