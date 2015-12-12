package de.blueskyblackbird.enhanceddifficulty.Entities;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.EntityLivingBase;

public class EDEntityPigRenderer extends RenderPig
{

	public EDEntityPigRenderer(ModelBase base, ModelBase base2, float f)
	{
		super(base, base2, f);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	protected void preRenderCallback(EntityLivingBase entity, float f)
	{
		super.preRenderCallback(entity, f);
		
		GL11.glScalef(3f, 3f, 3f);
	}

}
