package com.tiger.testMod.items.tools;

import com.tiger.testMod.Main;
import com.tiger.testMod.init.ModItems;
import com.tiger.testMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel{
	
	private static float atk_dmg = 6.0F;
	private static float atk_spd = -3.2F;
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, atk_dmg, atk_spd);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		ModItems.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0 , "inventory");
	}
	
	

}
