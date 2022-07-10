package org.absrack.fishing.Registries.EventRegistries;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.absrack.fishing.Utils.Utils;

public class SoundEventRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Utils.MOD_ID);
    public static final RegistryObject<SoundEvent> swordFishSound = SOUNDS.register("sword_fish_sound",()->new SoundEvent(new ResourceLocation(Utils.MOD_ID,"sword_fish_sound")));
}
