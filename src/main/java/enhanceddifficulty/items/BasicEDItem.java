package enhanceddifficulty.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import enhanceddifficulty.core.EDTextures;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

public class BasicEDItem extends Item
{
	public static final String TEXTURE_PATH = "";
	
	protected String registryName;
	
	public BasicEDItem() 
	{
		super();
	}

	public String getRegistryName()
	{
		return registryName;
	}
	
	public void setRegistryName(String registryName)
	{
		this.registryName = registryName;
		
	}
	
	public void initWithConfig(Configuration config)
	{}
	
	
	protected String getUnwrappedLocalizedName()
	{
		return getUnlocalizedName().substring(getUnlocalizedName().indexOf(".")+1);
	}
	
	
//	@Override
//	@SideOnly(Side.CLIENT)
//	public void registerIcons(IIconRegister reg) 
//	{
//		itemIcon = reg.registerIcon(getUnwrappedLocalizedName());
//		System.out.println(getUnwrappedLocalizedName());
//	}

}
