package com.squirrelkiller.utilities;

import com.squirrelkiller.utilities.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SKUtilitiesTab extends CreativeTabs{

	public SKUtilitiesTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ModItems.items.get("Mod_Icon");
	}
	
	
}
