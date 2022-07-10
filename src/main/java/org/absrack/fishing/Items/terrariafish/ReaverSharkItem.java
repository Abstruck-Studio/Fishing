package org.absrack.fishing.Items.terrariafish;

import net.minecraft.item.*;
import org.absrack.fishing.ItemGroup.ModGroup;
import org.absrack.fishing.Utils.ModItemTier;

public class ReaverSharkItem extends PickaxeItem {
    private static final Food food = (new Food.Builder())
            .meat()
            .nutrition(2)
            .saturationMod(2)
            .build();

    public ReaverSharkItem(){
        super(ModItemTier.FISH, 1, -2.8F, (new Item.Properties()).tab(ModGroup.fishGroup));
    }

    @Override
    public int getEnchantmentValue() {
        return 1;
    }
}
