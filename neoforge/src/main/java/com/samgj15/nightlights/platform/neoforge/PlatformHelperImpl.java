package com.samgj15.nightlights.platform.neoforge;

import com.samgj15.nightlights.items.WearableBlockItem;
import com.samgj15.nightlights.neoforge.items.NeoForgeWearableBlockItem;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class PlatformHelperImpl {
    public static WearableBlockItem createWearableBlockItem(Block block, Item.Properties properties) {
        return new NeoForgeWearableBlockItem(block, properties);
    }

    public static void setRenderLayer(Supplier<? extends Block> block, Object renderType) {
        if ("cutout".equals(renderType)) {
            ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout());
        }
    }
}