package com.samgj15.nightlights.fabric;

import com.samgj15.nightlights.NightLights;
import net.fabricmc.api.ModInitializer;

public class NightLightsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        NightLights.init();
    }
}