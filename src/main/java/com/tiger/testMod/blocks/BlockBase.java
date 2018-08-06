package com.tiger.testMod.blocks;

import com.tiger.testMod.Main;
import com.tiger.testMod.init.ModBlocks;
import com.tiger.testMod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	

}
