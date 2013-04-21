package nexustools.vanillaexpanded;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import nexustools.vanillaexpanded.block.BlockButtonObsidian;
import nexustools.vanillaexpanded.block.BlockDoorObsidian;
import nexustools.vanillaexpanded.block.BlockStairsObsidian;
import nexustools.vanillaexpanded.item.ItemDoorObsidian;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "VanillaExpanded")
@NetworkMod(clientSideRequired = true)
public class VanillaExpanded {
	public static boolean blockButtonObsidianEnabled = true, blockStairObsidianEnabled = true, blockDoorObsidianEnabled = true;
	public static int blockButtonObsidianID, blockStairObsidianID, blockDoorObsidianID;
	public static Block blockButtonObsidian, blockStairObsidian, blockDoorObsidian;

	public static int itemDoorObsidianID;
	
	public static Item itemDoorObsidian;
	
	public static double obisidanAdditionHardness;

	@PreInit
	public void preload(FMLPreInitializationEvent iEvent) {
		Configuration conf = new Configuration(iEvent.getSuggestedConfigurationFile());
		conf.load();
		blockButtonObsidianID = conf.getBlock("blockButtonObsidianID", 675).getInt();
		blockStairObsidianID = conf.getBlock("blockStairObsidianID", 676).getInt();
		blockDoorObsidianID = conf.getBlock("blockDoorObsidianID", 677).getInt();
		
		itemDoorObsidianID = conf.getItem("itemDoorObsidianID", 6550).getInt();

		blockButtonObsidianEnabled = conf.get("Obsidian Additions", "blockButtonObsidianEnabled", blockButtonObsidianEnabled).getBoolean(true);
		blockStairObsidianEnabled = conf.get("Obsidian Additions", "blockStairObsidianEnabled", blockStairObsidianEnabled).getBoolean(true);
		blockDoorObsidianEnabled = conf.get("Obsidian Additions", "blockDoorObsidianEnabled", blockDoorObsidianEnabled).getBoolean(true);
		obisidanAdditionHardness = conf.get("Obsidian Additions", "obisidanAdditionHardness", obisidanAdditionHardness).getDouble(Block.obsidian.getBlockHardness(null, 0, 0, 0) /* The arguments are irrelevant, not used and is very odd that there's no statically available method... */);
		conf.save();
	}

	@Init
	public void load(FMLInitializationEvent iEvent) {
		if(blockButtonObsidianEnabled) {
			blockButtonObsidian = new BlockButtonObsidian(blockButtonObsidianID).setBlockName("blockButtonObsidian").setHardness((float) obisidanAdditionHardness);
			GameRegistry.registerBlock(blockButtonObsidian, "blockButtonObsidian");
			LanguageRegistry.addName(blockButtonObsidian, "Obsidian Button");
		}

		if(blockStairObsidianEnabled) {
			blockStairObsidian = new BlockStairsObsidian(blockStairObsidianID, Block.obsidian).setBlockName("blockStairObsidian").setHardness((float) obisidanAdditionHardness);
			GameRegistry.registerBlock(blockStairObsidian, "blockStairObsidian");
			LanguageRegistry.addName(blockStairObsidian, "Obsidian Stairs");
		}

		if(blockDoorObsidianEnabled) {
			blockDoorObsidian = new BlockDoorObsidian(blockDoorObsidianID).setBlockName("blockDoorObsidian").setHardness((float) obisidanAdditionHardness);
			GameRegistry.registerBlock(blockDoorObsidian, "blockDoorObsidian");
			LanguageRegistry.addName(blockDoorObsidian, "Obsidian Door");
			
			itemDoorObsidian = new ItemDoorObsidian(itemDoorObsidianID).setItemName("itemDoorObsidianID");
			LanguageRegistry.addName(itemDoorObsidian, "Obsidian Door");
		}
	}
}