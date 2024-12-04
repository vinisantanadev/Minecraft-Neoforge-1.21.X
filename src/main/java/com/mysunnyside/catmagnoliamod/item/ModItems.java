package com.mysunnyside.catmagnoliamod.item;

import com.mysunnyside.catmagnoliamod.CatMagnoliaMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CatMagnoliaMod.MOD_ID);
    // registra o mod

    public static final DeferredItem<Item> MAGNOLIASOUL = ITEMS.register("magnoliasoul",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PAPERBALL = ITEMS.register("paperball",
            () -> new Item(new Item.Properties()));
    // adiciona os itens ao mine

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
