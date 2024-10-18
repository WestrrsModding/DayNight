package net.kaupenjoe.tutorialmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.custom.Daylight;
import net.kaupenjoe.tutorialmod.block.custom.Nightlight;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block MIDNIGHTIUM_BLOCK = registerBlock("midnightium_block",
            new Block(AbstractBlock.Settings.create().strength(6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block NIGHTLIGHT = registerBlock("nightlight",
            new Nightlight(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.LODESTONE)));

    public static final Block LUCENTIUM_BLOCK = registerBlock("lucentium_block",
            new Block(AbstractBlock.Settings.create().strength(6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block DAYLIGHT = registerBlock("daylight",
            new Daylight(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.LODESTONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for Day&Night");
    }
}