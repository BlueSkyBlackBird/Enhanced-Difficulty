package de.blueskyblackbird.enhanceddifficulty.Entities;

import cpw.mods.fml.common.registry.EntityRegistry;
import de.blueskyblackbird.enhanceddifficulty.core.EnhancedDifficulty;
import de.blueskyblackbird.enhanceddifficulty.util.EDEntityHelper;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.event.world.WorldEvent;

public class EDEntities
{
	public static void register()
	{
		BiomeGenBase[] validSpawningBiomes = EDEntityHelper.getAllBiomesExceptFor(Type.END,Type.NETHER,Type.OCEAN);
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
	
		
//		EntityRegistry.registerModEntity(EDEntityPig.class, EDEntityPig.REGISTRATION_NAME, 0, EnhancedDifficulty.instance, 80, 3, true);
//		EntityRegistry.addSpawn(EDEntityPig.class, 10, 1, 2, EnumCreatureType.creature, validSpawningBiomes);
//		
		EntityRegistry.registerModEntity(EDEntityDaywalker.class, "Daywalker", 1, EnhancedDifficulty.instance, 80, 3, true);
		EntityRegistry.addSpawn(EDEntityDaywalker.class, 10, 1, 2, EnumCreatureType.monster, validSpawningBiomes);
		
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		System.out.println("Added all Entities!");
		
		
		//System.out.println("----------------------------------");
		//System.out.println(BiomeGenBase.getBiomeGenArray());
		//System.out.println("----------------------------------");
		
//		EntityRegistry.addSpawn(EntityPig.class, 0, 1, 1, EnumCreatureType.creature);
//		EntityRegistry.addSpawn(EntityCow.class, 0, 1, 1, EnumCreatureType.creature);
//		EntityRegistry.addSpawn(EntityChicken.class, 0, 1, 1, EnumCreatureType.creature);
	}
}
