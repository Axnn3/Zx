package test.azxyn.stuff.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import test.azxyn.stuff.Axyzn;

public class ModItems {

    public static final Item HEART_LIFESTEAL = registerItem("heart_lifesteal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Axyzn.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Axyzn.LOGGER.info("registering items for" + Axyzn.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(HEART_LIFESTEAL);
        });
    }

}
