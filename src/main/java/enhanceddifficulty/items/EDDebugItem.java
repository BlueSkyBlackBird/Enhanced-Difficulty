package enhanceddifficulty.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import enhanceddifficulty.core.EDTextures;
import enhanceddifficulty.core.EnhancedDifficulty;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;

public class EDDebugItem extends BasicEDItem
{

	public EDDebugItem() 
	{
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("edDebugItem");
		setRegistryName("editemdebugitem");
		setTextureName(EDTextures.RESOURCE_PREFIX + "edDebugItem");

	}
	
	@Override
	public void initWithConfig(Configuration config)
	{
		boolean isEnabled = 	config.get("Enable/Disable", 	getUnlocalizedName(), 	true).getBoolean();
		
	}
	
	@Override
	public boolean hitEntity(ItemStack item, EntityLivingBase player, EntityLivingBase target) 
	{
		if (!target.worldObj.isRemote) 
		{
			System.out.println("Unlocalized Name: '" + getUnlocalizedName() + "'");
			System.out.println("Unwrapped Unlocalized Name: '" + getUnwrappedLocalizedName() + "'");
		}
		return false;
	}

	
}
