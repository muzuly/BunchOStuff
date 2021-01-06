package io.github.muzuly.bunchostuff.core.init;

import io.github.muzuly.bunchostuff.BunchOStuff;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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
	
	// BLOCK ITEMS
	public static final RegistryObject<BlockItem> TEST_BLOCK = ITEMS.register("test_block", 
			() -> new BlockItem(BlockInit.TEST_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BLOODY_COBBLESTONE = ITEMS.register("bloody_cobblestone", 
			() -> new BlockItem(BlockInit.BLOODY_COBBLESTONE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
