package com.tiger.testMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	

}
