package com.oery.nonightvision.mixins;

import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(EntityRenderer.class)
public abstract class MixinEntityRenderer  {
    @Overwrite
    public float getNightVisionBrightness(EntityLivingBase entity, float partialTicks) {
        return 0.0F;
    }
}
