package com.flechazo.nightlights;

import com.flechazo.nightlights.init.ModBlock;
import com.flechazo.nightlights.init.ModCreativeTab;
import com.flechazo.nightlights.init.ModItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(NightLights.MODID)
public class NightLights {
        public static final String MODID = "nightlights";

        public NightLights(IEventBus modEventBus) {
                // Register DeferredRegisters to the mod event bus
                ModBlock.BLOCKS.register(modEventBus);
                ModItem.ITEMS.register(modEventBus);
                ModCreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
        }
}