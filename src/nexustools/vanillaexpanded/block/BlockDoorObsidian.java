package nexustools.vanillaexpanded.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDoorObsidian extends BlockDoor {
	public BlockDoorObsidian(int id) {
		super(id, Block.obsidian.blockMaterial);
		this.blockIndexInTexture = Block.obsidian.blockIndexInTexture;
		setCreativeTab(CreativeTabs.tabRedstone);
	}
}
