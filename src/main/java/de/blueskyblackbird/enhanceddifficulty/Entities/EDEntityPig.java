package de.blueskyblackbird.enhanceddifficulty.Entities;

import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.world.World;

public class EDEntityPig extends EntityPig
{
	public static final String REGISTRATION_NAME = "My new Pig";
	
	public static boolean canSpawn = false;
	
	public EDEntityPig(World world)
	{
		super(world);
		setScale(2f);
		
		// tasks
	}	
	
	@Override
	public boolean getCanSpawnHere()
	{
		// TODO Auto-generated method stub
		return canSpawn && super.getCanSpawnHere();
	}
	

}
