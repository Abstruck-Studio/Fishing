package org.absrack.fishing.Registries;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.absrack.fishing.Items.rods.IronRodItem;
import org.absrack.fishing.Items.terrariafish.AnglerFishItem;
import org.absrack.fishing.Items.terrariafish.ReaverSharkItem;
import org.absrack.fishing.Items.terrariafish.SwordFishItem;
import org.absrack.fishing.Utils.Utils;

/**
 * @author Komputer
 */
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final RegistryObject<Item> anglerFishItem = ITEMS.register("angler_fish_item", AnglerFishItem::new);
    public static final RegistryObject<Item> swordFishItem = ITEMS.register("sword_fish_item", SwordFishItem::new);
    public static final RegistryObject<Item> reaverSharkItem = ITEMS.register("reaver_shark_item", ReaverSharkItem::new);
    public static final RegistryObject<Item> ironRodItem = ITEMS.register("iron_rod_item", IronRodItem::new);
}
