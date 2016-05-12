package com.squirrelkiller.utilities.proxy;

import net.minecraft.entity.player.EntityPlayer;

public interface IProxy {
	void preInit();

	void init();

	void postInit();

}