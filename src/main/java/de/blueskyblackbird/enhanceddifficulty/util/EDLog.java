package de.blueskyblackbird.enhanceddifficulty.util;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;

public class EDLog
{
	public static void log(Level logLevel, Object message)
	{
		FMLLog.log(EDReference.MOD_NAME, logLevel, "s%", String.valueOf(message) );
	}
	
	
}
