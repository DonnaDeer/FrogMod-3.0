package net.froggy.frogmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.froggy.frogmod.sound.ModSoundEvents;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.froggy.frogmod.FrogMod;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item HARVESTER = registerItem("harvester",
            new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item SOUL = registerItem("soul",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).fireproof()));
    public static final Item SOUL_GEM = registerItem("soul_gem",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).rarity(Rarity.RARE).fireproof()));
    public static final Item MUSIC_DISC_BHOE = registerItem("music_disc_bhoe",
            new ModMusicDiscItem(14, ModSoundEvents.MUSIC_DISC_BHOE, (new FabricItemSettings()).maxCount(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));

    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())
            .group(ItemGroup.FOOD)));

    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            new DaggerItem(ModToolMaterial.DIAMOND, 4, -2f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item HEAVY_DIAMOND_SWORD = registerItem("heavy_diamond_sword",
            new SwordItem(ModToolMaterial.DIAMOND, 6, -2.8f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new HammerItem(ModToolMaterial.DIAMOND, 8, -3.2f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new DaggerItem(ModToolMaterial.NETHERITE, 5, -2f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item HEAVY_NETHERITE_SWORD = registerItem("heavy_netherite_sword",
            new SwordItem(ModToolMaterial.NETHERITE, 7, -2.8f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new HammerItem(ModToolMaterial.NETHERITE, 9, -3.2f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

    public static final Item AMETHYST_ARROW = registerItem("amethyst_arrow",
            new AmethystArrowItem(new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FrogMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + FrogMod.MOD_ID);
    }
}