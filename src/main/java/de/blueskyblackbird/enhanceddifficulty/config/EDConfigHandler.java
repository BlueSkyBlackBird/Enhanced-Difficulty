package de.blueskyblackbird.enhanceddifficulty.config;

import java.io.File;

import org.apache.logging.log4j.Level;

import de.blueskyblackbird.enhanceddifficulty.items.EDItems;
import de.blueskyblackbird.enhanceddifficulty.util.EDLog;
import net.minecraftforge.common.config.Configuration;

public class EDConfigHandler 
{
	public static void init(File file)
	{
		Configuration config = new Configuration(file);
		try
		{
			config.load();
			EDItems.init(config);
		}
		catch (Exception e)
		{
			EDLog.log(Level.ERROR, "Failed to read configuration file: " + e.getMessage());
		}
		finally 
		{
			if(config.hasChanged())
			{
				config.save();
			}
		}
	}
}
