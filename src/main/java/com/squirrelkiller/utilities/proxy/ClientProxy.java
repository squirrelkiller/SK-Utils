package com.squirrelkiller.utilities.proxy;

import com.squirrelkiller.utilities.client.model.ModModelManager;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy implements IProxy {

	//private final Minecraft minecraft = Minecraft.getMinecraft();

	@Override
	public void preInit() {
		ModModelManager.INSTANCE.registerAllModels();
	}

	@Override
	public void init() {

	}

	@Override
	public void postInit() {

	}

}
