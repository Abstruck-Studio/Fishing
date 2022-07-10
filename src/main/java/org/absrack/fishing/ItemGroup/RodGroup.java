package org.absrack.fishing.ItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.absrack.fishing.Registries.ItemRegistry;

public class RodGroup extends ItemGroup {
    public RodGroup() {
        super("rod_group");
    }
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.ironRodItem.get());
    }
}
