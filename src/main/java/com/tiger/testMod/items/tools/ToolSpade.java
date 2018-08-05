package com.tiger.testMod.items.tools;

import com.tiger.testMod.Main;
import com.tiger.testMod.init.ModItems;
import com.tiger.testMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel{
	
	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
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
