package dev.intelligentcreations.ezconvertorz.blockentities;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import team.reborn.energy.api.base.SimpleEnergyStorage;

import static dev.intelligentcreations.ezconvertorz.blockentities.BlockEntityRegistry.EEU_BLOCK_ENTITY;

public class EEUBlockEntity extends BlockEntity {

    public EEUBlockEntity(BlockPos pos, BlockState state) {
        super(EEU_BLOCK_ENTITY, pos, state);
    }

    // Store a SimpleEnergyStorage in the block entity class.
    public final SimpleEnergyStorage energyStorage = new SimpleEnergyStorage(1000, 100, 0) {
        @Override
        protected void onFinalCommit() {
            markDirty();
        }
    };

    public void tick() {
        if (!world.isClient && energyStorage.amount >= 10) {
            energyStorage.amount -= 10;
            markDirty();
        }
    }

    @Override
    public void writeNbt(NbtCompound tag) {
        super.writeNbt(tag);
    }

    @Override
    public void readNbt(NbtCompound tag) {
        super.readNbt(tag);
    }
}
