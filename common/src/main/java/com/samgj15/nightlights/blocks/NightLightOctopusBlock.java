package com.samgj15.nightlights.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

public class NightLightOctopusBlock extends AbstractNightLightBlock {
    private static final VoxelShape SHAPE = Block.box(3, 0, 3, 13, 6, 13);

    public NightLightOctopusBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getShapeForType() {
        return SHAPE;
    }
}