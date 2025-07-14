package com.samgj15.nightlights.platform;

import com.samgj15.nightlights.items.WearableBlockItem;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class PlatformHelper {

    @ExpectPlatform
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Supplier<CreativeModeTab> registerCreativeTab(String name, Supplier<CreativeModeTab> tab) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void setRenderLayer(Supplier<Block> block, Object renderType) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static WearableBlockItem createWearableBlockItem(Block block, Item.Properties properties) {
        throw new AssertionError();
    }
}