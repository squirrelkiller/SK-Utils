package com.squirrelkiller.utilities;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Reference {
    public static final String MOD_ID = "skutilities";
    public static final String MOD_NAME = "SK Utilties";
    public static final String VERSION = "1.0";
    public static final String CLIENT_PROXY_CLASS = "com.squirrelkiller.utilities.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.squirrelkiller.utilities.proxy.CommonProxy";
    public static ArrayList<Item> ModItems = new ArrayList<Item>();
	public static ArrayList<Block> ModBlocks = new ArrayList<Block>();
}
