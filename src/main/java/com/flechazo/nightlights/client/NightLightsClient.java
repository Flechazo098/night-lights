package com.flechazo.nightlights.client;

import com.flechazo.nightlights.init.ModBlock;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class NightLightsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        setRenderLayers();
    }
    private static void setRenderLayers() {
        // Night Light Blocks
        BlockRenderLayerMap.putBlock(ModBlock.FROG_BLACK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_BLUE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_BROWN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_CYAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_GRAY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_GREEN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_LIGHT_BLUE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_LIGHT_GRAY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_LIME, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_MAGENTA, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_ORANGE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_PINK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_PURPLE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_RED, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_WHITE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FROG_YELLOW, ChunkSectionLayer.CUTOUT);

        // Mushroom blocks
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_BLACK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_BLUE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_BROWN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_CYAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_GRAY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_GREEN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_LIGHT_BLUE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_LIGHT_GRAY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_LIME, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_MAGENTA, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_ORANGE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_PINK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_PURPLE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_RED, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_WHITE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.MUSHROOM_YELLOW, ChunkSectionLayer.CUTOUT);

        // Octopus blocks
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_BLACK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_BLUE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_BROWN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_CYAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_GRAY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_GREEN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_LIGHT_BLUE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_LIGHT_GRAY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_LIME, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_MAGENTA, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_ORANGE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_PINK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_PURPLE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_RED, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_WHITE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.OCTOPUS_YELLOW, ChunkSectionLayer.CUTOUT);

        // Hanging lights and fairy lights use cutout rendering
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_BLACK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_BLUE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_BROWN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_CYAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_DEFAULT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_GRAY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_GREEN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_LIGHT_BLUE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_LIGHT_GRAY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_LIME, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_MAGENTA, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_ORANGE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_PINK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_PURPLE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_RED, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_WHITE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.HANGING_LIGHTS_YELLOW, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_BLACK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_BLUE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_BROWN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_CYAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_DEFAULT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_GRAY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_GREEN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_LIGHT_BLUE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_LIGHT_GRAY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_LIME, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_MAGENTA, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_ORANGE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_PINK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_PURPLE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_RED, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_WHITE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlock.FAIRY_LIGHTS_YELLOW, ChunkSectionLayer.CUTOUT);
    }
}
