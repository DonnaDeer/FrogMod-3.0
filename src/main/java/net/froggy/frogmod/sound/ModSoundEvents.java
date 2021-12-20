//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.froggy.frogmod.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSoundEvents {
    public static final SoundEvent MUSIC_DISC_BHOE = register("music_disc.bhoe");

    public ModSoundEvents() {
    }

    private static SoundEvent register(String id) {
        return (SoundEvent)Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(new Identifier(id)));
    }
}
