package com.squirrelkiller.utilities.init;

import com.squirrelkiller.utilities.items.ItemFishingRodPole;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static <T extends Item> T registerItem(T item) {
		GameRegistry.register(item);
		
		return item;
	}
	
	public static void RegisterModItems() {
		ItemFishingRodPole.RegisterItem();
	}
}
