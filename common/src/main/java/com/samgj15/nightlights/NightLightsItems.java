package com.samgj15.nightlights;

import com.samgj15.nightlights.items.WearableBlockItem;
import com.samgj15.nightlights.platform.PlatformHelper;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class NightLightsItems {

    // Night Light Items
    public static final RegistrySupplier<Item> FROG_BLACK = registerWearableBlockItem("frog_black", NightLightsBlocks.FROG_BLACK);
    public static final RegistrySupplier<Item> FROG_BLUE = registerWearableBlockItem("frog_blue", NightLightsBlocks.FROG_BLUE);
    public static final RegistrySupplier<Item> FROG_BROWN = registerWearableBlockItem("frog_brown", NightLightsBlocks.FROG_BROWN);
    public static final RegistrySupplier<Item> FROG_CYAN = registerWearableBlockItem("frog_cyan", NightLightsBlocks.FROG_CYAN);
    public static final RegistrySupplier<Item> FROG_GRAY = registerWearableBlockItem("frog_gray", NightLightsBlocks.FROG_GRAY);
    public static final RegistrySupplier<Item> FROG_GREEN = registerWearableBlockItem("frog_green", NightLightsBlocks.FROG_GREEN);
    public static final RegistrySupplier<Item> FROG_LIGHT_BLUE = registerWearableBlockItem("frog_light_blue", NightLightsBlocks.FROG_LIGHT_BLUE);
    public static final RegistrySupplier<Item> FROG_LIGHT_GRAY = registerWearableBlockItem("frog_light_gray", NightLightsBlocks.FROG_LIGHT_GRAY);
    public static final RegistrySupplier<Item> FROG_LIME = registerWearableBlockItem("frog_lime", NightLightsBlocks.FROG_LIME);
    public static final RegistrySupplier<Item> FROG_MAGENTA = registerWearableBlockItem("frog_magenta", NightLightsBlocks.FROG_MAGENTA);
    public static final RegistrySupplier<Item> FROG_ORANGE = registerWearableBlockItem("frog_orange", NightLightsBlocks.FROG_ORANGE);
    public static final RegistrySupplier<Item> FROG_PINK = registerWearableBlockItem("frog_pink", NightLightsBlocks.FROG_PINK);
    public static final RegistrySupplier<Item> FROG_PURPLE = registerWearableBlockItem("frog_purple", NightLightsBlocks.FROG_PURPLE);
    public static final RegistrySupplier<Item> FROG_RED = registerWearableBlockItem("frog_red", NightLightsBlocks.FROG_RED);
    public static final RegistrySupplier<Item> FROG_WHITE = registerWearableBlockItem("frog_white", NightLightsBlocks.FROG_WHITE);
    public static final RegistrySupplier<Item> FROG_YELLOW = registerWearableBlockItem("frog_yellow", NightLightsBlocks.FROG_YELLOW);

    public static final RegistrySupplier<Item> MUSHROOM_BLACK = registerWearableBlockItem("mushroom_black", NightLightsBlocks.MUSHROOM_BLACK);
    public static final RegistrySupplier<Item> MUSHROOM_BLUE = registerWearableBlockItem("mushroom_blue", NightLightsBlocks.MUSHROOM_BLUE);
    public static final RegistrySupplier<Item> MUSHROOM_BROWN = registerWearableBlockItem("mushroom_brown", NightLightsBlocks.MUSHROOM_BROWN);
    public static final RegistrySupplier<Item> MUSHROOM_CYAN = registerWearableBlockItem("mushroom_cyan", NightLightsBlocks.MUSHROOM_CYAN);
    public static final RegistrySupplier<Item> MUSHROOM_GRAY = registerWearableBlockItem("mushroom_gray", NightLightsBlocks.MUSHROOM_GRAY);
    public static final RegistrySupplier<Item> MUSHROOM_GREEN = registerWearableBlockItem("mushroom_green", NightLightsBlocks.MUSHROOM_GREEN);
    public static final RegistrySupplier<Item> MUSHROOM_LIGHT_BLUE = registerWearableBlockItem("mushroom_light_blue", NightLightsBlocks.MUSHROOM_LIGHT_BLUE);
    public static final RegistrySupplier<Item> MUSHROOM_LIGHT_GRAY = registerWearableBlockItem("mushroom_light_gray", NightLightsBlocks.MUSHROOM_LIGHT_GRAY);
    public static final RegistrySupplier<Item> MUSHROOM_LIME = registerWearableBlockItem("mushroom_lime", NightLightsBlocks.MUSHROOM_LIME);
    public static final RegistrySupplier<Item> MUSHROOM_MAGENTA = registerWearableBlockItem("mushroom_magenta", NightLightsBlocks.MUSHROOM_MAGENTA);
    public static final RegistrySupplier<Item> MUSHROOM_ORANGE = registerWearableBlockItem("mushroom_orange", NightLightsBlocks.MUSHROOM_ORANGE);
    public static final RegistrySupplier<Item> MUSHROOM_PINK = registerWearableBlockItem("mushroom_pink", NightLightsBlocks.MUSHROOM_PINK);
    public static final RegistrySupplier<Item> MUSHROOM_PURPLE = registerWearableBlockItem("mushroom_purple", NightLightsBlocks.MUSHROOM_PURPLE);
    public static final RegistrySupplier<Item> MUSHROOM_RED = registerWearableBlockItem("mushroom_red", NightLightsBlocks.MUSHROOM_RED);
    public static final RegistrySupplier<Item> MUSHROOM_WHITE = registerWearableBlockItem("mushroom_white", NightLightsBlocks.MUSHROOM_WHITE);
    public static final RegistrySupplier<Item> MUSHROOM_YELLOW = registerWearableBlockItem("mushroom_yellow", NightLightsBlocks.MUSHROOM_YELLOW);

    public static final RegistrySupplier<Item> OCTOPUS_BLACK = registerWearableBlockItem("octopus_black", NightLightsBlocks.OCTOPUS_BLACK);
    public static final RegistrySupplier<Item> OCTOPUS_BLUE = registerWearableBlockItem("octopus_blue", NightLightsBlocks.OCTOPUS_BLUE);
    public static final RegistrySupplier<Item> OCTOPUS_BROWN = registerWearableBlockItem("octopus_brown", NightLightsBlocks.OCTOPUS_BROWN);
    public static final RegistrySupplier<Item> OCTOPUS_CYAN = registerWearableBlockItem("octopus_cyan", NightLightsBlocks.OCTOPUS_CYAN);
    public static final RegistrySupplier<Item> OCTOPUS_GRAY = registerWearableBlockItem("octopus_gray", NightLightsBlocks.OCTOPUS_GRAY);
    public static final RegistrySupplier<Item> OCTOPUS_GREEN = registerWearableBlockItem("octopus_green", NightLightsBlocks.OCTOPUS_GREEN);
    public static final RegistrySupplier<Item> OCTOPUS_LIGHT_BLUE = registerWearableBlockItem("octopus_light_blue", NightLightsBlocks.OCTOPUS_LIGHT_BLUE);
    public static final RegistrySupplier<Item> OCTOPUS_LIGHT_GRAY = registerWearableBlockItem("octopus_light_gray", NightLightsBlocks.OCTOPUS_LIGHT_GRAY);
    public static final RegistrySupplier<Item> OCTOPUS_LIME = registerWearableBlockItem("octopus_lime", NightLightsBlocks.OCTOPUS_LIME);
    public static final RegistrySupplier<Item> OCTOPUS_MAGENTA = registerWearableBlockItem("octopus_magenta", NightLightsBlocks.OCTOPUS_MAGENTA);
    public static final RegistrySupplier<Item> OCTOPUS_ORANGE = registerWearableBlockItem("octopus_orange", NightLightsBlocks.OCTOPUS_ORANGE);
    public static final RegistrySupplier<Item> OCTOPUS_PINK = registerWearableBlockItem("octopus_pink", NightLightsBlocks.OCTOPUS_PINK);
    public static final RegistrySupplier<Item> OCTOPUS_PURPLE = registerWearableBlockItem("octopus_purple", NightLightsBlocks.OCTOPUS_PURPLE);
    public static final RegistrySupplier<Item> OCTOPUS_RED = registerWearableBlockItem("octopus_red", NightLightsBlocks.OCTOPUS_RED);
    public static final RegistrySupplier<Item> OCTOPUS_WHITE = registerWearableBlockItem("octopus_white", NightLightsBlocks.OCTOPUS_WHITE);
    public static final RegistrySupplier<Item> OCTOPUS_YELLOW = registerWearableBlockItem("octopus_yellow", NightLightsBlocks.OCTOPUS_YELLOW);

    // Hanging Lights Items
    public static final RegistrySupplier<Item> HANGING_LIGHTS_BLACK = registerBlockItem("hanging_lights_black", NightLightsBlocks.HANGING_LIGHTS_BLACK);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_BLUE = registerBlockItem("hanging_lights_blue", NightLightsBlocks.HANGING_LIGHTS_BLUE);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_BROWN = registerBlockItem("hanging_lights_brown", NightLightsBlocks.HANGING_LIGHTS_BROWN);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_CYAN = registerBlockItem("hanging_lights_cyan", NightLightsBlocks.HANGING_LIGHTS_CYAN);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_DEFAULT = registerBlockItem("hanging_lights_default", NightLightsBlocks.HANGING_LIGHTS_DEFAULT);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_GRAY = registerBlockItem("hanging_lights_gray", NightLightsBlocks.HANGING_LIGHTS_GRAY);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_GREEN = registerBlockItem("hanging_lights_green", NightLightsBlocks.HANGING_LIGHTS_GREEN);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_LIGHT_BLUE = registerBlockItem("hanging_lights_light_blue", NightLightsBlocks.HANGING_LIGHTS_LIGHT_BLUE);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_LIGHT_GRAY = registerBlockItem("hanging_lights_light_gray", NightLightsBlocks.HANGING_LIGHTS_LIGHT_GRAY);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_LIME = registerBlockItem("hanging_lights_lime", NightLightsBlocks.HANGING_LIGHTS_LIME);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_MAGENTA = registerBlockItem("hanging_lights_magenta", NightLightsBlocks.HANGING_LIGHTS_MAGENTA);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_ORANGE = registerBlockItem("hanging_lights_orange", NightLightsBlocks.HANGING_LIGHTS_ORANGE);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_PINK = registerBlockItem("hanging_lights_pink", NightLightsBlocks.HANGING_LIGHTS_PINK);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_PURPLE = registerBlockItem("hanging_lights_purple", NightLightsBlocks.HANGING_LIGHTS_PURPLE);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_RED = registerBlockItem("hanging_lights_red", NightLightsBlocks.HANGING_LIGHTS_RED);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_WHITE = registerBlockItem("hanging_lights_white", NightLightsBlocks.HANGING_LIGHTS_WHITE);
    public static final RegistrySupplier<Item> HANGING_LIGHTS_YELLOW = registerBlockItem("hanging_lights_yellow", NightLightsBlocks.HANGING_LIGHTS_YELLOW);

    // Fairy Lights Items
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_BLACK = registerBlockItem("fairy_lights_black", NightLightsBlocks.FAIRY_LIGHTS_BLACK);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_BLUE = registerBlockItem("fairy_lights_blue", NightLightsBlocks.FAIRY_LIGHTS_BLUE);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_BROWN = registerBlockItem("fairy_lights_brown", NightLightsBlocks.FAIRY_LIGHTS_BROWN);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_CYAN = registerBlockItem("fairy_lights_cyan", NightLightsBlocks.FAIRY_LIGHTS_CYAN);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_DEFAULT = registerBlockItem("fairy_lights_default", NightLightsBlocks.FAIRY_LIGHTS_DEFAULT);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_GRAY = registerBlockItem("fairy_lights_gray", NightLightsBlocks.FAIRY_LIGHTS_GRAY);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_GREEN = registerBlockItem("fairy_lights_green", NightLightsBlocks.FAIRY_LIGHTS_GREEN);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_LIGHT_BLUE = registerBlockItem("fairy_lights_light_blue", NightLightsBlocks.FAIRY_LIGHTS_LIGHT_BLUE);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_LIGHT_GRAY = registerBlockItem("fairy_lights_light_gray", NightLightsBlocks.FAIRY_LIGHTS_LIGHT_GRAY);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_LIME = registerBlockItem("fairy_lights_lime", NightLightsBlocks.FAIRY_LIGHTS_LIME);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_MAGENTA = registerBlockItem("fairy_lights_magenta", NightLightsBlocks.FAIRY_LIGHTS_MAGENTA);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_ORANGE = registerBlockItem("fairy_lights_orange", NightLightsBlocks.FAIRY_LIGHTS_ORANGE);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_PINK = registerBlockItem("fairy_lights_pink", NightLightsBlocks.FAIRY_LIGHTS_PINK);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_PURPLE = registerBlockItem("fairy_lights_purple", NightLightsBlocks.FAIRY_LIGHTS_PURPLE);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_RED = registerBlockItem("fairy_lights_red", NightLightsBlocks.FAIRY_LIGHTS_RED);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_WHITE = registerBlockItem("fairy_lights_white", NightLightsBlocks.FAIRY_LIGHTS_WHITE);
    public static final RegistrySupplier<Item> FAIRY_LIGHTS_YELLOW = registerBlockItem("fairy_lights_yellow", NightLightsBlocks.FAIRY_LIGHTS_YELLOW);

    private static RegistrySupplier<Item> registerWearableBlockItem(String name, RegistrySupplier<net.minecraft.world.level.block.Block> block) {
        return NightLights.ITEMS.register(name, () -> new WearableBlockItem(
                block.get(),
                new Item.Properties().setId(ResourceKey.create(
                        Registries.ITEM,
                        ResourceLocation.parse(NightLights.MOD_ID + ":" + name)
                ))
        ));
    }

    private static RegistrySupplier<Item> registerBlockItem(String name, RegistrySupplier<net.minecraft.world.level.block.Block> block) {
        return NightLights.ITEMS.register(name, () -> new BlockItem(
                block.get(),
                new Item.Properties().setId(ResourceKey.create(
                        Registries.ITEM,
                        ResourceLocation.parse(NightLights.MOD_ID + ":" + name)
                ))
        ));
    }

    public static void init() {
        NightLights.LOGGER.info("Registering items");
    }
}