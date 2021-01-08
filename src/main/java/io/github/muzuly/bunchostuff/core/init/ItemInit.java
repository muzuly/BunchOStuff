package io.github.muzuly.bunchostuff.core.init;

import io.github.muzuly.bunchostuff.BunchOStuff;




import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Foods;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import io.github.muzuly.bunchostuff.common.items.InstantHealthRing;
import io.github.muzuly.bunchostuff.core.enums.ToolMaterialList;
import io.github.muzuly.bunchostuff.common.items.EmeraldSword;
import io.github.muzuly.bunchostuff.common.items.FlightRing;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			BunchOStuff.MOD_ID);
	
	public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> IRON_RING_ITEM = ITEMS.register("iron_ring_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<Item> GOLD_RING_ITEM = ITEMS.register("gold_ring_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<Item> DIAMOND_RING_ITEM = ITEMS.register("diamond_ring_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<Item> INSTANT_HEALTH_PENDANT = ITEMS.register("instant_health_pendant", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<Item> PEACH = ITEMS.register("peach", 
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.APPLE)));
	
	public static final RegistryObject<InstantHealthRing> IRON_INSTANT_HEALTH_RING = ITEMS.register("iron_instant_health_ring", 
			() -> new InstantHealthRing(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<FlightRing> IRON_FLIGHT_RING = ITEMS.register("iron_flight_ring",
			() -> new FlightRing(new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1)));
			
	public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", 
			() -> new EmeraldSword(ToolMaterialList.EMERALD_MATERIAL, 1, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
			
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