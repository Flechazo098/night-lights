package com.flechazo.nightlights.init;

import com.flechazo.nightlights.NightLights;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, NightLights.MODID);

    public static final Supplier<CreativeModeTab> NIGHT_LIGHTS_TAB = CREATIVE_MODE_TABS.register("nightlights", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nightlights"))
            .icon(() -> new ItemStack(ModItem.FROG_RED.get()))
            .displayItems((parameters, output) -> {
                // Add all night light items
                output.accept(ModItem.FROG_BLACK.get());
                output.accept(ModItem.FROG_BLUE.get());
                output.accept(ModItem.FROG_BROWN.get());
                output.accept(ModItem.FROG_CYAN.get());
                output.accept(ModItem.FROG_GRAY.get());
                output.accept(ModItem.FROG_GREEN.get());
                output.accept(ModItem.FROG_LIGHT_BLUE.get());
                output.accept(ModItem.FROG_LIGHT_GRAY.get());
                output.accept(ModItem.FROG_LIME.get());
                output.accept(ModItem.FROG_MAGENTA.get());
                output.accept(ModItem.FROG_ORANGE.get());
                output.accept(ModItem.FROG_PINK.get());
                output.accept(ModItem.FROG_PURPLE.get());
                output.accept(ModItem.FROG_RED.get());
                output.accept(ModItem.FROG_WHITE.get());
                output.accept(ModItem.FROG_YELLOW.get());

                // Add mushroom items
                output.accept(ModItem.MUSHROOM_BLACK.get());
                output.accept(ModItem.MUSHROOM_BLUE.get());
                output.accept(ModItem.MUSHROOM_BROWN.get());
                output.accept(ModItem.MUSHROOM_CYAN.get());
                output.accept(ModItem.MUSHROOM_GRAY.get());
                output.accept(ModItem.MUSHROOM_GREEN.get());
                output.accept(ModItem.MUSHROOM_LIGHT_BLUE.get());
                output.accept(ModItem.MUSHROOM_LIGHT_GRAY.get());
                output.accept(ModItem.MUSHROOM_LIME.get());
                output.accept(ModItem.MUSHROOM_MAGENTA.get());
                output.accept(ModItem.MUSHROOM_ORANGE.get());
                output.accept(ModItem.MUSHROOM_PINK.get());
                output.accept(ModItem.MUSHROOM_PURPLE.get());
                output.accept(ModItem.MUSHROOM_RED.get());
                output.accept(ModItem.MUSHROOM_WHITE.get());
                output.accept(ModItem.MUSHROOM_YELLOW.get());

                // Add octopus items
                output.accept(ModItem.OCTOPUS_BLACK.get());
                output.accept(ModItem.OCTOPUS_BLUE.get());
                output.accept(ModItem.OCTOPUS_BROWN.get());
                output.accept(ModItem.OCTOPUS_CYAN.get());
                output.accept(ModItem.OCTOPUS_GRAY.get());
                output.accept(ModItem.OCTOPUS_GREEN.get());
                output.accept(ModItem.OCTOPUS_LIGHT_BLUE.get());
                output.accept(ModItem.OCTOPUS_LIGHT_GRAY.get());
                output.accept(ModItem.OCTOPUS_LIME.get());
                output.accept(ModItem.OCTOPUS_MAGENTA.get());
                output.accept(ModItem.OCTOPUS_ORANGE.get());
                output.accept(ModItem.OCTOPUS_PINK.get());
                output.accept(ModItem.OCTOPUS_PURPLE.get());
                output.accept(ModItem.OCTOPUS_RED.get());
                output.accept(ModItem.OCTOPUS_WHITE.get());
                output.accept(ModItem.OCTOPUS_YELLOW.get());

                // Add hanging lights
                output.accept(ModItem.HANGING_LIGHTS_BLACK.get());
                output.accept(ModItem.HANGING_LIGHTS_BLUE.get());
                output.accept(ModItem.HANGING_LIGHTS_BROWN.get());
                output.accept(ModItem.HANGING_LIGHTS_CYAN.get());
                output.accept(ModItem.HANGING_LIGHTS_DEFAULT.get());
                output.accept(ModItem.HANGING_LIGHTS_GRAY.get());
                output.accept(ModItem.HANGING_LIGHTS_GREEN.get());
                output.accept(ModItem.HANGING_LIGHTS_LIGHT_BLUE.get());
                output.accept(ModItem.HANGING_LIGHTS_LIGHT_GRAY.get());
                output.accept(ModItem.HANGING_LIGHTS_LIME.get());
                output.accept(ModItem.HANGING_LIGHTS_MAGENTA.get());
                output.accept(ModItem.HANGING_LIGHTS_ORANGE.get());
                output.accept(ModItem.HANGING_LIGHTS_PINK.get());
                output.accept(ModItem.HANGING_LIGHTS_PURPLE.get());
                output.accept(ModItem.HANGING_LIGHTS_RED.get());
                output.accept(ModItem.HANGING_LIGHTS_WHITE.get());
                output.accept(ModItem.HANGING_LIGHTS_YELLOW.get());

                // Add fairy lights
                output.accept(ModItem.FAIRY_LIGHTS_BLACK.get());
                output.accept(ModItem.FAIRY_LIGHTS_BLUE.get());
                output.accept(ModItem.FAIRY_LIGHTS_BROWN.get());
                output.accept(ModItem.FAIRY_LIGHTS_CYAN.get());
                output.accept(ModItem.FAIRY_LIGHTS_DEFAULT.get());
                output.accept(ModItem.FAIRY_LIGHTS_GRAY.get());
                output.accept(ModItem.FAIRY_LIGHTS_GREEN.get());
                output.accept(ModItem.FAIRY_LIGHTS_LIGHT_BLUE.get());
                output.accept(ModItem.FAIRY_LIGHTS_LIGHT_GRAY.get());
                output.accept(ModItem.FAIRY_LIGHTS_LIME.get());
                output.accept(ModItem.FAIRY_LIGHTS_MAGENTA.get());
                output.accept(ModItem.FAIRY_LIGHTS_ORANGE.get());
                output.accept(ModItem.FAIRY_LIGHTS_PINK.get());
                output.accept(ModItem.FAIRY_LIGHTS_PURPLE.get());
                output.accept(ModItem.FAIRY_LIGHTS_RED.get());
                output.accept(ModItem.FAIRY_LIGHTS_WHITE.get());
                output.accept(ModItem.FAIRY_LIGHTS_YELLOW.get());
            })
            .build());
}