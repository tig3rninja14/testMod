package com.tiger.testMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyOre extends BlockBase{

	public RubyOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe",2);
		setLightLevel(0.0F);
		setLightOpacity(0);
	}

}
