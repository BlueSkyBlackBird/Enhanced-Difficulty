package de.blueskyblackbird.enhanceddifficulty.Entities;

import de.blueskyblackbird.enhanceddifficulty.util.EDHelper;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EDEntityDaywalker extends EntityChicken
{
	public static int counter = 0;
	
	public EDEntityDaywalker(World p_i1682_1_)
	{
		super(p_i1682_1_);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public boolean getCanSpawnHere()
	{
		return counter <= 10 && super.getCanSpawnHere();
	}
	
	
	@Override
	protected void despawnEntity()
	{
		super.despawnEntity();
		System.out.println("rm " + counter--);
	}
	
	
}
