package net.nexustools.vanillaexpanded.block;

import net.minecraft.block.BlockLever;
import net.nexustools.vanillaexpanded.VanillaExpanded;

public class BlockLeverObsidian extends BlockLever {
	public BlockLeverObsidian(int id) {
		super(id, 48); //The BlockLever is hard-coded so that the index - 16 is the base of the lever, and the index is the shaft of the lever.
	}
	
	@Override
	public String getTextureFile() {
		return VanillaExpanded.BLOCK_TEXTURE_LOCATION;
	}
}
