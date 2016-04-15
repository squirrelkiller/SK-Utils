package com.squirrelkiller.utilities.proxy;

import com.squirrelkiller.utilities.init.ModItems;
import com.squirrelkiller.utilities.init.ModRecipes;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public static boolean slimeRecipe;
    public static boolean alternateBedRecipe;
    public static boolean harderFishingRod;
    public static boolean ironNugget;
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
        harderFishingRod = config.get("Recipes", "harderFishingRod", true).getBoolean(harderFishingRod);
        burningWoodSwordRecipe = config.get("Recipes", "burningWoodSwordRecipe", true).getBoolean(burningWoodSwordRecipe);
        ironNugget = config.get("Recipes", "enableMyIronNuggetDisableIfAnotherModAdds", true).getBoolean(ironNugget);
        //guideBook = config.get("Other", "guideBook", true).getBoolean(guideBook);
        
        config.save();
    	
        ModItems.setupVariousItems();
        
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	ModRecipes.addRecipes();
    }
}
