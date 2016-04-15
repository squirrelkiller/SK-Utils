package com.squirrelkiller.utilities.init;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.squirrelkiller.utilities.items.ModItem;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
 
    public static Map<String, ModItem> items = new HashMap<String, ModItem>(); //Allows me to store the items somewhere seeing as I am not setting variables to equal the object
    public static ArrayList<String> itemKeys = new ArrayList<String>();
    
    public static void setupVariousItems() {
    	new ModItem("Mod_Icon");
        new ModItem("Ant");
        new ModItem("Cooked_Ant");
        new ModItem("Fishing_Rod_Reel");
        new ModItem("Fishing_Hook");
        new ModItem("Iron_Nugget");
        OreDictionary.registerOre("nuggetIron", new ItemStack(ModItems.items.get("Iron_Nugget")));
    }
    
    @SideOnly(Side.CLIENT)
    public static void initClient(){ //This assumes you are using the hashmap thing I mentioned in the last set
        for(int i = 0; i<items.size();i++){
            items.get(itemKeys.get(i)).initModel();
        }
    }
    
}
