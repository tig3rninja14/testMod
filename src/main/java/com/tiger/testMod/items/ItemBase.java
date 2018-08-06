package com.tiger.testMod.items;

import com.tiger.testMod.Main;
import com.tiger.testMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item 
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
