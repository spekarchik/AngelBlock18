package com.pekar.angelblock;

import com.pekar.angelblock.client.NetworkClientAccessor;
import com.pekar.angelblock.clientaccess.ClientAccessor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = Main.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = Main.MODID, value = Dist.CLIENT)
public class ClientMain
{
    public ClientMain(ModContainer container)
    {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event)
    {
        ClientAccessor.init(new NetworkClientAccessor());
    }
}
