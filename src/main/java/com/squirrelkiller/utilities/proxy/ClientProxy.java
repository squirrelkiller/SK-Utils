package com.squirrelkiller.utilities.proxy;

import com.squirrelkiller.utilities.init.ModItems;
import com.squirrelkiller.utilities.items.ModItem;

import akka.io.Tcp.Register;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void RegisterRenders() {
		ModItem.RegisterRender(ModItems.items.get("Ant"));
		ModItem.RegisterRender(ModItems.items.get("Cooked_Ant"));
		ModItem.RegisterRender(ModItems.items.get("Fishing_Rod_Pole"));
		ModItem.RegisterRender(ModItems.items.get("Fishing_Rod_Reel"));
	}
	
}
