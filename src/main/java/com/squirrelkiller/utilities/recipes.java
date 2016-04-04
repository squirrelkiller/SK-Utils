package com.squirrelkiller.utilities;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class recipes {

	public static void addRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball), Items.clay_ball, new ItemStack(Items.dye, 1, 15), Items.rotten_flesh);
	
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bed),"WW","WL",'W', Blocks.wool,'L', "logWood"));
		
		GameRegistry.addRecipe(new ItemStack(Items.elytra),"LTL","FCF","FEF",'F', Items.feather,'L', Items.leather,'T', Items.chorus_fruit,'C', Items.diamond_chestplate,'E', Blocks.emerald_block);
		
		
	}

}
