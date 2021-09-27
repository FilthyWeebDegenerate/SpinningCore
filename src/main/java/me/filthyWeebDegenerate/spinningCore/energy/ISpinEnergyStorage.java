package me.filthyWeebDegenerate.spinningCore.energy;

import net.minecraftforge.energy.IEnergyStorage;

public interface ISpinEnergyStorage extends IEnergyStorage {
    @Override
    int receiveEnergy(int maxReceive, boolean simulate);

    @Override
    int extractEnergy(int maxExtract, boolean simulate);

    @Override
    int getEnergyStored();

    @Override
    int getMaxEnergyStored();

    @Override
    boolean canExtract();

    @Override
    boolean canReceive();

    int consumeEnergy(int amount);
}
