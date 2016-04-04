/*package com.squirrelkiller.utilities.init;

import com.squirrelkiller.utilities.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item bedding;
	public static Item bed_frame;
	
	public static void init() {
		bedding = new Item().setUnlocalizedName("bedding");
		bed_frame = new Item().setUnlocalizedName("bed_frame");
	}
	
	public static void registerModItem() {
		GameRegistry.registerItem(bedding, bedding.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bed_frame, bed_frame.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		registerRender(bed_frame);
		registerRender(bedding);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}*/
