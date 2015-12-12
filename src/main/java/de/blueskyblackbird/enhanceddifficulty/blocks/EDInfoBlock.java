package de.blueskyblackbird.enhanceddifficulty.blocks;

import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntityDaywalker;
import de.blueskyblackbird.enhanceddifficulty.util.EDEntityHelper;
import de.blueskyblackbird.enhanceddifficulty.util.EDHelper;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EDInfoBlock extends EDBlockBase
{

	public EDInfoBlock(String unlocalizedName)
	{
		super(unlocalizedName);
		setHarvestLevel("Pickaxe", 1);
		setLightLevel(1f);
		setResistance(15f);
		setStepSound(soundTypeMetal);
	}

	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player)
	{
		if (EDHelper.isClient(player))
		{
			System.out.println("Player '" + player.getDisplayName() + "' hit this block!");
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side,
			float posX, float posY, float posZ)
	{
		if (EDHelper.isClient(player))
		{
			//System.out.println("Player '" + player.getDisplayName() + "' activated this block!");
		}
		
		if (EDHelper.isServer(player))
		{
			System.out.println("-----------");
			System.out.println("List contains: " + world.loadedEntityList.size() + " Entities");
			System.out.println("Methode returns: " + EDEntityHelper.getNumberOfEntitiesInGame(world,EDEntityDaywalker.class));
			
			for(Object o: world.loadedEntityList)
			{
				System.out.println((Entity)o);
			}
			
			System.out.println("-----------");
			
			
		}
		
		return false;
	}


}
