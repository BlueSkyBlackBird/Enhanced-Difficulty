package de.blueskyblackbird.enhanceddifficulty.extendedentitydata;

import net.minecraft.entity.ai.attributes.IAttribute;

public class EDSharedAttributes
{
	
	
	
	
	
	protected abstract static class AbstractBaseAttribute implements IAttribute
	{
		protected String unlocalizedName;
		protected double clampValue;
		protected double defaultValue;
		protected boolean shouldWatch; 
		
		public AbstractBaseAttribute(String unlocalizedName, double clampValue, double defaultValue, boolean shouldWatch)
		{
			super();
			this.unlocalizedName = unlocalizedName;
			this.clampValue = clampValue;
			this.defaultValue = defaultValue;
			this.shouldWatch = shouldWatch;
		}

		@Override
		public String getAttributeUnlocalizedName()
		{
			return unlocalizedName;
		}

		@Override
		public abstract double clampValue(double mod);

		@Override
		public double getDefaultValue()
		{
			return defaultValue;
		}

		@Override
		public boolean getShouldWatch()	
		{
			return shouldWatch;
		}
	}
}
