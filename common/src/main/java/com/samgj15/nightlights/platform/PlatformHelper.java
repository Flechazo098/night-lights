package com.samgj15.nightlights.platform;

import com.samgj15.nightlights.items.WearableBlockItem;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class PlatformHelper {
    @ExpectPlatform
    public static void setRenderLayer(Supplier<Block> block, Object renderType) {
        throw new AssertionError();
    }
}