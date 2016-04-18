package com.squirrelkiller.utilities.proxy;

import com.squirrelkiller.utilities.init.ModItems;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
	    super.preInit(e); //ModItems is just the name of my class that contains the item registers etc...
	    ModItems.initClient(); //The Method at the top
	    
	}
}
