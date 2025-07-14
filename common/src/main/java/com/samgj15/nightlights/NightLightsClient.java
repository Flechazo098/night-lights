package com.samgj15.nightlights;

import com.samgj15.nightlights.platform.PlatformHelper;

public class NightLightsClient {

    public static void init() {
        NightLights.LOGGER.info("Initializing Night Lights client");

        // Set render layers for blocks that need cutout rendering
        // Only set for Fabric - NeoForge uses JSON configuration
        setRenderLayers();
    }

    private static void setRenderLayers() {
        // Night Light Blocks
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_BLACK, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_BLUE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_BROWN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_CYAN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_GRAY, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_GREEN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_LIGHT_BLUE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_LIGHT_GRAY, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_LIME, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_MAGENTA, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_ORANGE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_PINK, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_PURPLE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_RED, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_WHITE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FROG_YELLOW, "cutout");

        // Mushroom blocks
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_BLACK, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_BLUE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_BROWN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_CYAN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_GRAY, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_GREEN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_LIGHT_BLUE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_LIGHT_GRAY, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_LIME, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_MAGENTA, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_ORANGE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_PINK, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_PURPLE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_RED, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_WHITE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.MUSHROOM_YELLOW, "cutout");

        // Octopus blocks
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_BLACK, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_BLUE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_BROWN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_CYAN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_GRAY, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_GREEN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_LIGHT_BLUE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_LIGHT_GRAY, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_LIME, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_MAGENTA, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_ORANGE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_PINK, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_PURPLE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_RED, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_WHITE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.OCTOPUS_YELLOW, "cutout");

        // Hanging lights and fairy lights use cutout rendering
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_BLACK, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_BLUE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_BROWN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_CYAN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_DEFAULT, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_GRAY, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_GREEN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_LIGHT_BLUE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_LIGHT_GRAY, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_LIME, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_MAGENTA, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_ORANGE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_PINK, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_PURPLE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_RED, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_WHITE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.HANGING_LIGHTS_YELLOW, "cutout");

        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_BLACK, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_BLUE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_BROWN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_CYAN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_DEFAULT, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_GRAY, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_GREEN, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_LIGHT_BLUE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_LIGHT_GRAY, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_LIME, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_MAGENTA, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_ORANGE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_PINK, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_PURPLE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_RED, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_WHITE, "cutout");
        PlatformHelper.setRenderLayer(NightLightsBlocks.FAIRY_LIGHTS_YELLOW, "cutout");
    }
}