package com.samgj15.nightlights.fabric.mixins;

import com.samgj15.nightlights.fabric.util.WearableItemHelper;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(method = "getEquipmentSlotForItem", at = @At("HEAD"), cancellable = true)
    private static void nightlights$getEquipmentSlotForWearableItems(ItemStack stack, CallbackInfoReturnable<EquipmentSlot> cir) {
        EquipmentSlot slot = WearableItemHelper.getWearableSlot(stack);
        if (slot != null) {
            cir.setReturnValue(slot);
        }
    }
}