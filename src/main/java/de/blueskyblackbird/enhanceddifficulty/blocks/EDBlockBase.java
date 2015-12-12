package de.blueskyblackbird.enhanceddifficulty.blocks;

import de.blueskyblackbird.enhanceddifficulty.core.EDCreativeTab;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDTextures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.config.Configuration;

public class EDBlockBase extends Block
{
	
	public EDBlockBase(String unlocalizedName)
	{
		super(Material.rock);
		setBlockTextureName(EDTextures.RESOURCE_PREFIX + unlocalizedName);
		setCreativeTab(EDCreativeTab.ED_TAB);
		setBlockName(unlocalizedName);
	}

	public String getRegistryName()
	{
		return EDReference.MOD_NAME + "." + getUnlocalizedName();
	}
	
	public void initWithConfig(Configuration config)
	{}
	
	@Override
	public boolean canBeReplacedByLeaves(IBlockAccess world, int x, int y, int z)
	{
		if (world.getBlock(x, y, z).equals(this))
		{
			return false;
		}
		
		return super.canBeReplacedByLeaves(world, x, y, z);
	}
	
}
