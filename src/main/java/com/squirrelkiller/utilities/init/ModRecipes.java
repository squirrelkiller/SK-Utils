package com.squirrelkiller.utilities.init;

import com.squirrelkiller.utilities.SKUtilities;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {

	public static void slimeRecipe()
	{
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball), Items.clay_ball, new ItemStack(Items.dye, 1, 15), Items.rotten_flesh);
		
	}
	
	public static void alternateBedRecipe()
	{
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bed),"WW","WL",'W', Blocks.wool,'L', "logWood"));
		
	}

	public static void elytraRecipe()
	{
		
		GameRegistry.addRecipe(new ItemStack(Items.elytra),"LTL","FCF","FEF",'F', Items.feather,'L', Items.leather,'T', Items.chorus_fruit,'C', Items.diamond_chestplate,'E', Blocks.emerald_block);

	}
	
	public static void gravelToFlint()
	{
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint),Blocks.gravel);
		
	}
	
	public static void burningWoodSwordRecipe()
	{
		
		ItemStack burningSword = new ItemStack(Items.wooden_sword);
		burningSword.addEnchantment(Enchantment.getEnchantmentByID(20), 1);
		GameRegistry.addShapelessRecipe(burningSword, Items.wooden_sword, Blocks.torch);
		
	}
	
	public static void addRecipes() 
	{
		
		if (SKUtilities.slimeRecipe) {
			slimeRecipe();
		}
		
		if (SKUtilities.alternateBedRecipe) {
			alternateBedRecipe();
		}
		
		if (SKUtilities.elytraRecipe) {
			elytraRecipe();
		}
		
		if (SKUtilities.gravelToFlint){
			gravelToFlint();
		}
		
		if (SKUtilities.burningWoodSwordRecipe) {
			burningWoodSwordRecipe();
		}

	}
	
}
