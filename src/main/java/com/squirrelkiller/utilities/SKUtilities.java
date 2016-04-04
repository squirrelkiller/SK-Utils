package com.squirrelkiller.utilities;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SKUtilities.MODID, version = SKUtilities.VERSION)
public class SKUtilities {
    public static final String MODID = "SKUtilities";
    public static final String MODNAME = "SK Utilties";
    public static final String VERSION = "1.0";
    
    @Instance(value = SKUtilities.MODID)
    public static SKUtilities instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	recipes.addRecipes();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    }
}
