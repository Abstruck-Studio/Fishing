package org.absrack.fishing.Items.terrariafish;


import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import org.absrack.fishing.ItemGroup.ModGroup;

/**
 * @author Komputer
 */
public class AnglerFishItem extends Item {
    private static final Food food =(new Food.Builder())
            .saturationMod(4)
            .meat()
            .nutrition(2)
            .effect(()-> new EffectInstance(Effects.POISON,5*20,1),1)
            .build();
    public AnglerFishItem() {
        super(new Properties().food(food).tab(ModGroup.fishGroup));
    }

}
