package com.pekar.angelblock.clientaccess;

import net.minecraft.sounds.SoundEvent;

public interface INetworkClientAccessor
{
    boolean isPauseScreen();
    void playClientSound(SoundEvent sound, float volume, float pitch);
}
