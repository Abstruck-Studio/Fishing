package org.absrack.fishing.Items.rods;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import org.absrack.fishing.ItemGroup.ModGroup;

/**
 * @author Komputer
 */
public class IronRodItem extends FishingRodItem {
    public IronRodItem() {
        super(new Properties().tab(ModGroup.rodGroup));
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack itemstack = playerEntity.getItemInHand(hand);
        if (playerEntity.fishing != null) {
            if (!world.isClientSide) {
                int i = playerEntity.fishing.retrieve(itemstack);
                itemstack.hurtAndBreak(i, playerEntity, (playerEntity1) -> playerEntity1.broadcastBreakEvent(hand));
            }

            world.playSound((PlayerEntity)null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.FISHING_BOBBER_RETRIEVE, SoundCategory.NEUTRAL, 1.0F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        } else {
            world.playSound((PlayerEntity)null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.FISHING_BOBBER_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
            if (!world.isClientSide) {
                int k = EnchantmentHelper.getFishingSpeedBonus(itemstack);
                int j = EnchantmentHelper.getFishingLuckBonus(itemstack);
                world.addFreshEntity(new FishingBobberEntity(playerEntity, world, j, k));
            }

            playerEntity.awardStat(Stats.ITEM_USED.get(this));
        }

        return ActionResult.sidedSuccess(itemstack, world.isClientSide());
    }
}
