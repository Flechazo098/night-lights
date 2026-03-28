package com.flechazo.nightlights.util;

import com.flechazo.nightlights.NightLights;
import net.minecraft.resources.ResourceLocation;

public class RegisterHelper {
    public static ResourceLocation id(String name) {
        return new ResourceLocation(NightLights.MODID, name);
    }
}