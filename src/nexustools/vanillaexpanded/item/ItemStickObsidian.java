package nexustools.vanillaexpanded.item;

import net.minecraft.item.Item;

public class ItemStickObsidian extends Item {
	public ItemStickObsidian(int id) {
		super(id);
		this.iconIndex = 0;
	}
	
	@Override
	public String getTextureFile() {
		return "/nexustools/vanillaexpanded/images/item/item.png";
	}
}
