package net.kaupenjoe.tutorialmod.util;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MIDNIGHTIUM_INGOT = createTag("needs_midnightium_ingot");
        public static final TagKey<Block> INCORRECT_FOR_MIDNIGHTIUM_INGOT = createTag("incorrect_for_midnightium_ingot");

        public static final TagKey<Block> NEEDS_LUCENTIUM_INGOT = createTag("needs_lucentium_ingot");
        public static final TagKey<Block> INCORRECT_FOR_LUCENTIUM_INGOT = createTag("incorrect_for_lucentium_ingot");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, name));
        }
    }
}