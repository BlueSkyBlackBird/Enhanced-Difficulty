package de.blueskyblackbird.enhanceddifficulty.util;

import de.blueskyblackbird.enhanceddifficulty.items.EDItemBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;

public class EDHelper
{
	public static boolean isClient(EntityLivingBase base)
	{
		return !base.worldObj.isRemote;
	}
	
	public static boolean isServer(EntityLivingBase base)
	{
		return !isClient(base);
	}
	
	public static boolean isEDObject(Item base)
	{
		return base instanceof EDItemBase;
	}
}
