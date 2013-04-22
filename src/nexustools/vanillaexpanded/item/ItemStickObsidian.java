package nexustools.vanillaexpanded.item;

import net.minecraft.item.Item;
import nexustools.vanillaexpanded.VanillaExpanded;

public class ItemStickObsidian extends Item {
	public ItemStickObsidian(int id) {
		super(id);
		this.iconIndex = 0;
	}
	
	@Override
	public String getTextureFile() {
		return VanillaExpanded.ITEM_TEXTURE_LOCATION;
	}
}
