package net.droidbot.schpeedyboats.mixins;

import net.minecraft.entity.vehicle.BoatEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(BoatEntity.class)
public class BoatEntityMixin {

    @SuppressWarnings("InvalidInjectorMethodSignature")
    @ModifyVariable(method = "checkLocation", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/entity/vehicle/BoatEntity;getNearbySlipperiness()F"))
    protected float limitIceSlipperiness(float original) {
        return original * 0.952f;
    }
}