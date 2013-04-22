package nexustools.vanillaexpanded.block;

import net.minecraft.block.BlockLadder;
import nexustools.vanillaexpanded.VanillaExpanded;

public class BlockLadderObsidian extends BlockLadder {
	public BlockLadderObsidian(int id) {
		super(id, 1);
	}
	
	@Override
	public String getTextureFile() {
		return VanillaExpanded.BLOCK_TEXTURE_LOCATION;
	}
}
