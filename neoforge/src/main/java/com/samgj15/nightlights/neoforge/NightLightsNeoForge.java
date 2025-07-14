package com.samgj15.nightlights.neoforge;

import com.samgj15.nightlights.NightLights;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(NightLights.MOD_ID)
public class NightLightsNeoForge {

    public NightLightsNeoForge(IEventBus modEventBus) {
        NightLights.init();

        modEventBus.addListener(this::clientSetup);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(NightLights::initClient);
    }
}