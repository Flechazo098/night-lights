package com.samgj15.nightlights.fabric.util;

import com.samgj15.nightlights.fabric.items.FabricWearableBlockItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class WearableItemHelper {

    /**
     * 检查物品是否为可穿戴的夜灯物品
     */
    public static boolean isWearableNightLight(ItemStack stack) {
        return stack.getItem() instanceof FabricWearableBlockItem;
    }

    /**
     * 获取可穿戴夜灯物品应该装备的槽位
     */
    public static EquipmentSlot getWearableSlot(ItemStack stack) {
        if (isWearableNightLight(stack)) {
            return EquipmentSlot.HEAD;
        }
        return null;
    }

    /**
     * 检查可穿戴夜灯物品是否可以装备到指定槽位
     */
    public static boolean canEquipToSlot(ItemStack stack, EquipmentSlot slot, LivingEntity entity) {
        if (isWearableNightLight(stack)) {
            return slot == EquipmentSlot.HEAD;
        }
        return false;
    }
}