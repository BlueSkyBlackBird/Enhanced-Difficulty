package de.blueskyblackbird.enhanceddifficulty.core;

import cpw.mods.fml.client.registry.RenderingRegistry;
import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntityDaywalker;
import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntityDaywalkerRenderer;
import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntityPig;
import de.blueskyblackbird.enhanceddifficulty.Entities.EDEntityPigRenderer;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelPig;

public class ClientProxy extends CommonProxy
{
	@Override
	public void initSounds()
	{}
	
	@Override
	public void initRenderes()
	{
		RenderingRegistry.registerEntityRenderingHandler(EDEntityPig.class, new EDEntityPigRenderer(new ModelPig(), new ModelPig(0.5F), 0.7F));
		RenderingRegistry.registerEntityRenderingHandler(EDEntityDaywalker.class, new EDEntityDaywalkerRenderer(new ModelChicken(), 0.7F));
	}
}
