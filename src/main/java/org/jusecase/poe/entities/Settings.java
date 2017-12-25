package org.jusecase.poe.entities;

import java.util.SortedSet;
import java.util.TreeSet;

public class Settings implements Cloneable {
    public int inventoryAreaX;
    public int inventoryAreaY;
    public int inventoryAreaWidth;
    public int inventoryAreaHeight;
    public int slotOffsetX;
    public int slotOffsetY;
    public SortedSet<Integer> ignoredSlots = new TreeSet<>();

    @Override
    public Settings clone() {
        try {
            Settings clone = (Settings) super.clone();
            clone.ignoredSlots = new TreeSet<>(ignoredSlots);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
