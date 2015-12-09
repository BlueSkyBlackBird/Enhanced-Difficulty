package de.blueskyblackbird.enhanceddifficulty.config;

import java.io.File;

import de.blueskyblackbird.enhanceddifficulty.items.EDItems;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler 
{
	
	public static void init(File file)
	{
		Configuration config = new Configuration(file);
		config.load();
		EDItems.init(config);
		config.save();
	}
}
