package org.jusecase.poe.gateways;

import org.jusecase.poe.entities.InventorySlot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventorySlotGatewayTrainer implements InventorySlotGateway {

    private List<InventorySlot> inventorySlots = new ArrayList<>();

    public void givenInventorySlots(InventorySlot... inventorySlots) {
        this.inventorySlots.clear();
        this.inventorySlots.addAll(Arrays.asList(inventorySlots));
    }

    @Override
    public List<InventorySlot> getAll() {
        return inventorySlots;
    }

    @Override
    public List<InventorySlot> getAllUnidentified() {
        return null;
    }

    @Override
    public List<InventorySlot> getIgnored() {
        return null;
    }
}