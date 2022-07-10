package org.absrack.fishing.ItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.absrack.fishing.Registries.ItemRegistry;

public class FishGroup extends ItemGroup {
    public FishGroup() {
        super("fish_group");
    }
    @Override
    public ItemStack makeIcon(){
        return new ItemStack(ItemRegistry.anglerFishItem.get());
    }
}
