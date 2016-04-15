package com.squirrelkiller.utilities.items;

import com.squirrelkiller.utilities.Reference;
import com.squirrelkiller.utilities.SKUtilities;
import com.squirrelkiller.utilities.init.ModItems;
import com.sun.webkit.ThemeClient;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItem extends Item{
 
    public ModItem(String name){
        super(); //Running the constructor for the default Item class in minecraft
        this.setUnlocalizedName(name); //Setting the name
        this.setCreativeTab(SKUtilities.tabSKUtilities); //Setting the creative tab
        GameRegistry.registerItem(this,name); //Registering it with forge
        ModItems.itemKeys.add(name); //Item registry stuff, so I can use the items later
        ModItems.items.put(name,this); //Can get the item like so ModItems.items.get(name);
       
        //Below is an example of how I handle things for specific items
        
        /*if(name.equals("caveEnergyUpgrade")){
            this.maxStackSize = 8;
        }*/
        
    }
 
    @SideOnly(Side.CLIENT)
    public void initModel() {
      final ModelResourceLocation resource = new ModelResourceLocation(Reference.MOD_ID.toLowerCase() + ":"+getUnlocalizedName().substring(5), "inventory");
      ModelBakery.registerItemVariants(this,resource);
      ModelLoader.setCustomMeshDefinition(this, new ItemMeshDefinition() {
           @Override
           public ModelResourceLocation getModelLocation(ItemStack stack) {
                 return resource;
           }
      });
    }
    
    //Override default methods below here if necessary
}