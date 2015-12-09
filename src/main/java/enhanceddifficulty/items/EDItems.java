package enhanceddifficulty.items;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import enhanceddifficulty.core.EnhancedDifficulty;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

public class EDItems 
{
	public static BasicEDItem debugItem = new EDDebugItem();
	
    public static void init(Configuration config)
    {
    	finishItem(debugItem, config);
    }
    
    private static void finishItem(BasicEDItem item, Configuration config)
    {
    	item.initWithConfig(config);
    	GameRegistry.registerItem(item, item.getRegistryName());
    }
    

}
