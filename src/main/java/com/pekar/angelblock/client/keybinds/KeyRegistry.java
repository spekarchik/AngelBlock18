package com.pekar.angelblock.client.keybinds;

import com.mojang.blaze3d.platform.InputConstants;
import com.pekar.angelblock.Main;
import com.pekar.angelblock.keybinds.KeyBindNames;
import net.minecraft.client.KeyMapping;

import static com.pekar.angelblock.utils.Resources.createResourceLocation;

public class KeyRegistry
{
    private static final KeyMapping.Category KEY_CATEGORY_GENERAL =
            new KeyMapping.Category(createResourceLocation(Main.MODID, "general"));

    public static final KeyMapping NIGHT_VISION = createKeyMapping(KeyBindNames.NIGHT_VISION, InputConstants.KEY_V);
    public static final KeyMapping JUMP_BOOST = createKeyMapping(KeyBindNames.JUMP_BOOST, InputConstants.KEY_C);
    public static final KeyMapping SUPER_JUMP = createKeyMapping(KeyBindNames.SUPER_JUMP, InputConstants.KEY_X);
    public static final KeyMapping GLOWING = createKeyMapping(KeyBindNames.GLOWING, InputConstants.KEY_G);
    public static final KeyMapping REGENERATION = createKeyMapping(KeyBindNames.REGENERATION, InputConstants.KEY_H);
    public static final KeyMapping SLOW_FALLING = createKeyMapping(KeyBindNames.SLOW_FALLING, InputConstants.KEY_TAB);
    public static final KeyMapping TOOL_MODE = createKeyMapping(KeyBindNames.TOOL_MODE, InputConstants.KEY_R);

    private static KeyMapping createKeyMapping(String name, int keycode)
    {
        String fullName = "key." + Main.MODID + "." + name;
        return new KeyMapping(fullName, keycode, KEY_CATEGORY_GENERAL);
    }
}
