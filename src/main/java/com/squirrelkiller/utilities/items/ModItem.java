package com.squirrelkiller.utilities.items;

import com.squirrelkiller.utilities.Reference;
import com.squirrelkiller.utilities.SKUtilities;
import com.squirrelkiller.utilities.init.ModItems;

import akka.io.Tcp.Register;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItem extends Item{
 
    public ModItem(String name){
        super(); //Running the constructor for the default Item class in minecraft
        this.setUnlocalizedName(name); //Setting the name
        this.setCreativeTab(SKUtilities.tabSKUtilities); //Setting the creative tab
        GameRegistry.registerItem(this,name); //Registering it with forge
        ModItems.itemKeys.add(name); //Item registry stuff, so I can use the items later
        ModItems.items.put(name,this); //Can get the item like so ModItems.items.get(name);
       
        //Below is an example of how I handle things for specific items
        
        if(name.equals("caveEnergyUpgrade")){
            this.maxStackSize = 8;
        }
    }
 
    public static void RegisterRender(Item item){
    	String temp = item.getUnlocalizedName();
		ModelResourceLocation location = new ModelResourceLocation(Reference.MOD_ID.toLowerCase() + ":" + temp, "inventory");

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, location);
    }
    
    //Override default methods below here if necessary
}
