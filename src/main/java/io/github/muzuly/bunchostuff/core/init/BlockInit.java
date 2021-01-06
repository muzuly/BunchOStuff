package io.github.muzuly.bunchostuff.core.init;

import io.github.muzuly.bunchostuff.BunchOStuff;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			BunchOStuff.MOD_ID);
	
	public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK).hardnessAndResistance(0.1f).sound(SoundType.NETHER_BRICK)));
}
