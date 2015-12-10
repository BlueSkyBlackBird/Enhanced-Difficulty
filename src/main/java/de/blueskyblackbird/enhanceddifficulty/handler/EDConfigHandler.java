package de.blueskyblackbird.enhanceddifficulty.handler;

import java.io.File;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import de.blueskyblackbird.enhanceddifficulty.items.EDItems;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;
import de.blueskyblackbird.enhanceddifficulty.util.EDLog;
import net.minecraft.init.Items;
import net.minecraftforge.common.config.Configuration;

public class EDConfigHandler 
{
	public static Configuration config;
	
	public static void init(File file)
	{
		if (config == null)
		{
			config = new Configuration(file);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChange(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(EDReference.MODID))
		{
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration()
	{
		EDItems.init(config);
		
		if (config.hasChanged())
		{
			config.save();
		}
	}
	
}
