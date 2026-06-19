package com.pekar.angelblock.client.events;

import com.pekar.angelblock.Main;
import com.pekar.angelblock.client.keybinds.KeyRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

@EventBusSubscriber(modid = Main.MODID, value = Dist.CLIENT)
public final class ClientSetupEvents
{
    private ClientSetupEvents()
    {}

    public static void initStatic()
    {
        // do nothing
    }

    @SubscribeEvent
    public static void onRegisterKeyMappingsEvent(RegisterKeyMappingsEvent event)
    {
        event.register(KeyRegistry.NIGHT_VISION);
        event.register(KeyRegistry.JUMP_BOOST);
        event.register(KeyRegistry.SUPER_JUMP);
        event.register(KeyRegistry.GLOWING);
        event.register(KeyRegistry.REGENERATION);
        event.register(KeyRegistry.SLOW_FALLING);
        event.register(KeyRegistry.TOOL_MODE);
    }

    //@SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
        //KeyRegistry.registerKeys();
    }
}
