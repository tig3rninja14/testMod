package com.tiger.testMod;

import com.tiger.testMod.gen.OreGen;
import com.tiger.testMod.init.ModBlocks;
import com.tiger.testMod.init.ModItems;
import com.tiger.testMod.init.ModRecipes;
import com.tiger.testMod.proxy.CommonProxy;
import com.tiger.testMod.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod
(
	modid = Reference.MOD_ID,
	name = Reference.NAME,
	version = Reference.VERSION,
	dependencies = Reference.DEPENCIES,
	updateJSON = Reference.UPDATE_JSON
)
public class Main {
	
	
	@Instance
	public static Main instance;
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		System.out.println(Reference.MOD_ID + ":preInit");
		ModItems.init();
		ModBlocks.init();
	}
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		System.out.println(Reference.MOD_ID + ":init");
		ModRecipes.init();
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		System.out.println(Reference.MOD_ID + ":postInit");
		//Checking the version check results
		//System.out.println(ForgeVersion.getResult(Loader.instance().activeModContainer()).status);
		//comment
	}
	
}
