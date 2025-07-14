package com.samgj15.nightlights.fabric.items;

import com.samgj15.nightlights.items.WearableBlockItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class FabricWearableBlockItem extends WearableBlockItem {

    public FabricWearableBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    /**
     * 检查物品是否可以装备到指定槽位
     */
    public boolean canEquipToSlot(ItemStack stack, EquipmentSlot slot, LivingEntity entity) {
        return slot == EquipmentSlot.HEAD;
    }

    /**
     * 获取物品应该装备到的槽位
     */
    public EquipmentSlot getEquipmentSlot() {
        return EquipmentSlot.HEAD;
    }
}