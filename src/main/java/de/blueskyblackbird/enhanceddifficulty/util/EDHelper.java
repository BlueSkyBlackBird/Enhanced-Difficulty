package de.blueskyblackbird.enhanceddifficulty.util;

import de.blueskyblackbird.enhanceddifficulty.blocks.EDBlockBase;
import de.blueskyblackbird.enhanceddifficulty.items.EDItemBase;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EDHelper
{
	public static boolean isClient(Entity base)
	{
		return !isServer(base.worldObj);
	}
	
	public static boolean isServer(Entity base)
	{
		return !isClient(base);
	}
	
	public static boolean isEDObject(Item base)
	{
		return base instanceof EDItemBase;
	}
	
	public static boolean isEDObject(Block base)
	{
		return base instanceof EDBlockBase;
	}

	public static boolean isServer(World world)
	{
		return !world.isRemote;
	}
	
	public static boolean isClient(World world)
	{
		return !isServer(world);
	}
	
	public static String getSide(World world)
	{
		return isServer(world)?"Server":"Client";
	}
	
	public static String getSideName(Entity entity)
	{
		return isServer(entity)?"Server":"Client";
	}
	
}
