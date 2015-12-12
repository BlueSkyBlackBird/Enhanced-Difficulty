package de.blueskyblackbird.enhanceddifficulty.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import de.blueskyblackbird.enhanceddifficulty.core.EDCreativeTab;
import de.blueskyblackbird.enhanceddifficulty.items.EDItemBase;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

@ObjectHolder(EDReference.MODID)
public class EDBlocks
{
	public static EDBlockBase infoBlock = new EDInfoBlock("edInfoBlock");
	
	
	public static void applyConfig(Configuration config)
    {
		infoBlock.initWithConfig(config);
    }
	
	public static void register()
	{
		GameRegistry.registerBlock(infoBlock, infoBlock.getRegistryName());
	}
 
	
}
