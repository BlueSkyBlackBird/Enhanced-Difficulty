package de.blueskyblackbird.enhanceddifficulty.core;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntities;
import de.blueskyblackbird.enhanceddifficulty.blocks.EDBlocks;
import de.blueskyblackbird.enhanceddifficulty.handler.EDConfigHandler;
import de.blueskyblackbird.enhanceddifficulty.handler.EDLivingEnitityHandler;
import de.blueskyblackbird.enhanceddifficulty.handler.EDSpawnHandler;
import de.blueskyblackbird.enhanceddifficulty.items.EDItems;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;
import de.blueskyblackbird.enhanceddifficulty.util.EDLog;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = EDReference.MODID, version = EDReference.MOD_VERSION, name = EDReference.MOD_NAME, guiFactory = EDReference.GUI_FACTORY)
public class EnhancedDifficulty
{
    @Instance(EDReference.MODID)
    public static EnhancedDifficulty instance;
    
    @SidedProxy(clientSide=EDReference.CLIENT_PROXY,serverSide=EDReference.COMMON_PROXY)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	// Register all ED specific objects
    	EDBlocks.register();
    	EDItems.register();
    	EDEntities.register();
    	
    	// Load the config and apply all the loaded data to objects
    	EDConfigHandler.init(event.getSuggestedConfigurationFile());
    	
    	// Load handlers and apply them
    	FMLCommonHandler.instance().bus().register(new EDConfigHandler());
    	MinecraftForge.EVENT_BUS.register(new EDLivingEnitityHandler());
    	MinecraftForge.EVENT_BUS.register(new EDSpawnHandler());
    	
    	// Init side specific objects
    	proxy.initSounds();
    	proxy.initRenderes();
    	
    	EDLog.info("Pre initialization complete");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	EDRecipes.init();
    	EDLog.info("Initialization complete");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	EDLog.info("Post initialization complete");
    }
    

}
