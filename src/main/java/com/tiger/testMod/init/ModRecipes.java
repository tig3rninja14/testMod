package com.tiger.testMod.init;

import com.tiger.testMod.util.Reference;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModRecipes 
{
	public static void init()
	{
		//GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModBlocks.RUBY_BLOCK, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 2.0F);
	}
	
}
