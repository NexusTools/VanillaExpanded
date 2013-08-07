package net.nexustools.vanillaexpanded.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;

public class BlockButtonObsidian extends BlockButton {
	public BlockButtonObsidian(int id) {
		super(id, Block.obsidian.blockIndexInTexture, false);
	}
	
	@Override
	public int tickRate() {
		return 50;
	}
}
