package com.squirrelkiller.utilities.proxy;

import com.squirrelkiller.utilities.items.ItemRenderRegister;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders()
	{
		ItemRenderRegister.registerItemRenderer();
		
	}
}
