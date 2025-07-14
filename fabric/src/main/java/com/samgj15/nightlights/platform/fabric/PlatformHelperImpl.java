package com.samgj15.nightlights.platform.fabric;

import com.samgj15.nightlights.fabric.items.FabricWearableBlockItem;
import com.samgj15.nightlights.items.WearableBlockItem;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class PlatformHelperImpl {

    public static WearableBlockItem createWearableBlockItem(Block block, Item.Properties properties) {
        return new FabricWearableBlockItem(block, properties);
    }

    public static void setRenderLayer(Supplier<Block> block, Object renderType) {
        if ("cutout".equals(renderType)) {
            BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.cutout());
        }
    }
}
