package nexustools.vanillaexpanded;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "VanillaExpanded")
@NetworkMod(clientSideRequired = true)
public class VanillaExpanded {
	@PreInit
	public void preload(FMLPreInitializationEvent iEvent) {
		
	}
	
	@Init
	public void load(FMLInitializationEvent iEvent) {
		
	}
}