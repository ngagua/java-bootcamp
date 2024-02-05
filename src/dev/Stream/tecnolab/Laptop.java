package dev.Stream.tecnolab;

import java.util.Objects;

public class Laptop {
    private final LaptopType type;
    private final double screenSize;

    public Laptop(LaptopType type, double screenSize) {
        this.type = Objects.requireNonNull(type);
        this.screenSize = screenSize;
    }

    public Laptop() {
        this(LaptopType.values()[random(0, LaptopType.values().length)], random(11, 17));
    }

    private static int random(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public LaptopType getType() {
        return type;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "type=" + type +
                ", screenSize=" + screenSize +
                '}';
    }
}
