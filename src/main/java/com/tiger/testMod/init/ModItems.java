package com.tiger.testMod.init;

import java.util.ArrayList;
import java.util.List;

import com.tiger.testMod.items.ItemBase;
import com.tiger.testMod.items.armor.ArmorBase;
import com.tiger.testMod.items.tools.ToolAxe;
import com.tiger.testMod.items.tools.ToolHoe;
import com.tiger.testMod.items.tools.ToolPickaxe;
import com.tiger.testMod.items.tools.ToolSpade;
import com.tiger.testMod.items.tools.ToolSword;
import com.tiger.testMod.util.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class ModItems 
{
	
	//Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0F, 3.0F, 10); 
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14,
													 new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	
	//Items
	public static Item RUBY;
	
	//Tools
	public static ItemSword RUBY_SWORD;  
	public static ItemSpade RUBY_SHOVEL;  
	public static ItemPickaxe RUBY_PICKAXE;  
	public static ItemAxe RUBY_AXE; 
	public static ItemHoe RUBY_HOE;
	
	//Armor
	public static Item RUBY_HELMET;  
	public static Item RUBY_CHESTPLATE; 
	public static Item RUBY_LEGGINGS;
	public static Item RUBY_BOOTS;
	
	
	
	public static void init() {
		//Basic Item
		RUBY = new ItemBase("ruby").setCreativeTab(CreativeTabs.MATERIALS);
		
		//Ruby Tools
		RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
		RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
		RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
		RUBY_AXE = new ToolAxe("ruby_axe",MATERIAL_RUBY);
		RUBY_HOE = new ToolHoe("ruby_hoe",MATERIAL_RUBY);
		
		//Ruby Armor
		RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
		RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
		RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
		RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
		
	
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(RUBY);
		
		
		event.getRegistry().registerAll(RUBY_SWORD);
		event.getRegistry().registerAll(RUBY_SHOVEL);
		event.getRegistry().registerAll(RUBY_PICKAXE);
		event.getRegistry().registerAll(RUBY_AXE);
		event.getRegistry().registerAll(RUBY_HOE);
		
		
		event.getRegistry().registerAll(RUBY_HELMET);
		event.getRegistry().registerAll(RUBY_CHESTPLATE);
		event.getRegistry().registerAll(RUBY_LEGGINGS);
		event.getRegistry().registerAll(RUBY_BOOTS);
	}
	
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(RUBY);
		
		
		registerRender(RUBY_SWORD);
		registerRender(RUBY_SHOVEL);
		registerRender(RUBY_PICKAXE);
		registerRender(RUBY_AXE);
		registerRender(RUBY_HOE);
		
		
		
		registerRender(RUBY_HELMET);
		registerRender(RUBY_CHESTPLATE);
		registerRender(RUBY_LEGGINGS);
		registerRender(RUBY_BOOTS);
		
		
		
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
	
}
