package enhanceddifficulty.config;

import java.io.File;

import enhanceddifficulty.items.EDDebugItem;
import enhanceddifficulty.items.EDItems;
import net.minecraft.init.Items;
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
