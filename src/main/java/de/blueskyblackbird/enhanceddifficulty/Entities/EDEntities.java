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

		EntityRegistry.registerModEntity(EDEntityDaywalker.class, "Daywalker", 1, EnhancedDifficulty.instance, 80, 3, true);
		EntityRegistry.addSpawn(EDEntityDaywalker.class, 10, 1, 2, EnumCreatureType.creature, validSpawningBiomes);
		
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		System.out.println("Added all Entities!");
		
	}
}
