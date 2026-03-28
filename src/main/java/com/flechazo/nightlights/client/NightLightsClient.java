package com.flechazo.nightlights.client;

import com.flechazo.nightlights.init.ModBlock;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class NightLightsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        setRenderLayers();
    }

    private static void setRenderLayers() {
        // Night Light Blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_BLACK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_BLUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_BROWN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_CYAN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_GRAY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_GREEN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_LIGHT_BLUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_LIGHT_GRAY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_LIME, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_MAGENTA, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_ORANGE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_PINK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_PURPLE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_RED, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_WHITE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FROG_YELLOW, RenderType.cutout());

        // Mushroom blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_BLACK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_BLUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_BROWN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_CYAN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_GRAY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_GREEN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_LIGHT_BLUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_LIGHT_GRAY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_LIME, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_MAGENTA, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_ORANGE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_PINK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_PURPLE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_RED, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_WHITE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MUSHROOM_YELLOW, RenderType.cutout());

        // Octopus blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_BLACK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_BLUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_BROWN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_CYAN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_GRAY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_GREEN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_LIGHT_BLUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_LIGHT_GRAY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_LIME, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_MAGENTA, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_ORANGE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_PINK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_PURPLE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_RED, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_WHITE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.OCTOPUS_YELLOW, RenderType.cutout());

        // Hanging lights and fairy lights use cutout rendering
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_BLACK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_BLUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_BROWN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_CYAN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_DEFAULT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_GRAY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_GREEN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_LIGHT_BLUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_LIGHT_GRAY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_LIME, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_MAGENTA, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_ORANGE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_PINK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_PURPLE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_RED, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_WHITE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HANGING_LIGHTS_YELLOW, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_BLACK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_BLUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_BROWN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_CYAN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_DEFAULT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_GRAY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_GREEN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_LIGHT_BLUE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_LIGHT_GRAY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_LIME, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_MAGENTA, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_ORANGE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_PINK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_PURPLE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_RED, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_WHITE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.FAIRY_LIGHTS_YELLOW, RenderType.cutout());
    }
}
