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
    
    // Variables for controlling the configuration files.
    
    public static boolean slimeRecipe;
    public static boolean alternateBedRecipe;
    public static boolean gravelToFlint;
    public static boolean elytraRecipe;
    public static boolean burningWoodSwordRecipe;
    public static boolean guideBook;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    	
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
     
        slimeRecipe = config.get("Recipes", "slimeRecipe", true).getBoolean(slimeRecipe);
        alternateBedRecipe = config.get("Recipes", "alternateBedRecipe", true).getBoolean(alternateBedRecipe);
        gravelToFlint = config.get("Recipes", "gravelToFlint", true).getBoolean(gravelToFlint);
        elytraRecipe = config.get("Recipes", "elytraRecipe", true).getBoolean(elytraRecipe);
        burningWoodSwordRecipe = config.get("Recipes", "burningWoodSwordRecipe", true).getBoolean(burningWoodSwordRecipe);
        guideBook = config.get("Other", "guideBook", true).getBoolean(guideBook);
        
        config.save();
    	
        ModItems.setupVariousItems();
        
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.RegisterRenders();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    }
}
