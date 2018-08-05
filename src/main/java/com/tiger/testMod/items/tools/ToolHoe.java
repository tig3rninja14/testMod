package com.tiger.testMod.items.tools;

import com.tiger.testMod.Main;
import com.tiger.testMod.init.ModItems;
import com.tiger.testMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel{

	public ToolHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0 , "inventory");
	}

}
