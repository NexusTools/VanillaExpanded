package nexustools.vanillaexpanded.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;

import nexustools.vanillaexpanded.VanillaExpanded;

public class BlockDoorObsidian extends BlockDoor {
	public BlockDoorObsidian(int id) {
		super(id, Block.obsidian.blockMaterial);
		this.blockIndexInTexture = Block.obsidian.blockIndexInTexture;
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return (par1 & 8) != 0 ? 0 : VanillaExpanded.itemDoorObsidian.itemID;
	}
}