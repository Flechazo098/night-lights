package com.flechazo.nightlights;

import com.flechazo.nightlights.init.ModBlock;
import com.flechazo.nightlights.init.ModCreativeTab;
import com.flechazo.nightlights.init.ModItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NightLights.MODID)
public class NightLights {
    public static final String MODID = "nightlights";
    public NightLights() {
        var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register DeferredRegisters to the mod event bus
        ModBlock.BLOCKS.register(modEventBus);
        ModItem.ITEMS.register(modEventBus);
        ModCreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
