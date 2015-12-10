package de.blueskyblackbird.enhanceddifficulty.gui;

import java.util.List;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import de.blueskyblackbird.enhanceddifficulty.handler.EDConfigHandler;
import de.blueskyblackbird.enhanceddifficulty.moddata.EDReference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class EDGuiConfig extends GuiConfig
{
	public EDGuiConfig(GuiScreen parentScreen)
	{
		super(	parentScreen, 
				new ConfigElement(EDConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				EDReference.MODID, 
				false, 
				false, 
				"Also a test string");
		titleLine2 = "This is a test for the config";
	}
}
