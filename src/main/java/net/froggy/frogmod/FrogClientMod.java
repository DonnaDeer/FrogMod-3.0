package net.froggy.frogmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.froggy.frogmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class FrogClientMod implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.MOREL);
	}
}