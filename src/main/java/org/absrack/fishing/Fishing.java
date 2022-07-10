package org.absrack.fishing;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.absrack.fishing.Registries.EventRegistries.SoundEventRegistry;
import org.absrack.fishing.Registries.ItemRegistry;
import org.absrack.fishing.Utils.Utils;

@Mod(Utils.MOD_ID)
public class Fishing {
    public Fishing(){
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SoundEventRegistry.SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
