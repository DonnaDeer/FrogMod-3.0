package net.froggy.frogmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.froggy.frogmod.FrogMod;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item HEAVY_DIAMOND_SWORD = registerItem("heavy_diamond_sword",
            new SwordItem(ModToolMaterial.DIAMOND, 5, 1f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FrogMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + FrogMod.MOD_ID);
    }
}