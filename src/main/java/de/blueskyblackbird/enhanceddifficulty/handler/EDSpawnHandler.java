package de.blueskyblackbird.enhanceddifficulty.handler;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntityDaywalker;
import de.blueskyblackbird.enhanceddifficulty.util.EDHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingSpawnEvent.AllowDespawn;
import net.minecraftforge.event.entity.living.LivingSpawnEvent.CheckSpawn;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.WorldEvent;

public class EDSpawnHandler
{
	public static int count = 0;
	
	
	
	@SubscribeEvent
	public void onWorldSpawn(WorldEvent.PotentialSpawns event)
	{
//		if (EDHelper.isServer(event.world) && event.)
//		{
//			if (count == 7500)
//			{
//				System.out.println("PotentialSpawns: " +  event.list);
//				count = 0;
//				
//				for(Object p : event.world.playerEntities)
//				{
//					System.out.println("Player: " + p);
//				}
//				System.out.println();
//				
//				
//				
//				
//			}			
//			count++;
//		}
	}
	
	@SubscribeEvent
	public void onEntityCreated(EntityConstructing event)
	{
		
	}
	
	@SubscribeEvent(priority=EventPriority.LOWEST)
	public void onEntityJoin(EntityJoinWorldEvent event)
	{
		if (EDHelper.isServer(event.world) && event.entity instanceof EntityPlayer && !event.isCanceled())
		{
			System.out.println(event.entity);
		}
		
		if (EDHelper.isServer(event.world) && event.entity instanceof EDEntityDaywalker && !event.isCanceled())
		{
			System.out.println("Spawn Daywalker " + ++EDEntityDaywalker.counter);
		}
	}
	
	@SubscribeEvent(priority=EventPriority.LOWEST)
	public void onEntityWantsToSpawn(CheckSpawn event)
	{
		if (EDHelper.isServer(event.world))
		{
			System.out.println("Entity wants to spawn: " + event.entityLiving);
		}
	}
	
	@SubscribeEvent(priority=EventPriority.LOWEST)
	public void onDespawn(AllowDespawn event)
	{
//		if (EDHelper.isServer(event.entity) && event.entity instanceof EDEntityDaywalker  && !event.isCanceled() )
//		{
//			if (event.hasResult() )
//			{
//				if ( event.getResult() != Result.DENY)
//				{
//					System.out.println("Despawn Daywalker " + --EDEntityDaywalker.counter);	
//				}
//						
//			}
//			else
//			{
//				System.out.println("Despawn Daywalker " + --EDEntityDaywalker.counter);	
//			}
//			
//		}
	}
}
