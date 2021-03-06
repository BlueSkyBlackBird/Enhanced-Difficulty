package de.blueskyblackbird.enhanceddifficulty.items;

import de.blueskyblackbird.enhanceddifficulty.core.EDCreativeTab;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

public class EDItemBase extends Item
{
	public static final String TEXTURE_PATH = "";
	
	
	public EDItemBase(String unlocalizedName) 
	{
		super();
		setUnlocalizedName(unlocalizedName);
		setTextureName(EDReference.RESOURCE_PREFIX + unlocalizedName);
		setCreativeTab(EDCreativeTab.ED_TAB);
	}

	public String getRegistryName()
	{
		return EDReference.MOD_NAME + "." + getUnlocalizedName();
	}
	
	
	public void initWithConfig(Configuration config)
	{}
	
}
