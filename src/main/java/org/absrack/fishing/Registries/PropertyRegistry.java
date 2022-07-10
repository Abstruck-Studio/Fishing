package org.absrack.fishing.Registries;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.absrack.fishing.Items.rods.IronRodItem;
import org.absrack.fishing.Utils.Utils;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class PropertyRegistry {
    @SubscribeEvent
    public static void propertyOverrideRegistry(FMLClientSetupEvent event){
        event.enqueueWork(()->{
            ItemModelsProperties.register(ItemRegistry.ironRodItem.get(), new ResourceLocation(Utils.MOD_ID,"cast"), (itemStack, clientWorld, livingEntity) -> {
                if (livingEntity == null) {
                    return 0.0F;
                } else {
                    boolean flag = livingEntity.getMainHandItem() == itemStack;
                    boolean flag1 = livingEntity.getOffhandItem() == itemStack;
                    if (livingEntity.getMainHandItem().getItem() instanceof IronRodItem) {
                        flag1 = false;
                    }

                    return (flag || flag1) && livingEntity instanceof PlayerEntity && ((PlayerEntity)livingEntity).fishing != null ? 1.0F : 0.0F;
                }
            });
        });
    }
}
