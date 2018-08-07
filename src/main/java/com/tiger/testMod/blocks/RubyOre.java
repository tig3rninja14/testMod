package com.tiger.testMod.blocks;

import com.tiger.testMod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RubyOre extends BlockOreBase{
	
	private static Item toDrop = ModItems.RUBY;
	private static int dropAmount = 3;
	public RubyOre(String name, Material material) {
		super(name, material, toDrop, dropAmount);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe",2);
		setLightLevel(0.0F);
		setLightOpacity(0);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
