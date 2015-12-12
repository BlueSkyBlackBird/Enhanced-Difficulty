package de.blueskyblackbird.enhanceddifficulty.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.http.MethodNotSupportedException;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

public class EDEntityHelper
{
	/**
	 * Returns an array of all biomes registered in the @see{BiomeGenBase} at this point in time.<br>
	 * It then removes all Biomes given as parameter.
	 */
	public static BiomeGenBase[] getAllBiomesExceptFor(BiomeGenBase... biomes)
	{
		Set<BiomeGenBase> resultingBiomes = getAllBiomes();
		
		for (BiomeGenBase biomeGenBase : biomes)
		{
			resultingBiomes.remove(biomeGenBase);
		}
		
		return resultingBiomes.toArray(new BiomeGenBase[resultingBiomes.size()]);
		
	}
	
	/**
	 * Returns an array of all biomes registered in the @see{BiomeGenBase} at this point in time.<br>
	 * It then removes all Biomes-Types given as parameter.
	 */
	public static BiomeGenBase[] getAllBiomesExceptFor(BiomeDictionary.Type... types)
	{
		Set<BiomeGenBase> resultingBiomes = getAllBiomes();
		
		for (BiomeDictionary.Type type : types)
		{
			removeArrayToCollection(BiomeDictionary.getBiomesForType(type), resultingBiomes);
		}
		
		return resultingBiomes.toArray(new BiomeGenBase[resultingBiomes.size()]);
	}
	
	
	private static Set<BiomeGenBase> getAllBiomes()
	{
		Set<BiomeGenBase> resultingBiomes = new HashSet<BiomeGenBase>();
		
		for (Type type : Type.values())
		{
			addArrayToCollection(BiomeDictionary.getBiomesForType(type), resultingBiomes);
		}
		
		return resultingBiomes;
	}
	
	/**
	 * Removes 
	 */
	public static<T> void removeArrayToCollection(T[] array, Collection<T> collection)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] != null)
			{
				collection.remove(array[i]);
			}
		}
	}
	
	public static<T> void addArrayToCollection(T[] array, Collection<T> collection)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] != null)
			{
				collection.add(array[i]);
			}
		}
	}
	
	public static int getNumberOfEntitiesInGame(World world, Class entityClass)
	{
		int sum = 0;
		
		for (Object o : world.loadedEntityList)
		{
			if (o instanceof Entity && o.getClass() == entityClass)
			{
				sum++;
			}
		}
		
		return sum;
	}
	
	public static void getPlayersInRangeOf(List<EntityPlayer> list, int maxDistSquared, World world, int x, int y, int z)
	{

		for (Object entityPlayer : world.playerEntities)
		{
			EntityPlayer player = (EntityPlayer)entityPlayer;
			
			if(player.getDistanceSq(x, y, z) <= maxDistSquared)
			{
				list.add(player);
			}
		}
	}
	
	public static boolean hasPlayerInRangeRequiredDifficultyLevel(World world, Object difficultyLevel ,int maxDistSquared,  int x, int y, int z ) throws MethodNotSupportedException
	{
		throw new MethodNotSupportedException("Incomplete Method: hasPlayerInRangeRequiredDifficultyLevel");
		
//		for (Object entityPlayer : world.playerEntities)
//		{
//			EntityPlayer player = (EntityPlayer)entityPlayer;
//			
//			if(player.getDistanceSq(x, y, z) < minDistSquared && <PlayerDifficulty high enough>)
//			{
//				// TODO: Method needs to be able to load and validate difficulty level from player
//				
//				return true;
//			}
//		}
//		return false;

	}
}
