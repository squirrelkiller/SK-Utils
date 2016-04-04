package com.squirrelkiller.utilities.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {

	public static void slimeRecipe() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball), Items.clay_ball, new ItemStack(Items.dye, 1, 15), Items.rotten_flesh);
		
	}
	
	public static void alternateBedRecipe() {
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bed),"WW","WL",'W', Blocks.wool,'L', "logWood"));
		
	}

	public static void elytraRecipe() {
		
		GameRegistry.addRecipe(new ItemStack(Items.elytra),"LTL","FCF","FEF",'F', Items.feather,'L', Items.leather,'T', Items.chorus_fruit,'C', Items.diamond_chestplate,'E', Blocks.emerald_block);

	}
	
	public static void addRecipes() {
		
		slimeRecipe();
		alternateBedRecipe();
		elytraRecipe();
		
	}
	
}
