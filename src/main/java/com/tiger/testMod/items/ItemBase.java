package com.tiger.testMod.items;

import net.minecraft.item.Item;

public class ItemBase extends Item 
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
