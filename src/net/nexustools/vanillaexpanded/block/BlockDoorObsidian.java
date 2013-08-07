package net.nexustools.vanillaexpanded.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;

import nexustools.vanillaexpanded.VanillaExpanded;

public class BlockDoorObsidian extends BlockDoor {
	public BlockDoorObsidian(int id) {
		super(id, Block.obsidian.blockMaterial);
		this.blockIndexInTexture = 16;
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return (par1 & 8) != 0 ? 0 : VanillaExpanded.itemDoorObsidian.itemID;
	}
	
	@Override
	public String getTextureFile() {
		return VanillaExpanded.BLOCK_TEXTURE_LOCATION;
	}
}
