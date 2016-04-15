package com.squirrelkiller.utilities.init;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.squirrelkiller.utilities.Reference;
import com.squirrelkiller.utilities.items.ModItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModItems {
 
    public static Map<String, ModItem> items = new HashMap<String, ModItem>(); //Allows me to store the items somewhere seeing as I am not setting variables to equal the object
    public static ArrayList<String> itemKeys = new ArrayList<String>();
   
    public static void RegisterRender(Item item){
    	String temp = item.getUnlocalizedName().substring(5);
		ModelResourceLocation location = new ModelResourceLocation(Reference.MOD_ID.toLowerCase() + ":" + temp, "inventory");

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, location);
    }
    
    public static void setupVariousItems() {
        new ModItem("Fishing_Rod_Pole");
        new ModItem("Ant");
        new ModItem("Cooked_Ant");
        new ModItem("Fishing_Rod_Reel");
    }
}
