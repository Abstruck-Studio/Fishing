package org.absrack.fishing.Items.terrariafish;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.extensions.IForgeItem;
import org.absrack.fishing.Registries.EventRegistries.SoundEventRegistry;
import org.absrack.fishing.ItemGroup.ModGroup;
import org.absrack.fishing.Utils.ModItemTier;

/**
 * @author Komputer
 */
public class SwordFishItem extends SwordItem implements IForgeItem {
    private static final Food food = (new Food.Builder())
            .nutrition(2)
            .meat()
            .saturationMod(2)
            .effect(()->new EffectInstance(Effects.HARM,1,1),1)
            .build();
    public SwordFishItem() {
        super(ModItemTier.FISH,3, -2.4F, (new Item.Properties()).tab(ModGroup.fishGroup));
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity)
    {
        player.level.playSound(player, new BlockPos(player.getPosition(0f)),SoundEventRegistry.swordFishSound.get(), SoundCategory.AMBIENT,10f,1f);
        return false;
    }

    @Override
    public int getEnchantmentValue() {
        return 1;
    }
}
