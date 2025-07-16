package com.samgj15.nightlights;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NightLights {
    public static final String MOD_ID = "nightlights";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Architectury DeferredRegister
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static void init() {
        LOGGER.info("Initializing Night Lights");

        // 注册 DeferredRegister
        BLOCKS.register();
        ITEMS.register();
        CREATIVE_TABS.register();

        // 注册方块
        NightLightsBlocks.init();

        // 注册物品
        NightLightsItems.init();

        NightLightsCreativeTab.init();
    }

    public static void initClient() {
        LOGGER.info("Initializing Night Lights client");
        NightLightsClient.init();
    }

}