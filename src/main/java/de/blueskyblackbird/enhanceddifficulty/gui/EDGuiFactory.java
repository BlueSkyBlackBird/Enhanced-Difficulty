package de.blueskyblackbird.enhanceddifficulty.gui;

import java.util.Set;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class EDGuiFactory implements IModGuiFactory
{

	@Override
	public void initialize(Minecraft minecraftInstance)
	{}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass()
	{
		return EDGuiConfig.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
	{
		return null;
	}

}
