package com.samgj15.nightlights.platform;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class PlatformHelper {
    @ExpectPlatform
    public static void setRenderLayer(Supplier<Block> block, Object renderType) {
        throw new AssertionError();
    }
}