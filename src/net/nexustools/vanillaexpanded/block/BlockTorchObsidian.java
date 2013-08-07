package net.nexustools.vanillaexpanded.block;

import net.minecraft.block.BlockTorch;
import net.nexustools.vanillaexpanded.VanillaExpanded;

public class BlockTorchObsidian extends BlockTorch {
	public BlockTorchObsidian(int id) {
		super(id, 3);
	}
	
	public String getTextureFile() {
		return VanillaExpanded.BLOCK_TEXTURE_LOCATION;
	}
}
