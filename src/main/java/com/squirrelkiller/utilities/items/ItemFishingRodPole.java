package com.squirrelkiller.utilities.items;

import com.squirrelkiller.utilities.Reference;
import com.squirrelkiller.utilities.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public class ItemFishingRodPole extends Item {
	
	public static ItemFishingRodPole RegisteredItem;
	
	public ItemFishingRodPole() {
		super();
		
		this.setUnlocalizedName("fishingRodPole");
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public static void RegisterItem()
    {
		ModItems.registerItem(RegisteredItem);
		Reference.ModItems.add(ItemFishingRodPole.RegisteredItem);
    }
}
