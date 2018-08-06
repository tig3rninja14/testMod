package com.tiger.testMod;

import java.io.File;

import com.tiger.testMod.gen.OreGen;
import com.tiger.testMod.init.ModBlocks;
import com.tiger.testMod.init.ModItems;
import com.tiger.testMod.init.ModRecipes;
import com.tiger.testMod.proxy.CommonProxy;
import com.tiger.testMod.util.Reference;

import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
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
	
	
	@Mod.Instance
	public static Main instance = null;
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		//Adds the config folder for user editing of mod options
		File cfgFolder = event.getModConfigurationDirectory();
		cfgFolder = new File(cfgFolder, "testMod");
		
		System.out.println(Reference.MOD_ID + ":preInit");
		ModItems.init();
		ModBlocks.init();
	}
	@Mod.EventHandler
	public static void init(FMLInitializationEvent event)
	{
		System.out.println(Reference.MOD_ID + ":init");
		ModRecipes.init();
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}
	@Mod.EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		System.out.println(Reference.MOD_ID + ":postInit");
		//Checking the version check results
		//System.out.println(ForgeVersion.getResult(Loader.instance().activeModContainer()).status);
		
	}
	
}
