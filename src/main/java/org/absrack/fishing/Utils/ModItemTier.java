package org.absrack.fishing.Utils;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

/**
 * @author Komputer
 */
public enum ModItemTier implements IItemTier {

    FISH(3, 1560, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(Items.PUFFERFISH);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    private ModItemTier(int p_i48458_3_, int p_i48458_4_, float p_i48458_5_, float p_i48458_6_, int p_i48458_7_, Supplier<Ingredient> p_i48458_8_) {
        this.level = p_i48458_3_;
        this.uses = p_i48458_4_;
        this.speed = p_i48458_5_;
        this.damage = p_i48458_6_;
        this.enchantmentValue = p_i48458_7_;
        this.repairIngredient = new LazyValue<>(p_i48458_8_);
    }

    @Override
    public int getUses() {
        return this.uses;
    }
    @Override
    public float getSpeed() {
        return this.speed;
    }
    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }
    @Override
    public int getLevel() {
        return this.level;
    }
    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

