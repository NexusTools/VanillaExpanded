package nexustools.vanillaexpanded.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class BlockFenceObsidian extends BlockFence {
	public BlockFenceObsidian(int id) {
		super(id, Block.obsidian.blockIndexInTexture, Material.rock);
	}
}
