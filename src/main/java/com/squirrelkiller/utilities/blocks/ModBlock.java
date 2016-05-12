package com.squirrelkiller.utilities.blocks;

import com.squirrelkiller.utilities.SKUtilities;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ModBlock extends Block{

	public ModBlock(Material material, MapColor mapColor, String blockName) {
		super(material, mapColor);
		setBlockName(this, blockName);
		setCreativeTab(SKUtilities.tabSKUtilities);
	}

	public ModBlock(Material materialIn, String blockName) {
		this(materialIn, materialIn.getMaterialMapColor(), blockName);
	}

	/**
	 * Set the registry name of {@code block} to {@code blockName} and the unlocalised name to the full registry name.
	 *
	 * @param block     The block
	 * @param blockName The block's name
	 */
	public static void setBlockName(Block block, String blockName) {
		block.setRegistryName(blockName);
		block.setUnlocalizedName(block.getRegistryName().toString());
	}
}
