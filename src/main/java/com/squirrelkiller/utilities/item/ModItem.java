package com.squirrelkiller.utilities.item;

import com.squirrelkiller.utilities.SKUtilities;

import net.minecraft.item.Item;

public class ModItem extends Item{
 
	public ModItem(String itemName) {
		setItemName(this, itemName);
		setCreativeTab(SKUtilities.tabSKUtilities);
	}

	/**
	 * Set the registry name of {@code item} to {@code itemName} and the unlocalised name to the full registry name.
	 *
	 * @param item     The item
	 * @param itemName The item's name
	 */
	public static void setItemName(Item item, String itemName) {
		item.setRegistryName(itemName);
		item.setUnlocalizedName(item.getRegistryName().toString());
	}
    
}