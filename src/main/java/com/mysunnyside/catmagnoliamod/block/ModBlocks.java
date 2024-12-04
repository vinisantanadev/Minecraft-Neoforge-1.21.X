package com.mysunnyside.catmagnoliamod.block;

import com.mysunnyside.catmagnoliamod.CatMagnoliaMod;
import com.mysunnyside.catmagnoliamod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CatMagnoliaMod.MOD_ID);

    public static final DeferredBlock<Block> CARDBOARDBOX = registerBlock("cardboardbox",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).sound(SoundType.MUD)));
    //caixa de papelão

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        // registra o bloco
        registerBlockItem(name, toReturn);
        // registra o item associado ao bloco
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
