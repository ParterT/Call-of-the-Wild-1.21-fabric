package net.partert.call_wild.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.partert.call_wild.CallOfTheWild;

public class ModItems {

    public static final Item SAPPHIRE = regItem("sapphire", new Item(new Item.Settings()));


    private static Item regItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CallOfTheWild.MOD_ID, name), item);
    }

    public static void regModItems() {
        CallOfTheWild.LOGGER.info("Registering ModItems...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SAPPHIRE);
        });
    }

}
