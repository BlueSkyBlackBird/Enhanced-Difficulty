package de.blueskyblackbird.enhanceddifficulty.moddata;

public class EDReference
{
	//=========================================================
	//-------------------- Core Mod Data-----------------------
    public static final String MOD_ID = "enhanceddifficulty";
    public static final String MOD_VERSION = "1.7.10-1.0.0";
    public static final String MOD_NAME = "Enhanced Difficulty";
    
    //=========================================================
    //-------------------- Proxy Data-----------------------
    public static final String CLIENT_PROXY = "de.blueskyblackbird.enhanceddifficulty.core.ClientProxy";
    public static final String COMMON_PROXY = "de.blueskyblackbird.enhanceddifficulty.core.CommonProxy";
    
    //=========================================================
    //-------------------- UI Data-----------------------
    public static final String GUI_FACTORY = "de.blueskyblackbird.enhanceddifficulty.gui.EDGuiFactory";
    
    //=========================================================
    //-------------------- Entity Data-----------------------
    /** Maximum range (to a player) for a monster to spawn is 7 chunks * 16 blocks*/
    public static final int MAX_SPAWN_RANGE = 16 * 7; 
    
    
    public static final String RESOURCE_PREFIX = EDReference.MOD_ID.toLowerCase() + ":";
}
