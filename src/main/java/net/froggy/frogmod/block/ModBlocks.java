package net.froggy.frogmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.froggy.frogmod.FrogMod;

public class ModBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f)));

    public static final Block PACKED_BAMBOO = registerBlock("packed_bamboo",
            new PillarBlock(FabricBlockSettings.of(Material.BAMBOO).strength(0.0f)));
    public static final Block PACKED_SUGARCANE = registerBlock("packed_sugarcane",
            new PillarBlock(FabricBlockSettings.of(Material.PLANT).strength(0.0f)));

    public static final Block BAMBOO_FENCE = registerBlock("bamboo_fence",
            new FenceBlock(FabricBlockSettings.of(Material.BAMBOO).strength(0.0f)));

    public static final Block MOREL = registerBlock("morel",
            new ModMushroom(FabricBlockSettings.copy(Blocks.DANDELION).noCollision().nonOpaque().breakInstantly().sounds(BlockSoundGroup.GRASS)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(FrogMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(FrogMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.MISC)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + FrogMod.MOD_ID);
    }
}