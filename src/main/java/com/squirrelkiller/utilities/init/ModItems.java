package com.squirrelkiller.utilities.init;

import java.util.HashSet;
import java.util.Set;

import com.squirrelkiller.utilities.item.Item_Fishing_Hook;
import com.squirrelkiller.utilities.item.Item_Fishing_Rod_Reel;
import com.squirrelkiller.utilities.item.Item_Iron_Nugget;
import com.squirrelkiller.utilities.item.Item_Mod_Icon;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
	public static final Set<Item> items = new HashSet<Item>();

    public static Item_Mod_Icon modIcon;
    public static Item_Fishing_Rod_Reel fishingRodReel;
    public static Item_Fishing_Hook fishingHook;
    public static Item_Iron_Nugget ironNugget;

    public static void registerItems() {
		
    	modIcon = registerItem(new Item_Mod_Icon());
    	fishingRodReel = registerItem(new Item_Fishing_Rod_Reel());
    	fishingHook = registerItem(new Item_Fishing_Hook());
    	ironNugget = registerItem(new Item_Iron_Nugget());
    	OreDictionary.registerOre("nuggetIron", new ItemStack(ironNugget));
	}
 
    /**
	 * Register an Item
	 *
	 * @param item The Item instance
	 * @param <T>  The Item type
	 * @return The Item instance
	 */
	private static <T extends Item> T registerItem(T item) {
		GameRegistry.register(item);
		items.add(item);

		return item;
	}
    
}
