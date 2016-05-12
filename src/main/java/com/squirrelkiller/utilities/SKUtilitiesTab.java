package com.squirrelkiller.utilities;

import com.squirrelkiller.utilities.init.ModItems;
import com.squirrelkiller.utilities.item.Item_Mod_Icon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SKUtilitiesTab extends CreativeTabs {

	public SKUtilitiesTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ModItems.modIcon;
	}

}
