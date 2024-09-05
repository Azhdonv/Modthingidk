package net.av.idkyet.item;

import net.av.idkyet.IdkYet;
import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Where new items are added
    public static final Item RYAN = registerItem("ryan", new Item(new Item.Settings()));


    //Function used to create new items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(IdkYet.MOD_ID, name), item);
    }

    public static void registerModItems() {
        IdkYet.LOGGER.info("Registering Mod Items for" + IdkYet.MOD_ID);

        //Add items to creative mode tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RYAN);
        });
    }
}
