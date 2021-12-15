package net.froggy.frogmod.item;

import net.froggy.frogmod.entity.AmethystArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

class AmethystArrowItem extends Item {
    public AmethystArrowItem(Settings settings) {
        super(settings);
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        AmethystArrowEntity amethystArrowEntity = new AmethystArrowEntity(world, shooter);
        amethystArrowEntity.initFromStack(stack);
        return amethystArrowEntity;
    }
}
