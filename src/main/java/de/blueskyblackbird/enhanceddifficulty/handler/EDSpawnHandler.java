package de.blueskyblackbird.enhanceddifficulty.handler;

import java.util.ArrayList;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import de.blueskyblackbird.enhanceddifficulty.util.EDHelper;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent.AllowDespawn;
import net.minecraftforge.event.entity.living.LivingSpawnEvent.CheckSpawn;
import net.minecraftforge.event.world.WorldEvent;

public class EDSpawnHandler
{

	@SubscribeEvent(priority=EventPriority.LOWEST)
	public void onEntityWantsToSpawn(CheckSpawn event)
	{
		if (EDHelper.isServer(event.world))
		{
			if (event.hasResult() && event.getResult() == Result.ALLOW)
			{
				System.out.println("ALLOWED SPAWN! " + event.entityLiving);
			}
		}
	}
	
}
