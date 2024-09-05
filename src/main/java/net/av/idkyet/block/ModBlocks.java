package net.av.idkyet.block;

import net.av.idkyet.IdkYet;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Where new blocks are added
    public static final Block RYAN_BLOCK = registerBlock("ryan_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().resistance(3f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block NATHAN_BLOCK = registerBlock("nathan_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().resistance(3f).sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_RYAN_BLOCK = registerBlock("raw_ryan_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().resistance(3f).sounds(BlockSoundGroup.AMETHYST_CLUSTER)));
    public static final Block RAW_NATHAN_BLOCK = registerBlock("raw_nathan_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().resistance(3f).sounds(BlockSoundGroup.STONE)));





    //Helper methods to create blocks
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(IdkYet.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(IdkYet.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        IdkYet.LOGGER.info("Registering Mod Blocks for " + IdkYet.MOD_ID);
        //Add blocks to creative mode tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.RYAN_BLOCK);
            entries.add(ModBlocks.NATHAN_BLOCK);
            entries.add(ModBlocks.RAW_RYAN_BLOCK);
            entries.add(ModBlocks.RAW_NATHAN_BLOCK);
        });
    }
}
