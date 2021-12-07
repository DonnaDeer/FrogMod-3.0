package net.froggy.frogmod;

import net.fabricmc.api.ModInitializer;
import net.froggy.frogmod.block.ModBlocks;
import net.froggy.frogmod.item.ModItems;

public class FrogMod implements ModInitializer {

	public static final String MOD_ID = "frogmod";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		System.out.println("Real!");
	}
}