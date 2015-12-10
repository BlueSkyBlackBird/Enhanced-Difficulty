package de.blueskyblackbird.enhanceddifficulty.items;

import de.blueskyblackbird.enhanceddifficulty.moddata.EDTextures;
import de.blueskyblackbird.enhanceddifficulty.util.EDHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;

public class EDDebugItem extends EDItemBase
{

	public EDDebugItem(String unlocalizedName, String registryName, CreativeTabs tab ) 
	{
		super(unlocalizedName, registryName, tab);
		setMaxStackSize(1);
	}
	
	@Override
	public void initWithConfig(Configuration config)
	{
		boolean isEnabled = 	config.get("Enable/Disable", 	getUnlocalizedName(), 	true).getBoolean();
	}
	
	@Override
	public boolean hitEntity(ItemStack item, EntityLivingBase player, EntityLivingBase target) 
	{
		if (EDHelper.isClient(player)) 
		{
			
		}
		return false;
	}
	
	

	
}
