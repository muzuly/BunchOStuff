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
	
	// BLOCK ITEMS
	public static final RegistryObject<BlockItem> TEST_BLOCK = ITEMS.register("test_block", 
			() -> new BlockItem(BlockInit.TEST_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
