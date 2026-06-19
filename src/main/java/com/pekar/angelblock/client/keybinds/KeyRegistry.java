package com.pekar.angelblock.client.keybinds;

import com.mojang.blaze3d.platform.InputConstants;
import com.pekar.angelblock.Main;
import com.pekar.angelblock.keybinds.KeyBindNames;
import net.minecraft.client.KeyMapping;

public class KeyRegistry
{
    private static final String category = Main.MODNAME;
    public static final KeyMapping NIGHT_VISION = createKeyMapping(KeyBindNames.NIGHT_VISION, category, InputConstants.KEY_V);
    public static final KeyMapping JUMP_BOOST = createKeyMapping(KeyBindNames.JUMP_BOOST, category, InputConstants.KEY_C);
    public static final KeyMapping SUPER_JUMP = createKeyMapping(KeyBindNames.SUPER_JUMP, category, InputConstants.KEY_X);
    public static final KeyMapping GLOWING = createKeyMapping(KeyBindNames.GLOWING, category, InputConstants.KEY_G);
    public static final KeyMapping REGENERATION = createKeyMapping(KeyBindNames.REGENERATION, category, InputConstants.KEY_H);
    public static final KeyMapping SLOW_FALLING = createKeyMapping(KeyBindNames.SLOW_FALLING, category, InputConstants.KEY_TAB);
    public static final KeyMapping TOOL_MODE = createKeyMapping(KeyBindNames.TOOL_MODE, category, InputConstants.KEY_R);

    private static KeyMapping createKeyMapping(String name, String category, int keycode)
    {
        String fullName = "key." + Main.MODID + "." + name;
        return new KeyMapping(fullName, keycode, category);
    }
}
