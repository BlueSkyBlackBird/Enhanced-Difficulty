package de.blueskyblackbird.enhanceddifficulty.core;

import de.blueskyblackbird.enhanceddifficulty.items.EDItems;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EDCreativeTab
{
	public static final CreativeTabs ED_TAB = new CreativeTabs(EDReference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return EDItems.debugItem;
		}
	};
	

}
