package net.froggy.frogmod.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.froggy.frogmod.block.ModBlocks;

public class ModRenderHelper {
    public static void setRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOREL, RenderLayer.getCutout());
    }
}