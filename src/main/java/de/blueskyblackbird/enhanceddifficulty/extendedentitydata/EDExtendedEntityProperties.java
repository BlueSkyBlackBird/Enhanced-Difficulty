package de.blueskyblackbird.enhanceddifficulty.extendedentitydata;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class EDExtendedEntityProperties implements IExtendedEntityProperties
{
	private static final String COMPOUND_NAME = "edEEP";
	
	protected World associatedWorld;
	protected Entity associatedEntity;

	// data here
	
	@Override
	public void saveNBTData(NBTTagCompound compound)
	{
		NBTTagCompound saveCompound = new NBTTagCompound();
		
		//TODO Saving
		
		compound.setTag(COMPOUND_NAME, saveCompound);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound)
	{
		NBTTagCompound loadCompound = (NBTTagCompound)compound.getTag(COMPOUND_NAME);
		//TODO loading
	}

	@Override
	public void init(Entity entity, World world)
	{
		associatedWorld = world;
		associatedEntity = entity;
	}

}
