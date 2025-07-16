package com.samgj15.nightlights.platform.neoforge;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class PlatformHelperImpl {
    public static void setRenderLayer(Supplier<? extends Block> block, Object renderType) {
        if ("cutout".equals(renderType)) {
            ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout());
        }
    }
}