package net.partert.call_wild.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.partert.call_wild.CallOfTheWild;

public class ModBlocks {

    public static final Block SAPPHIRE_BLOCK = regBlock("sapphire_block",
            new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));


    private static Block regBlock(String name, Block block) {
        regBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CallOfTheWild.MOD_ID, name), block);
    }

    private static void regBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CallOfTheWild.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void regModBlocks() {
        CallOfTheWild.LOGGER.info("Registering ModBlocks...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.SAPPHIRE_BLOCK);
        });
    }
}
