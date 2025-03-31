package test.azxyn.stuff.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import test.azxyn.stuff.Axyzn;

import java.util.function.Function;

public class ModItems {

    public static final Item HEART_LIFESTEAL = registeritem("heart_lifesteal", Item::new, new Item.Settings());
    public static final Item REVIVE_BEACON = registeritem("revive_beacon", Item::new, new Item.Settings());

    public static Item registeritem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> regkey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Axyzn.MOD_ID, path));
        return Items.register(regkey, factory, settings);
    }
    public static void registerModItems() {
        Axyzn.LOGGER.info("registering items for" + Axyzn.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(HEART_LIFESTEAL);
            entries.add(REVIVE_BEACON);
        });
    }

}
