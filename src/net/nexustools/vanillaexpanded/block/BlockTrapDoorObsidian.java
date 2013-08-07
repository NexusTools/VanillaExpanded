package net.nexustools.vanillaexpanded.block;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.nexustools.vanillaexpanded.VanillaExpanded;

public class BlockTrapDoorObsidian extends BlockTrapDoor {
	public BlockTrapDoorObsidian(int id) {
		super(id, Material.rock);
		this.blockIndexInTexture = 2;
	}
	
	public String getTextureFile() {
		return VanillaExpanded.BLOCK_TEXTURE_LOCATION;
	}
}
