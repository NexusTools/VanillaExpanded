package nexustools.vanillaexpanded;

import net.minecraft.block.Block;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.Configuration;
import nexustools.vanillaexpanded.block.BlockButtonObsidian;
import cpw.mods.fml.common.FMLCommonHandler;
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
	public static boolean blockButtonObsidianEnabled = true;
	
	public static int blockButtonObsidianID;
	
	public static Block blockButtonObsidian;
	
	@PreInit
	public void preload(FMLPreInitializationEvent iEvent) {
		if(FMLCommonHandler.instance().getSide().isClient()) {
			MinecraftForgeClient.preloadTexture("/nexustools/vanillaexpanded/images/block/blocksheet.png");
		}
		Configuration conf = new Configuration(iEvent.getSuggestedConfigurationFile());
		conf.load();
		blockButtonObsidianID = conf.getBlock("blockButtonObsidianID", 675).getInt();
		blockButtonObsidianEnabled = conf.get("Vanilla Expanded", "blockButtonObsidianEnabled", blockButtonObsidianEnabled).getBoolean(true);
		conf.save();
	}
	
	@Init
	public void load(FMLInitializationEvent iEvent) {
		if(blockButtonObsidianEnabled) {
			blockButtonObsidian = new BlockButtonObsidian(blockButtonObsidianID, 0).setBlockName("blockButtonObsidian");
			GameRegistry.registerBlock(blockButtonObsidian, "blockButtonObsidian");
			LanguageRegistry.addName(blockButtonObsidian, "Obsidian Button");
		}
	}
}