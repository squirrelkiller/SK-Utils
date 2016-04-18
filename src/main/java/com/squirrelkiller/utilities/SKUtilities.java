package com.squirrelkiller.utilities;

import com.squirrelkiller.utilities.init.ModItems;
//import com.squirrelkiller.utilities.init.ModItems;
import com.squirrelkiller.utilities.init.ModRecipes;
import com.squirrelkiller.utilities.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class SKUtilities {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static final SKUtilitiesTab tabSKUtilities = new SKUtilitiesTab("tabSKUtilities");

	@Instance(value = Reference.MOD_ID)
	public static SKUtilities instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		proxy.preInit(event);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// proxy.init(event);
		ModRecipes.addRecipes();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
