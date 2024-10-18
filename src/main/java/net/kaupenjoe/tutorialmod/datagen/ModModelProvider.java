package net.kaupenjoe.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.kaupenjoe.tutorialmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import org.jetbrains.annotations.NotNull;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MIDNIGHTIUM_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MIDNIGHTIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MIDNIGHTIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MIDNIGHTIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MIDNIGHTIUM_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.LUCENTIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.LUCENTIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.LUCENTIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.LUCENTIUM_BOOTS);

        itemModelGenerator.register(ModItems.MIDNIGHTIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIDNIGHTIUM_SCRAP, Models.GENERATED);

        itemModelGenerator.register(ModItems.MIDNIGHTIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MIDNIGHTIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MIDNIGHTIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MIDNIGHTIUM_SHOVEL, Models.HANDHELD);
    }


}
