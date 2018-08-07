package com.tiger.testMod.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe{
	
	private static float atk_dmg = 6.0F;
	private static float atk_spd = -3.2F;
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, atk_dmg, atk_spd);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
	}
	

	

}
