package com.samgj15.nightlights.fabric;

import com.samgj15.nightlights.NightLights;
import net.fabricmc.api.ClientModInitializer;

public class NightLightsFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        NightLights.initClient();
    }
}