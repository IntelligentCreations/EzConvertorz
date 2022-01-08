package dev.intelligentcreations.ezconvertorz.blockentities;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import team.reborn.energy.api.EnergyStorage;

import static dev.intelligentcreations.ezconvertorz.blocks.BlockRegistry.EEU_CONVERTOR;
import static dev.intelligentcreations.ezconvertorz.blocks.BlockRegistry.EUE_CONVERTOR;

public class BlockEntityRegistry {
    public static BlockEntityType<EEUBlockEntity> EEU_BLOCK_ENTITY;
    public static BlockEntityType<EUEBlockEntity> EUE_BLOCK_ENTITY;

    public static void register() {
        EEU_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "ezconvertorz:eeu_block_entity", FabricBlockEntityTypeBuilder.create(EEUBlockEntity::new, EEU_CONVERTOR).build(null));
        EUE_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "ezconvertorz:eue_block_entity", FabricBlockEntityTypeBuilder.create(EUEBlockEntity::new, EUE_CONVERTOR).build(null));
        EnergyStorage.SIDED.registerForBlockEntity((myBlockEntity, direction) -> myBlockEntity.energyStorage, EEU_BLOCK_ENTITY);
        EnergyStorage.SIDED.registerForBlockEntity((myBlockEntity, direction) -> myBlockEntity.energyStorage, EUE_BLOCK_ENTITY);
    }
}
