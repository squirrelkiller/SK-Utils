package com.squirrelkiller.utilities;

import com.squirrelkiller.utilities.init.ModItems;
//import com.squirrelkiller.utilities.init.ModItems;
import com.squirrelkiller.utilities.init.ModRecipes;
import com.squirrelkiller.utilities.proxy.CommonProxy;
import com.squirrelkiller.utilities.proxy.IProxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class SKUtilities {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	public static final SKUtilitiesTab tabSKUtilities = new SKUtilitiesTab("tabSKUtilities");

	@Instance(value = Reference.MOD_ID)
	public static SKUtilities instance;
	
	public static SimpleNetworkWrapper network;
    
	//For Configs
	public static boolean slimeRecipe;
    public static boolean alternateBedRecipe;
    public static boolean harderFishingRod;
    public static boolean ironNugget;
    public static boolean gravelToFlint;
    public static boolean elytraRecipe;
    public static boolean burningWoodSwordRecipe;
    public static boolean guideBook;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
     
        slimeRecipe = config.get("Recipes", "slimeRecipe", true).getBoolean(slimeRecipe);
        alternateBedRecipe = config.get("Recipes", "alternateBedRecipe", true).getBoolean(alternateBedRecipe);
        gravelToFlint = config.get("Recipes", "gravelToFlint", true).getBoolean(gravelToFlint);
        elytraRecipe = config.get("Recipes", "elytraRecipe", true).getBoolean(elytraRecipe);
        harderFishingRod = config.get("Recipes", "harderFishingRod", true).getBoolean(harderFishingRod);
        burningWoodSwordRecipe = config.get("Recipes", "burningWoodSwordRecipe", true).getBoolean(burningWoodSwordRecipe);
        ironNugget = config.get("Recipes", "enableMyIronNuggetDisableIfAnotherModAdds", true).getBoolean(ironNugget);        
        config.save();
		
		network = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);

		ModItems.registerItems();

		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.addRecipes();
		
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		proxy.postInit();

	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
	}
}
