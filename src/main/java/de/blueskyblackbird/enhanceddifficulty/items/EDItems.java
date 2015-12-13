package de.blueskyblackbird.enhanceddifficulty.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import de.blueskyblackbird.enhanceddifficulty.core.EDCreativeTab;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

@ObjectHolder(EDReference.MOD_ID)
public class EDItems 
{
	public static EDItemBase debugItem = new EDDebugItem("edDebugItem");
	
    public static void applyConfig(Configuration config)
    {
    	debugItem.initWithConfig(config);
    }    

	public static void register()
	{
		GameRegistry.registerItem(debugItem, debugItem.getRegistryName());
	}

}
