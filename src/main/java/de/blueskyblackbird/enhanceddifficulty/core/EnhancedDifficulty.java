package de.blueskyblackbird.enhanceddifficulty.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.blueskyblackbird.enhanceddifficulty.config.EDConfigHandler;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;

@Mod(modid = EDReference.MODID, version = EDReference.MOD_VERSION, name = EDReference.MOD_NAME)
public class EnhancedDifficulty
{
    @Instance(EDReference.MODID)
    public static EnhancedDifficulty instance;
    
    @SidedProxy(clientSide=EDReference.CLIENT_PROXY,serverSide=EDReference.COMMON_PROXY)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	EDConfigHandler.init(event.getSuggestedConfigurationFile());
    	
    	proxy.initSounds();
    	proxy.initRenderes();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {}
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {}
    

}
