package de.blueskyblackbird.enhanceddifficulty.items;

import java.util.List;

import com.google.common.base.Function;

import cpw.mods.fml.common.network.internal.FMLMessage;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.EntityRegistry.EntityRegistration;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntityPig;
import de.blueskyblackbird.enhanceddifficulty.util.EDHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;

public class EDDebugItem extends EDItemBase
{

	public EDDebugItem(String unlocalizedName) 
	{
		super(unlocalizedName);
		setMaxStackSize(1);
		setFull3D();
	}
	
	@Override
	public void initWithConfig(Configuration config)
	{
		boolean isEnabled = 	config.get(Configuration.CATEGORY_GENERAL, 	getUnlocalizedName(), 	true).getBoolean();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean useExtraInformation)
	{
		info.add("This item has a simple description");
		info.add("It is really THAT easy!");
	}
	
	
	@Override
	public boolean hitEntity(ItemStack item, EntityLivingBase player, EntityLivingBase target) 
	{
		if (EDHelper.isClient(player)) 
		{
			
		}
		return false;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
	{
		if (EDHelper.isServer(player)) 
		{
			EDEntityPig.canSpawn = !EDEntityPig.canSpawn;
			System.out.println("Changed Pig spawn rule to: " + EDEntityPig.canSpawn);
		}
		return item;
	}
	
	
	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side,
			float hitX, float hitY, float hitZ)
	{
		if (EDHelper.isClient(player)) 
		{
			if (EDHelper.isEDObject(world.getBlock(x, y, z)))
			{
				System.out.println("Player " + player.getDisplayName() + " used debug item on " + world.getBlock(x, y, z).getLocalizedName());
			}
			
		}
		return super.onItemUse(item, player, world, x, y, z, side, hitX, hitY, hitZ);
	}
	
	
	
	
	@Override
	public EnumAction getItemUseAction(ItemStack s)
	{
		return EnumAction.block;
	}
	
	
	
	

	
}
