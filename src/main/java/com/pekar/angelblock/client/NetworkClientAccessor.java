package com.pekar.angelblock.client;

import com.pekar.angelblock.clientaccess.INetworkClientAccessor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.PauseScreen;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.sounds.SoundEvent;

public class NetworkClientAccessor implements INetworkClientAccessor
{
    @Override
    public boolean isPauseScreen()
    {
        return Minecraft.getInstance().screen instanceof PauseScreen;
    }

    @Override
    public void playClientSound(SoundEvent sound, float volume, float pitch)
    {
        if (Minecraft.getInstance().player instanceof LocalPlayer player)
           player.playSound(sound, volume, pitch);
    }
}
