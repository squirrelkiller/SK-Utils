package com.squirrelkiller.utilities;

//import com.squirrelkiller.utilities.init.ModItems;
import com.squirrelkiller.utilities.init.ModRecipes;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class SKUtilities {

	//@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	//public static CommonProxy proxy;
    
    @Instance(value = Reference.MOD_ID)
    public static SKUtilities instance;
    
    public static boolean slimeRecipe;
    public static boolean alternateBedRecipe;
    public static boolean gravelToFlint;
    public static boolean elytraRecipe;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    	
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
     
        slimeRecipe = config.get("Recipes", "slimeRecipe", true).getBoolean(slimeRecipe);
        alternateBedRecipe = config.get("Recipes", "alternateBedRecipe", true).getBoolean(alternateBedRecipe);
        gravelToFlint = config.get("Recipes", "gravelToFlint", true).getBoolean(gravelToFlint);
        elytraRecipe = config.get("Recipes", "elytraRecipe", true).getBoolean(elytraRecipe);
        
        config.save();
    	
    	//ModItems.init();
    	//ModItems.registerModItem();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//proxy.registerRenders();
    	ModRecipes.addRecipes();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    }
}
