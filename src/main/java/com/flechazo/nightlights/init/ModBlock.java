package com.flechazo.nightlights.init;

import com.flechazo.nightlights.NightLights;
import com.flechazo.nightlights.block.CeilingLightBlock;
import com.flechazo.nightlights.block.NightLightFrogBlock;
import com.flechazo.nightlights.block.NightLightMushroomBlock;
import com.flechazo.nightlights.block.NightLightOctopusBlock;
import com.flechazo.nightlights.util.RegisterHelper;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NightLights.MODID);

    // Night Light Blocks (Frog, Mushroom, Octopus)
    public static final Supplier<Block> FROG_BLACK = registerNightLight("frog_black", "frog");
    public static final Supplier<Block> FROG_BLUE = registerNightLight("frog_blue", "frog");
    public static final Supplier<Block> FROG_BROWN = registerNightLight("frog_brown", "frog");
    public static final Supplier<Block> FROG_CYAN = registerNightLight("frog_cyan", "frog");
    public static final Supplier<Block> FROG_GRAY = registerNightLight("frog_gray", "frog");
    public static final Supplier<Block> FROG_GREEN = registerNightLight("frog_green", "frog");
    public static final Supplier<Block> FROG_LIGHT_BLUE = registerNightLight("frog_light_blue", "frog");
    public static final Supplier<Block> FROG_LIGHT_GRAY = registerNightLight("frog_light_gray", "frog");
    public static final Supplier<Block> FROG_LIME = registerNightLight("frog_lime", "frog");
    public static final Supplier<Block> FROG_MAGENTA = registerNightLight("frog_magenta", "frog");
    public static final Supplier<Block> FROG_ORANGE = registerNightLight("frog_orange", "frog");
    public static final Supplier<Block> FROG_PINK = registerNightLight("frog_pink", "frog");
    public static final Supplier<Block> FROG_PURPLE = registerNightLight("frog_purple", "frog");
    public static final Supplier<Block> FROG_RED = registerNightLight("frog_red", "frog");
    public static final Supplier<Block> FROG_WHITE = registerNightLight("frog_white", "frog");
    public static final Supplier<Block> FROG_YELLOW = registerNightLight("frog_yellow", "frog");

    public static final Supplier<Block> MUSHROOM_BLACK = registerNightLight("mushroom_black", "mushroom");
    public static final Supplier<Block> MUSHROOM_BLUE = registerNightLight("mushroom_blue", "mushroom");
    public static final Supplier<Block> MUSHROOM_BROWN = registerNightLight("mushroom_brown", "mushroom");
    public static final Supplier<Block> MUSHROOM_CYAN = registerNightLight("mushroom_cyan", "mushroom");
    public static final Supplier<Block> MUSHROOM_GRAY = registerNightLight("mushroom_gray", "mushroom");
    public static final Supplier<Block> MUSHROOM_GREEN = registerNightLight("mushroom_green", "mushroom");
    public static final Supplier<Block> MUSHROOM_LIGHT_BLUE = registerNightLight("mushroom_light_blue", "mushroom");
    public static final Supplier<Block> MUSHROOM_LIGHT_GRAY = registerNightLight("mushroom_light_gray", "mushroom");
    public static final Supplier<Block> MUSHROOM_LIME = registerNightLight("mushroom_lime", "mushroom");
    public static final Supplier<Block> MUSHROOM_MAGENTA = registerNightLight("mushroom_magenta", "mushroom");
    public static final Supplier<Block> MUSHROOM_ORANGE = registerNightLight("mushroom_orange", "mushroom");
    public static final Supplier<Block> MUSHROOM_PINK = registerNightLight("mushroom_pink", "mushroom");
    public static final Supplier<Block> MUSHROOM_PURPLE = registerNightLight("mushroom_purple", "mushroom");
    public static final Supplier<Block> MUSHROOM_RED = registerNightLight("mushroom_red", "mushroom");
    public static final Supplier<Block> MUSHROOM_WHITE = registerNightLight("mushroom_white", "mushroom");
    public static final Supplier<Block> MUSHROOM_YELLOW = registerNightLight("mushroom_yellow", "mushroom");

    public static final Supplier<Block> OCTOPUS_BLACK = registerNightLight("octopus_black", "octopus");
    public static final Supplier<Block> OCTOPUS_BLUE = registerNightLight("octopus_blue", "octopus");
    public static final Supplier<Block> OCTOPUS_BROWN = registerNightLight("octopus_brown", "octopus");
    public static final Supplier<Block> OCTOPUS_CYAN = registerNightLight("octopus_cyan", "octopus");
    public static final Supplier<Block> OCTOPUS_GRAY = registerNightLight("octopus_gray", "octopus");
    public static final Supplier<Block> OCTOPUS_GREEN = registerNightLight("octopus_green", "octopus");
    public static final Supplier<Block> OCTOPUS_LIGHT_BLUE = registerNightLight("octopus_light_blue", "octopus");
    public static final Supplier<Block> OCTOPUS_LIGHT_GRAY = registerNightLight("octopus_light_gray", "octopus");
    public static final Supplier<Block> OCTOPUS_LIME = registerNightLight("octopus_lime", "octopus");
    public static final Supplier<Block> OCTOPUS_MAGENTA = registerNightLight("octopus_magenta", "octopus");
    public static final Supplier<Block> OCTOPUS_ORANGE = registerNightLight("octopus_orange", "octopus");
    public static final Supplier<Block> OCTOPUS_PINK = registerNightLight("octopus_pink", "octopus");
    public static final Supplier<Block> OCTOPUS_PURPLE = registerNightLight("octopus_purple", "octopus");
    public static final Supplier<Block> OCTOPUS_RED = registerNightLight("octopus_red", "octopus");
    public static final Supplier<Block> OCTOPUS_WHITE = registerNightLight("octopus_white", "octopus");
    public static final Supplier<Block> OCTOPUS_YELLOW = registerNightLight("octopus_yellow", "octopus");

    // Hanging Lights
    public static final Supplier<Block> HANGING_LIGHTS_BLACK = registerCeilingLight("hanging_lights_black");
    public static final Supplier<Block> HANGING_LIGHTS_BLUE = registerCeilingLight("hanging_lights_blue");
    public static final Supplier<Block> HANGING_LIGHTS_BROWN = registerCeilingLight("hanging_lights_brown");
    public static final Supplier<Block> HANGING_LIGHTS_CYAN = registerCeilingLight("hanging_lights_cyan");
    public static final Supplier<Block> HANGING_LIGHTS_DEFAULT = registerCeilingLight("hanging_lights_default");
    public static final Supplier<Block> HANGING_LIGHTS_GRAY = registerCeilingLight("hanging_lights_gray");
    public static final Supplier<Block> HANGING_LIGHTS_GREEN = registerCeilingLight("hanging_lights_green");
    public static final Supplier<Block> HANGING_LIGHTS_LIGHT_BLUE = registerCeilingLight("hanging_lights_light_blue");
    public static final Supplier<Block> HANGING_LIGHTS_LIGHT_GRAY = registerCeilingLight("hanging_lights_light_gray");
    public static final Supplier<Block> HANGING_LIGHTS_LIME = registerCeilingLight("hanging_lights_lime");
    public static final Supplier<Block> HANGING_LIGHTS_MAGENTA = registerCeilingLight("hanging_lights_magenta");
    public static final Supplier<Block> HANGING_LIGHTS_ORANGE = registerCeilingLight("hanging_lights_orange");
    public static final Supplier<Block> HANGING_LIGHTS_PINK = registerCeilingLight("hanging_lights_pink");
    public static final Supplier<Block> HANGING_LIGHTS_PURPLE = registerCeilingLight("hanging_lights_purple");
    public static final Supplier<Block> HANGING_LIGHTS_RED = registerCeilingLight("hanging_lights_red");
    public static final Supplier<Block> HANGING_LIGHTS_WHITE = registerCeilingLight("hanging_lights_white");
    public static final Supplier<Block> HANGING_LIGHTS_YELLOW = registerCeilingLight("hanging_lights_yellow");

    // Fairy Lights
    public static final Supplier<Block> FAIRY_LIGHTS_BLACK = registerCeilingLight("fairy_lights_black");
    public static final Supplier<Block> FAIRY_LIGHTS_BLUE = registerCeilingLight("fairy_lights_blue");
    public static final Supplier<Block> FAIRY_LIGHTS_BROWN = registerCeilingLight("fairy_lights_brown");
    public static final Supplier<Block> FAIRY_LIGHTS_CYAN = registerCeilingLight("fairy_lights_cyan");
    public static final Supplier<Block> FAIRY_LIGHTS_DEFAULT = registerCeilingLight("fairy_lights_default");
    public static final Supplier<Block> FAIRY_LIGHTS_GRAY = registerCeilingLight("fairy_lights_gray");
    public static final Supplier<Block> FAIRY_LIGHTS_GREEN = registerCeilingLight("fairy_lights_green");
    public static final Supplier<Block> FAIRY_LIGHTS_LIGHT_BLUE = registerCeilingLight("fairy_lights_light_blue");
    public static final Supplier<Block> FAIRY_LIGHTS_LIGHT_GRAY = registerCeilingLight("fairy_lights_light_gray");
    public static final Supplier<Block> FAIRY_LIGHTS_LIME = registerCeilingLight("fairy_lights_lime");
    public static final Supplier<Block> FAIRY_LIGHTS_MAGENTA = registerCeilingLight("fairy_lights_magenta");
    public static final Supplier<Block> FAIRY_LIGHTS_ORANGE = registerCeilingLight("fairy_lights_orange");
    public static final Supplier<Block> FAIRY_LIGHTS_PINK = registerCeilingLight("fairy_lights_pink");
    public static final Supplier<Block> FAIRY_LIGHTS_PURPLE = registerCeilingLight("fairy_lights_purple");
    public static final Supplier<Block> FAIRY_LIGHTS_RED = registerCeilingLight("fairy_lights_red");
    public static final Supplier<Block> FAIRY_LIGHTS_WHITE = registerCeilingLight("fairy_lights_white");
    public static final Supplier<Block> FAIRY_LIGHTS_YELLOW = registerCeilingLight("fairy_lights_yellow");

    private static Supplier<Block> registerNightLight(String name, String type) {
        ResourceKey<Block> blockKey = RegisterHelper.blockKey(name);
        return BLOCKS.register(name, () -> {
            BlockBehaviour.Properties properties = BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT)
                    .noOcclusion()
                    .sound(SoundType.GLASS)
                    .setId(blockKey);

            return switch (type) {
                case "mushroom" -> new NightLightMushroomBlock(properties);
                case "octopus" -> new NightLightOctopusBlock(properties);
                default -> new NightLightFrogBlock(properties);
            };
        });
    }

    private static Supplier<Block> registerCeilingLight(String name) {
        ResourceKey<Block> blockKey = RegisterHelper.blockKey(name);
        return BLOCKS.register(name, () -> new CeilingLightBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT)
                        .noOcclusion()
                        .sound(SoundType.GLASS)
                        .noCollision()
                        .instabreak()
                        .setId(blockKey)
        ));
    }
}