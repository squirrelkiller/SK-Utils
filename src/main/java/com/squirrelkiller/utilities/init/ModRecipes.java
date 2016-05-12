package com.squirrelkiller.utilities.init;

import java.util.Iterator;
import java.util.List;

import com.squirrelkiller.utilities.SKUtilities;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes {
	
	public static void ironNuggetRecipe() {
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ironNugget), 9, "ingotIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot), "III", "III", "III", 'I', "nuggetIron"));
	}
	
	public static void fishingRecipeReplacer() {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
		Iterator<IRecipe> remover = recipes.iterator();
		
		while(remover.hasNext()) {
			ItemStack itemstack = remover.next().getRecipeOutput();
			if(itemstack != null && itemstack.getItem() == Items.fishing_rod)
				remover.remove();
		}
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.fishingHook), " I", "II", 'I', "nuggetIron"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.fishingRodReel), "ingotIron", "stickWood", "string", "slimeball"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.fishing_rod), ModItems.fishingRodReel, ModItems.fishingHook, "stickWood", "string"));
		
	}

	public static void slimeRecipe(){
		GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball), Items.clay_ball, new ItemStack(Items.dye, 1, 15), Items.rotten_flesh);
	}
	
	public static void alternateBedRecipe(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bed),"WW","WL",'W', Blocks.wool,'L', "logWood"));
	}

	public static void elytraRecipe(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.elytra),"LTL","FCF","FEF",'F', "feather",'L', "leather",'T', Items.chorus_fruit,'C', Items.diamond_chestplate,'E', "blockEmerald"));

	}
	
	public static void gravelToFlint(){
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.flint),"gravel"));
	}
	
	public static void burningWoodSwordRecipe(){
		ItemStack burningSword = new ItemStack(Items.wooden_sword);
		burningSword.addEnchantment(Enchantment.getEnchantmentByID(20), 1);
		GameRegistry.addRecipe(new ShapelessOreRecipe(burningSword, Items.wooden_sword, "torch"));
	}
	
	public static void addRecipes() {
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
		
		if (SKUtilities.ironNugget) {
			ironNuggetRecipe();
		}
		
		if (SKUtilities.harderFishingRod) {
			fishingRecipeReplacer();
		}
	}
	
}
