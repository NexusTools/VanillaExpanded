package nexustools.vanillaexpanded.item;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import nexustools.vanillaexpanded.VanillaExpanded;

public class ItemDoorObsidian extends ItemDoor {
	public ItemDoorObsidian(int id) {
		super(id, Material.rock);
	}

	@Override
	public boolean onItemUse(ItemStack is, EntityPlayer p, World w, int x, int y, int z, int meta, float par8, float par9, float par10) {
		if(meta != 1) {
			return false;
		} else {
			++y;
			if(p.canPlayerEdit(x, y, z, meta, is) && p.canPlayerEdit(x, y + 1, z, meta, is)) {
				if(!VanillaExpanded.blockDoorObsidian.canPlaceBlockAt(w, x, y, z)) {
					return false;
				} else {
					int var12 = MathHelper.floor_double((double) ((p.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
					placeDoorBlock(w, x, y, z, var12, VanillaExpanded.blockDoorObsidian);
					--is.stackSize;
					return true;
				}
			} else {
				return false;
			}
		}
	}
}
