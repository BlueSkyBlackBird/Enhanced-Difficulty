package de.blueskyblackbird.enhanceddifficulty.core;

import javax.security.auth.callback.ChoiceCallback;

import cpw.mods.fml.client.registry.RenderingRegistry;
import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntityDaywalker;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderBlaze;
import net.minecraft.client.renderer.entity.RenderChicken;

public class ClientProxy extends CommonProxy
{
	@Override
	public void initSounds()
	{}
	
	@Override
	public void initRenderes()
	{
		RenderingRegistry.registerEntityRenderingHandler(EDEntityDaywalker.class, new RenderChicken(new ModelChicken(),1f));
	}
}
