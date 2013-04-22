package nexustools.vanillaexpanded;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.Configuration;
import nexustools.vanillaexpanded.block.BlockButtonObsidian;
import nexustools.vanillaexpanded.block.BlockDoorObsidian;
import nexustools.vanillaexpanded.block.BlockFenceGateObsidian;
import nexustools.vanillaexpanded.block.BlockFenceObsidian;
import nexustools.vanillaexpanded.block.BlockLadderObsidian;
import nexustools.vanillaexpanded.block.BlockLeverObsidian;
import nexustools.vanillaexpanded.block.BlockPressurePlateObsidian;
import nexustools.vanillaexpanded.block.BlockStairsObsidian;
import nexustools.vanillaexpanded.block.BlockTorchObsidian;
import nexustools.vanillaexpanded.block.BlockTrapDoorObsidian;
import nexustools.vanillaexpanded.item.ItemDoorObsidian;
import nexustools.vanillaexpanded.item.ItemStickObsidian;
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
	public static final String BLOCK_TEXTURE_LOCATION = "/nexustools/vanillaexpanded/images/block/block.png", ITEM_TEXTURE_LOCATION = "/nexustools/vanillaexpanded/images/item/item.png";
	public static boolean blockButtonObsidianEnabled = true, blockStairObsidianEnabled = true, blockDoorObsidianEnabled = true, blockFenceObsidianEnabled = true, blockFenceGateObsidianEnabled = true, blockLeverObsidianEnabled = true, blockPressurePlateObsidianEnabled = true, blockLadderObsidianEnabled = true, blockTrapDoorObsidianEnabled = true, blockTorchObsidianEnabled = true, blockHollowObsidianEnabled = true;
	public static int blockButtonObsidianID, blockStairObsidianID, blockDoorObsidianID, blockFenceObsidianID, blockFenceGateObsidianID, blockLeverObsidianID, blockPressurePlateObsidianID, blockLadderObsidianID, blockTrapDoorObsidianID, blockTorchObsidianID, blockHollowObsidianID;
	public static Block blockButtonObsidian, blockStairObsidian, blockDoorObsidian, blockFenceObsidian, blockFenceGateObsidian, blockLeverObsidian, blockPressurePlateObsidian, blockLadderObsidian, blockTorchObsidian, blockTrapDoorObsidian, blockHollowObsidian;

	public static int itemDoorObsidianID;
	public static Item itemDoorObsidian;

	public static int itemStickObsidianID;
	public static Item itemStickObsidian;

	public static float obisidanAdditionHardness, hollowObsidianHardness;

	@PreInit
	public void preload(FMLPreInitializationEvent iEvent) {
		if(FMLCommonHandler.instance().getSide().isClient()) {
			MinecraftForgeClient.preloadTexture("/nexustools/vanillaexpanded/images/block/block.png");
			MinecraftForgeClient.preloadTexture("/nexustools/vanillaexpanded/images/item/item.png");
		}
		Configuration conf = new Configuration(iEvent.getSuggestedConfigurationFile());
		conf.load();
		blockButtonObsidianEnabled = conf.get("Obsidian Additions", "blockButtonObsidianEnabled", blockButtonObsidianEnabled).getBoolean(true);
		blockStairObsidianEnabled = conf.get("Obsidian Additions", "blockStairObsidianEnabled", blockStairObsidianEnabled).getBoolean(true);
		blockDoorObsidianEnabled = conf.get("Obsidian Additions", "blockDoorObsidianEnabled", blockDoorObsidianEnabled).getBoolean(true);
		blockFenceObsidianEnabled = conf.get("Obsidian Additions", "blockFenceObsidianEnabled", blockFenceObsidianEnabled).getBoolean(true);
		blockFenceGateObsidianEnabled = conf.get("Obsidian Additions", "blockFenceGateObsidianEnabled", blockFenceGateObsidianEnabled).getBoolean(true);
		blockLeverObsidianEnabled = conf.get("Obsidian Additions", "blockLeverObsidianEnabled", blockLeverObsidianEnabled).getBoolean(true);
		blockPressurePlateObsidianEnabled = conf.get("Obsidian Additions", "blockPressurePlateObsidianEnabled", blockPressurePlateObsidianEnabled).getBoolean(true);
		blockLadderObsidianEnabled = conf.get("Obsidian Additions", "blockLadderObsidianEnabled", blockLadderObsidianEnabled).getBoolean(true);
		blockTorchObsidianEnabled = conf.get("Obsidian Additions", "blockTorchObsidianEnabled", blockTorchObsidianEnabled).getBoolean(true);
		blockTrapDoorObsidianEnabled = conf.get("Obsidian Additions", "blockTrapDoorObsidianEnabled", blockTrapDoorObsidianEnabled).getBoolean(true);
		blockHollowObsidianEnabled = conf.get("Obsidian Additions", "blockHollowObsidianEnabled", blockHollowObsidianEnabled).getBoolean(true);
		
		if(blockButtonObsidianEnabled)
			blockButtonObsidianID = conf.getBlock("blockButtonObsidianID", 675).getInt();
		if(blockStairObsidianEnabled)
			blockStairObsidianID = conf.getBlock("blockStairObsidianID", 676).getInt();
		if(blockDoorObsidianEnabled) {
			itemDoorObsidianID = conf.getItem("itemDoorObsidianID", 6550).getInt();
			blockDoorObsidianID = conf.getBlock("blockDoorObsidianID", 677).getInt();
		}
		if(blockFenceObsidianEnabled)
			blockFenceObsidianID = conf.getBlock("blockFenceObsidianID", 678).getInt();
		if(blockFenceGateObsidianEnabled)
			blockFenceGateObsidianID = conf.getBlock("blockFenceGateObsidianID", 679).getInt();
		if(blockLeverObsidianEnabled)
			blockLeverObsidianID = conf.getBlock("blockLeverObsidianID", 680).getInt();
		if(blockPressurePlateObsidianEnabled)
			blockPressurePlateObsidianID = conf.getBlock("blockPressurePlateObsidianID", 681).getInt();
		if(blockLadderObsidianEnabled)
			blockLadderObsidianID = conf.getBlock("blockLadderObsidianID", 682).getInt();
		if(blockTrapDoorObsidianEnabled)
			blockTrapDoorObsidianID = conf.getBlock("blockTrapDoorObsidianID", 683).getInt();
		if(blockTorchObsidianEnabled)
			blockTorchObsidianID = conf.getBlock("blockTorchObsidianID", 684).getInt();
		if(blockHollowObsidianEnabled)
			blockHollowObsidianID = conf.getBlock("blockHollowObsidianID", 685).getInt();
		
		if(blockFenceObsidianEnabled || blockFenceGateObsidianEnabled || blockLeverObsidianEnabled || blockLadderObsidianEnabled || blockTorchObsidianEnabled)
			itemStickObsidianID = conf.getItem("itemStickObsidian", 6551).getInt();
		
		obisidanAdditionHardness = (float)conf.get("Obsidian Additions", "obisidanAdditionHardness", Block.obsidian.getBlockHardness(null, 0, 0, 0)).getDouble(Block.obsidian.getBlockHardness(null, 0, 0, 0)); // The arguments are irrelevant, not used and is very odd that there's no statically available method...
		hollowObsidianHardness = (float)conf.get("Obsidian Additions", "hollowObsidianHardness", obisidanAdditionHardness / 8).getDouble(obisidanAdditionHardness / 8);
		conf.save();
	}

	@Init
	public void load(FMLInitializationEvent iEvent) {
		if(blockFenceObsidianEnabled || blockFenceGateObsidianEnabled || blockLeverObsidianEnabled || blockLadderObsidianEnabled || blockTorchObsidianEnabled) { // Sticks are needed, initialize them.
			itemStickObsidian = new ItemStickObsidian(itemStickObsidianID).setItemName("itemStickObsidian").setCreativeTab(CreativeTabs.tabMaterials);
			GameRegistry.addRecipe(new ItemStack(itemStickObsidian, 4), "O", "O", 'O', new ItemStack(Block.obsidian));
			LanguageRegistry.addName(itemStickObsidian, "Obsidian Stick");
		}

		if(blockButtonObsidianEnabled) {
			blockButtonObsidian = new BlockButtonObsidian(blockButtonObsidianID).setBlockName("blockButtonObsidian").setHardness(obisidanAdditionHardness).setRequiresSelfNotify();
			GameRegistry.registerBlock(blockButtonObsidian, "blockButtonObsidian");
			GameRegistry.addShapelessRecipe(new ItemStack(blockButtonObsidian), new ItemStack(Block.obsidian));
			LanguageRegistry.addName(blockButtonObsidian, "Obsidian Button");
		}

		if(blockStairObsidianEnabled) {
			blockStairObsidian = new BlockStairsObsidian(blockStairObsidianID, Block.obsidian).setBlockName("blockStairObsidian").setHardness(obisidanAdditionHardness);
			GameRegistry.registerBlock(blockStairObsidian, "blockStairObsidian");
			GameRegistry.addRecipe(new ItemStack(blockStairObsidian), "OXX", "OOX", "OOO", 'O', new ItemStack(Block.obsidian));
			LanguageRegistry.addName(blockStairObsidian, "Obsidian Stairs");
		}

		if(blockDoorObsidianEnabled) {
			blockDoorObsidian = new BlockDoorObsidian(blockDoorObsidianID).setBlockName("blockDoorObsidian").setHardness(obisidanAdditionHardness).setRequiresSelfNotify();
			GameRegistry.registerBlock(blockDoorObsidian, "blockDoorObsidian");
			LanguageRegistry.addName(blockDoorObsidian, "Obsidian Door");
			
			itemDoorObsidian = new ItemDoorObsidian(itemDoorObsidianID).setItemName("itemDoorObsidianID");
			GameRegistry.addRecipe(new ItemStack(itemDoorObsidian), "OO", "OO", "OO", 'O', new ItemStack(Block.obsidian));
			LanguageRegistry.addName(itemDoorObsidian, "Obsidian Door");
		}

		if(blockFenceObsidianEnabled) {
			blockFenceObsidian = new BlockFenceObsidian(blockFenceObsidianID).setBlockName("blockFenceObsidian").setHardness(obisidanAdditionHardness);
			GameRegistry.registerBlock(blockFenceObsidian, "blockFenceObsidian");
			GameRegistry.addRecipe(new ItemStack(blockFenceObsidian), "SSS", "SSS", 'S', new ItemStack(itemStickObsidian));
			LanguageRegistry.addName(blockFenceObsidian, "Obsidian Fence");
		}
		
		if(blockFenceGateObsidianEnabled) {
			blockFenceGateObsidian = new BlockFenceGateObsidian(blockFenceGateObsidianID).setBlockName("blockFenceGateObsidian").setHardness(obisidanAdditionHardness).setRequiresSelfNotify();
			GameRegistry.registerBlock(blockFenceGateObsidian, "blockFenceGateObsidian");
			GameRegistry.addRecipe(new ItemStack(blockFenceGateObsidian), "SOS", "SOS", 'S', new ItemStack(itemStickObsidian), 'O', new ItemStack(Block.obsidian));
			LanguageRegistry.addName(blockFenceGateObsidian, "Obsidian Gate");
		}

		if(blockLeverObsidianEnabled) {
			blockLeverObsidian = new BlockLeverObsidian(blockLeverObsidianID).setBlockName("blockLeverObsidian").setHardness(obisidanAdditionHardness).setRequiresSelfNotify();
			GameRegistry.registerBlock(blockLeverObsidian, "blockLeverObsidian");
			GameRegistry.addRecipe(new ItemStack(blockLeverObsidian), "S", "O", 'O', new ItemStack(Block.obsidian), 'S', new ItemStack(itemStickObsidian));
			LanguageRegistry.addName(blockLeverObsidian, "Obsidian Lever");
		}
		
		if(blockPressurePlateObsidianEnabled) {
			blockPressurePlateObsidian = new BlockPressurePlateObsidian(blockPressurePlateObsidianID).setBlockName("blockPressurePlateObsidian").setHardness(obisidanAdditionHardness).setRequiresSelfNotify();
			GameRegistry.registerBlock(blockPressurePlateObsidian, "blockPressurePlateObsidian");
			GameRegistry.addRecipe(new ItemStack(blockPressurePlateObsidian), "OO", 'O', new ItemStack(Block.obsidian));
			LanguageRegistry.addName(blockPressurePlateObsidian, "Obsidian Pressure Plate");
		}
		
		if(blockLadderObsidianEnabled) {
			blockLadderObsidian = new BlockLadderObsidian(blockLadderObsidianID).setBlockName("blockLadderObsidian").setHardness(obisidanAdditionHardness);
			GameRegistry.registerBlock(blockLadderObsidian, "blockLadderObsidian");
			GameRegistry.addRecipe(new ItemStack(blockLadderObsidian), "SXS", "SSS", "SXS", 'S', new ItemStack(itemStickObsidian));
			LanguageRegistry.addName(blockLadderObsidian, "Obsidian Ladder");
		}
		
		if(blockTrapDoorObsidianEnabled) {
			blockTrapDoorObsidian = new BlockTrapDoorObsidian(blockTrapDoorObsidianID).setBlockName("blockTrapDoorObsidian").setHardness(obisidanAdditionHardness).setRequiresSelfNotify();
			GameRegistry.registerBlock(blockTrapDoorObsidian, "blockTrapDoorObsidian");
			GameRegistry.addRecipe(new ItemStack(blockTrapDoorObsidian), "OOO", "OOO", 'O', new ItemStack(Block.obsidian));
			LanguageRegistry.addName(blockTrapDoorObsidian, "Obsidian Trapdoor");
		}
		
		if(blockTorchObsidianEnabled) {
			blockTorchObsidian = new BlockTorchObsidian(blockTorchObsidianID).setBlockName("blockTorchObsidian").setHardness(obisidanAdditionHardness);
			GameRegistry.registerBlock(blockTorchObsidian, "blockTorchObsidian");
			GameRegistry.addRecipe(new ItemStack(blockTorchObsidian), "C", "S", 'C', new ItemStack(Item.coal, 1, 0), 'S', new ItemStack(itemStickObsidian));
			GameRegistry.addRecipe(new ItemStack(blockTorchObsidian), "C", "S", 'C', new ItemStack(Item.coal, 1, 1), 'S', new ItemStack(itemStickObsidian));
			LanguageRegistry.addName(blockTorchObsidian, "Obsidian Torch");
		}
		
		if(blockHollowObsidianEnabled) {
			blockHollowObsidian = new Block(blockHollowObsidianID, Block.obsidian.blockIndexInTexture, Material.rock).setBlockName("blockHollowObsidian").setHardness(hollowObsidianHardness).setCreativeTab(CreativeTabs.tabBlock);
			GameRegistry.registerBlock(blockHollowObsidian, "blockHollowObsidian");
			GameRegistry.addRecipe(new ItemStack(blockHollowObsidian, 8), "OOO", "OXO", "OOO", 'O', new ItemStack(Block.obsidian));
			LanguageRegistry.addName(blockHollowObsidian, "Hollow Obsidian");
		}
	}
}