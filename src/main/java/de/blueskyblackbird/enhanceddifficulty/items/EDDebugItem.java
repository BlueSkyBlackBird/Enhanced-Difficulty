package de.blueskyblackbird.enhanceddifficulty.items;

import de.blueskyblackbird.enhanceddifficulty.moddata.EDTextures;
import de.blueskyblackbird.enhanceddifficulty.util.EDHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;

public class EDDebugItem extends EDItemBase
{

	public EDDebugItem(String unlocalizedName, String registryName, CreativeTabs tab ) 
	{
		super(unlocalizedName, registryName, tab);
		setMaxStackSize(1);
	}
	
	@Override
	public void initWithConfig(Configuration config)
	{
		boolean isEnabled = 	config.get(Configuration.CATEGORY_GENERAL, 	getUnlocalizedName(), 	true).getBoolean();
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
		if (EDHelper.isClient(player)) 
		{
			System.out.println("Player " + player.getDisplayName() + " used debug item!");
		}
		return item;
	}
	
	
	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side,
			float hitX, float hitY, float hitZ)
	{
		if (EDHelper.isClient(player)) 
		{
			System.out.println("Player " + player.getDisplayName() + " used debug item on " + world.getBlock(x, y, z).getLocalizedName());
		}
		return super.onItemUse(item, player, world, x, y, z, side, hitX, hitY, hitZ);
	}
	
	
	
	
	@Override
	public EnumAction getItemUseAction(ItemStack s)
	{
		return EnumAction.none;
	}
	
	
	
	

	
}
