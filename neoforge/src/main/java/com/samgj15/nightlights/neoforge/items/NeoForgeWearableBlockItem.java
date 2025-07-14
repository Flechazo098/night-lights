package com.samgj15.nightlights.neoforge.items;

import com.samgj15.nightlights.items.WearableBlockItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.extensions.IItemExtension;

public class NeoForgeWearableBlockItem extends WearableBlockItem implements IItemExtension {

    public NeoForgeWearableBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public boolean canEquip(ItemStack stack, EquipmentSlot armorType, LivingEntity entity) {
        return armorType == EquipmentSlot.HEAD;
    }
}