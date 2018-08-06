package com.tiger.testMod.blocks;

import java.util.Random;

import com.tiger.testMod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase{
	
	private static int numDrop = 3;

	public RubyOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe",2);
		setLightLevel(0.0F);
		setLightOpacity(0);
	}
	
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return ModItems.RUBY;
		}
	
	public int quantityDropped(Random rand){
		return numDrop;
		}

}
