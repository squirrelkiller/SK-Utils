package com.squirrelkiller.utilities.init;

import java.util.Iterator;
import java.util.List;

import com.squirrelkiller.utilities.proxy.CommonProxy;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {
	
	public static void ironNuggetRecipe() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.items.get("Iron_Nugget"), 9), "ingotIron");
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot), "III", "III", "III", 'I', "nuggetIron");
	}
	
	public static void fishingRecipeReplacer() {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
		Iterator<IRecipe> remover = recipes.iterator();
		
		while(remover.hasNext()) {
			ItemStack itemstack = remover.next().getRecipeOutput();
			if(itemstack != null && itemstack.getItem() == Items.fishing_rod)
				remover.remove();
		}
		
		GameRegistry.addRecipe(new ItemStack(ModItems.items.get("Fishing_Hook")), " I", "II", 'I', "nuggetIron");
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.items.get("Fishing_Rod_Reel")), "ingotIron", "stickWood", "string", "slimeball");
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fishing_rod), ModItems.items.get("Fishing_Rod_Reel"), ModItems.items.get("Fishing_Hook"), "stickWood", "string");
		
	}

	public static void slimeRecipe(){
		GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball), Items.clay_ball, new ItemStack(Items.dye, 1, 15), Items.rotten_flesh);
	}
	
	public static void alternateBedRecipe(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bed),"WW","WL",'W', Blocks.wool,'L', "logWood"));
	}

	public static void elytraRecipe(){
		GameRegistry.addRecipe(new ItemStack(Items.elytra),"LTL","FCF","FEF",'F', "feather",'L', "leather",'T', Items.chorus_fruit,'C', Items.diamond_chestplate,'E', "blockEmerald");

	}
	
	public static void gravelToFlint(){
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint),"gravel");
	}
	
	public static void burningWoodSwordRecipe(){
		ItemStack burningSword = new ItemStack(Items.wooden_sword);
		burningSword.addEnchantment(Enchantment.getEnchantmentByID(20), 1);
		GameRegistry.addShapelessRecipe(burningSword, Items.wooden_sword, "torch");
	}
	
	public static void addRecipes() {
		if (CommonProxy.slimeRecipe) {
			slimeRecipe();
		}
		
		if (CommonProxy.alternateBedRecipe) {
			alternateBedRecipe();
		}
		
		if (CommonProxy.elytraRecipe) {
			elytraRecipe();
		}
		
		if (CommonProxy.gravelToFlint){
			gravelToFlint();
		}
		
		if (CommonProxy.burningWoodSwordRecipe) {
			burningWoodSwordRecipe();
		}
		
		if (CommonProxy.ironNugget) {
			ironNuggetRecipe();
		}
		
		if (CommonProxy.harderFishingRod) {
			fishingRecipeReplacer();
		}
	}
	
}
