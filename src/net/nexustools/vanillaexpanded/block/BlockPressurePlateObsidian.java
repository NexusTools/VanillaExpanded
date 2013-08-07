package net.nexustools.vanillaexpanded.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;

public class BlockPressurePlateObsidian extends BlockPressurePlate {
	public BlockPressurePlateObsidian(int id) {
		super(id, Block.obsidian.blockIndexInTexture, EnumMobType.players, Material.rock);
	}
	
	@Override
	public int tickRate() {
		return 50;
	}
}
