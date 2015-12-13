package de.blueskyblackbird.enhanceddifficulty.Entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EDEntityBase extends EntityMob
{
	public EDEntityBase(World world)
	{
		super(world);
	}

	public String getRegistryName()
	{
		return getClass().getName();
	}
	
	public EnumCreatureType getCreatureType()
	{
		return EnumCreatureType.monster;
	}
	
	
	
	@Override
	public boolean getCanSpawnHere()
	{
		// TODO Check distance to players and their difficulty scale
		return super.getCanSpawnHere();
	}
	
	@Override
	public void onDeath(DamageSource p_70645_1_)
	{
		// TODO Auto-generated method stub
		super.onDeath(p_70645_1_);
	}
	
	@Override
	public boolean isOnSameTeam(EntityLivingBase p_142014_1_)
	{
		// TODO Auto-generated method stub
		return super.isOnSameTeam(p_142014_1_);
	}
	
}
