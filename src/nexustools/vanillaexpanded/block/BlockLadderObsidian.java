package nexustools.vanillaexpanded.block;

import net.minecraft.block.BlockLadder;

public class BlockLadderObsidian extends BlockLadder {
	public BlockLadderObsidian(int id) {
		super(id, 1);
	}
	
	@Override
	public String getTextureFile() {
		return "/nexustools/vanillaexpanded/images/block/block.png";
	}
}
