package com.samgj15.nightlights;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class NightLightsCreativeTab {

    public static final RegistrySupplier<CreativeModeTab> NIGHT_LIGHTS_TAB = NightLights.CREATIVE_TABS.register("night_lights", () ->
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemGroup.nightlights"))
                    .icon(() -> new ItemStack(NightLightsItems.FROG_RED.get()))
                    .displayItems((parameters, output) -> {
                        // Add all night light items
                        output.accept(NightLightsItems.FROG_BLACK.get());
                        output.accept(NightLightsItems.FROG_BLUE.get());
                        output.accept(NightLightsItems.FROG_BROWN.get());
                        output.accept(NightLightsItems.FROG_CYAN.get());
                        output.accept(NightLightsItems.FROG_GRAY.get());
                        output.accept(NightLightsItems.FROG_GREEN.get());
                        output.accept(NightLightsItems.FROG_LIGHT_BLUE.get());
                        output.accept(NightLightsItems.FROG_LIGHT_GRAY.get());
                        output.accept(NightLightsItems.FROG_LIME.get());
                        output.accept(NightLightsItems.FROG_MAGENTA.get());
                        output.accept(NightLightsItems.FROG_ORANGE.get());
                        output.accept(NightLightsItems.FROG_PINK.get());
                        output.accept(NightLightsItems.FROG_PURPLE.get());
                        output.accept(NightLightsItems.FROG_RED.get());
                        output.accept(NightLightsItems.FROG_WHITE.get());
                        output.accept(NightLightsItems.FROG_YELLOW.get());

                        // Add mushroom items
                        output.accept(NightLightsItems.MUSHROOM_BLACK.get());
                        output.accept(NightLightsItems.MUSHROOM_BLUE.get());
                        output.accept(NightLightsItems.MUSHROOM_BROWN.get());
                        output.accept(NightLightsItems.MUSHROOM_CYAN.get());
                        output.accept(NightLightsItems.MUSHROOM_GRAY.get());
                        output.accept(NightLightsItems.MUSHROOM_GREEN.get());
                        output.accept(NightLightsItems.MUSHROOM_LIGHT_BLUE.get());
                        output.accept(NightLightsItems.MUSHROOM_LIGHT_GRAY.get());
                        output.accept(NightLightsItems.MUSHROOM_LIME.get());
                        output.accept(NightLightsItems.MUSHROOM_MAGENTA.get());
                        output.accept(NightLightsItems.MUSHROOM_ORANGE.get());
                        output.accept(NightLightsItems.MUSHROOM_PINK.get());
                        output.accept(NightLightsItems.MUSHROOM_PURPLE.get());
                        output.accept(NightLightsItems.MUSHROOM_RED.get());
                        output.accept(NightLightsItems.MUSHROOM_WHITE.get());
                        output.accept(NightLightsItems.MUSHROOM_YELLOW.get());

                        // Add octopus items
                        output.accept(NightLightsItems.OCTOPUS_BLACK.get());
                        output.accept(NightLightsItems.OCTOPUS_BLUE.get());
                        output.accept(NightLightsItems.OCTOPUS_BROWN.get());
                        output.accept(NightLightsItems.OCTOPUS_CYAN.get());
                        output.accept(NightLightsItems.OCTOPUS_GRAY.get());
                        output.accept(NightLightsItems.OCTOPUS_GREEN.get());
                        output.accept(NightLightsItems.OCTOPUS_LIGHT_BLUE.get());
                        output.accept(NightLightsItems.OCTOPUS_LIGHT_GRAY.get());
                        output.accept(NightLightsItems.OCTOPUS_LIME.get());
                        output.accept(NightLightsItems.OCTOPUS_MAGENTA.get());
                        output.accept(NightLightsItems.OCTOPUS_ORANGE.get());
                        output.accept(NightLightsItems.OCTOPUS_PINK.get());
                        output.accept(NightLightsItems.OCTOPUS_PURPLE.get());
                        output.accept(NightLightsItems.OCTOPUS_RED.get());
                        output.accept(NightLightsItems.OCTOPUS_WHITE.get());
                        output.accept(NightLightsItems.OCTOPUS_YELLOW.get());

                        // Add hanging lights
                        output.accept(NightLightsItems.HANGING_LIGHTS_BLACK.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_BLUE.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_BROWN.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_CYAN.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_DEFAULT.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_GRAY.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_GREEN.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_LIGHT_BLUE.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_LIGHT_GRAY.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_LIME.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_MAGENTA.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_ORANGE.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_PINK.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_PURPLE.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_RED.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_WHITE.get());
                        output.accept(NightLightsItems.HANGING_LIGHTS_YELLOW.get());

                        // Add fairy lights
                        output.accept(NightLightsItems.FAIRY_LIGHTS_BLACK.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_BLUE.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_BROWN.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_CYAN.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_DEFAULT.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_GRAY.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_GREEN.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_LIGHT_BLUE.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_LIGHT_GRAY.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_LIME.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_MAGENTA.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_ORANGE.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_PINK.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_PURPLE.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_RED.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_WHITE.get());
                        output.accept(NightLightsItems.FAIRY_LIGHTS_YELLOW.get());
                    })
                    .build()
    );

    public static void init() {
        NightLights.LOGGER.info("Registering creative tab");
    }
}