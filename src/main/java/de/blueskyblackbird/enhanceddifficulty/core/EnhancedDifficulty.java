package de.blueskyblackbird.enhanceddifficulty.core;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.blueskyblackbird.enhanceddifficulty.handler.EDConfigHandler;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;
import de.blueskyblackbird.enhanceddifficulty.util.EDLog;

@Mod(modid = EDReference.MODID, version = EDReference.MOD_VERSION, name = EDReference.MOD_NAME, guiFactory = EDReference.GUI_FACTORY)
public class EnhancedDifficulty
{
	
	//TODO: Gui Factory is broken
    @Instance(EDReference.MODID)
    public static EnhancedDifficulty instance;
    
    @SidedProxy(clientSide=EDReference.CLIENT_PROXY,serverSide=EDReference.COMMON_PROXY)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	EDConfigHandler.init(event.getSuggestedConfigurationFile());
    	FMLCommonHandler.instance().bus().register(new EDConfigHandler());
    	
    	proxy.initSounds();
    	proxy.initRenderes();
    	
    	EDLog.info("Pre initialization complete");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	EDLog.info("Initialization complete");
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	EDLog.info("Post initialization complete");
    }
    

}
