package com.tiger.testMod.init;

import com.tiger.testMod.blocks.RubyBlock;
import com.tiger.testMod.blocks.RubyOre;
import com.tiger.testMod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModBlocks 
{
	
	public static Block RUBY_BLOCK;
	public static Block RUBY_ORE;
	
	public static void init() {
		RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
		RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll(RUBY_BLOCK);
		event.getRegistry().registerAll(RUBY_ORE);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) 
	{
		 event.getRegistry().registerAll(new ItemBlock(RUBY_BLOCK).setRegistryName(RUBY_BLOCK.getRegistryName()));
		 event.getRegistry().registerAll(new ItemBlock(RUBY_ORE).setRegistryName(RUBY_ORE.getRegistryName())); 
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) 
	{
		registerRender(Item.getItemFromBlock(RUBY_BLOCK));
		registerRender(Item.getItemFromBlock(RUBY_ORE));
	}
	
	public static void registerRender(Item item) 
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
