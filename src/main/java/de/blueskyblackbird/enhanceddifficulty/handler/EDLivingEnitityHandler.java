package de.blueskyblackbird.enhanceddifficulty.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntityDaywalker;
import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntityPig;
import de.blueskyblackbird.enhanceddifficulty.util.EDHelper;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentThorns;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent.CheckSpawn;

public class EDLivingEnitityHandler
{
	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event)
	{

		
	}
	
	
	
	@SubscribeEvent
	public void onEntitySpawn(LivingSpawnEvent event)
	{
		
	}
	

}
