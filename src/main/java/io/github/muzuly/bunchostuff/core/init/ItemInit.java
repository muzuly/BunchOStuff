package io.github.muzuly.bunchostuff.core.init;

import io.github.muzuly.bunchostuff.BunchOStuff;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Foods;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import io.github.muzuly.bunchostuff.common.items.EmeraldTools.EmeraldAxe;
import io.github.muzuly.bunchostuff.common.items.EmeraldTools.EmeraldHoe;
import io.github.muzuly.bunchostuff.common.items.EmeraldTools.EmeraldPickaxe;
import io.github.muzuly.bunchostuff.common.items.EmeraldTools.EmeraldShovel;
import io.github.muzuly.bunchostuff.common.items.EmeraldTools.EmeraldSword;
//import io.github.muzuly.bunchostuff.common.items.EndTools.EndAxe;
//import io.github.muzuly.bunchostuff.common.items.EndTools.EndHoe;
//import io.github.muzuly.bunchostuff.common.items.EndTools.EndPickaxe;
//import io.github.muzuly.bunchostuff.common.items.EndTools.EndShovel;
//import io.github.muzuly.bunchostuff.common.items.EndTools.EndSword;
import io.github.muzuly.bunchostuff.common.items.ObsidianTools.ObsidianAxe;
import io.github.muzuly.bunchostuff.common.items.ObsidianTools.ObsidianHoe;
import io.github.muzuly.bunchostuff.common.items.ObsidianTools.ObsidianPickaxe;
import io.github.muzuly.bunchostuff.common.items.ObsidianTools.ObsidianShovel;
import io.github.muzuly.bunchostuff.common.items.ObsidianTools.ObsidianSword;
import io.github.muzuly.bunchostuff.common.items.Rings.FlightRing;
import io.github.muzuly.bunchostuff.common.items.Rings.InstantHealthRing;
import io.github.muzuly.bunchostuff.core.enums.ToolMaterialList;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			BunchOStuff.MOD_ID);
	
	// ITEMS
	public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> PEACH = ITEMS.register("peach", 
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.APPLE)));
	
	//RINGS & PENDANTS
	public static final RegistryObject<Item> IRON_RING_ITEM = ITEMS.register("iron_ring_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<Item> GOLD_RING_ITEM = ITEMS.register("gold_ring_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<Item> DIAMOND_RING_ITEM = ITEMS.register("diamond_ring_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<Item> INSTANT_HEALTH_PENDANT = ITEMS.register("instant_health_pendant", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));

		public static final RegistryObject<InstantHealthRing> IRON_INSTANT_HEALTH_RING = ITEMS.register("iron_instant_health_ring", 
			() -> new InstantHealthRing(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<FlightRing> IRON_FLIGHT_RING = ITEMS.register("iron_flight_ring",
			() -> new FlightRing(new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1)));
	
	//TOOLS
	//EMERALD TOOLS
	public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", 
			() -> new EmeraldSword(ToolMaterialList.EMERALD_MATERIAL, 4, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", 
			() -> new EmeraldShovel(ToolMaterialList.EMERALD_MATERIAL, 2.5f, -3.0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", 
			() -> new EmeraldPickaxe(ToolMaterialList.EMERALD_MATERIAL, 2, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", 
			() -> new EmeraldAxe(ToolMaterialList.EMERALD_MATERIAL, 7f, -3f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", 
			() -> new EmeraldHoe(ToolMaterialList.EMERALD_MATERIAL, -1, 0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	//END TOOLS
//	public static final RegistryObject<Item> END_SWORD = ITEMS.register("end_sword", 
//			() -> new EndSword(ToolMaterialList.EMERALD_MATERIAL, 4, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
	
//	public static final RegistryObject<Item> END_SHOVEL = ITEMS.register("end_shovel", 
//			() -> new EndShovel(ToolMaterialList.EMERALD_MATERIAL, 2.5f, -3.0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
//	public static final RegistryObject<Item> END_PICKAXE = ITEMS.register("end_pickaxe", 
//			() -> new EndPickaxe(ToolMaterialList.EMERALD_MATERIAL, 2, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)));
	
//	public static final RegistryObject<Item> END_AXE = ITEMS.register("end_axe", 
//			() -> new EndAxe(ToolMaterialList.EMERALD_MATERIAL, 6.5f, -3f, new Item.Properties().group(ItemGroup.TOOLS)));
	
//	public static final RegistryObject<Item> END_HOE = ITEMS.register("end_hoe", 
//			() -> new EndHoe(ToolMaterialList.EMERALD_MATERIAL, -1, -.5f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	//OBSIDIAN TOOLS
	public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", 
			() -> new ObsidianSword(ToolMaterialList.OBSIDIAN_MATERIAL, 5, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", 
			() -> new ObsidianShovel(ToolMaterialList.OBSIDIAN_MATERIAL, 3.5f, -3.0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", 
			() -> new ObsidianPickaxe(ToolMaterialList.OBSIDIAN_MATERIAL, 3, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", 
			() -> new ObsidianAxe(ToolMaterialList.OBSIDIAN_MATERIAL, 7f, -3f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", 
			() -> new ObsidianHoe(ToolMaterialList.OBSIDIAN_MATERIAL, -1, 0f, new Item.Properties().group(ItemGroup.TOOLS)));
			
	// BLOCK ITEMS
	public static final RegistryObject<BlockItem> TEST_BLOCK = ITEMS.register("test_block", 
			() -> new BlockItem(BlockInit.TEST_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BLOODY_COBBLESTONE = ITEMS.register("bloody_cobblestone", 
			() -> new BlockItem(BlockInit.BLOODY_COBBLESTONE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BLUE_PLANKS = ITEMS.register("blue_planks", 
			() -> new BlockItem(BlockInit.BLUE_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> RED_PLANKS = ITEMS.register("red_planks", 
			() -> new BlockItem(BlockInit.RED_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

}