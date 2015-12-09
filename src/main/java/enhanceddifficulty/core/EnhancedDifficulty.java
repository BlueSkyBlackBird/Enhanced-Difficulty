package enhanceddifficulty.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import enhanceddifficulty.config.ConfigHandler;
import enhanceddifficulty.items.EDItems;

@Mod(modid = EnhancedDifficulty.MODID, version = EnhancedDifficulty.VERSION, name = EnhancedDifficulty.NAME)
public class EnhancedDifficulty
{
    public static final String MODID = "enhanceddifficulty";
    public static final String VERSION = "0.0.1";
    public static final String NAME = "Enhanced Difficulty";
    
    @Instance(value = EnhancedDifficulty.MODID)
    public static EnhancedDifficulty instance;
    
    @SidedProxy(clientSide="enhanceddifficulty.core.ClientProxy", serverSide="enhanceddifficulty.core.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ConfigHandler.init(event.getSuggestedConfigurationFile());
    	
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
