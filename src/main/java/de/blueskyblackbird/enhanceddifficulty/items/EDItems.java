package de.blueskyblackbird.enhanceddifficulty.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

public class EDItems 
{
	public static EDItemBase debugItem = new EDDebugItem("edDebugItem","item.eddebugitem",CreativeTabs.tabMisc);
	
    public static void init(Configuration config)
    {
    	finishItem(debugItem, config);
    }
    
    private static void finishItem(EDItemBase item, Configuration config)
    {
    	item.initWithConfig(config);
    	GameRegistry.registerItem(item, item.getRegistryName());
    }
    

}
