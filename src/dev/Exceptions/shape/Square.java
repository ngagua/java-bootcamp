package dev.Exceptions.shape;

import dev.Exceptions.exeption.IllegalSizeException;

import java.io.Closeable;
import java.io.IOException;

public class Square {
    public static final int DEGREE = 90;
    private final Integer size;

    public Square(Integer size) throws IllegalSizeException, NullPointerException {
        if (size < 0) {
            throw new IllegalSizeException("Your size " + size + " is less than 0");
        }
        this.size = size;
    }

    public static Closeable getCloseable() {
        return new Closeable() {
            @Override
            public void close() throws IOException {
                System.out.println("Close");
            }
        };
    }

    public int getSize() {
        return size;
    }

    public int area() {
        return size * size;
    }

    public int perimeter() {
        return 4 * size;
    }

//    @Override
//    public void close() throws IOException {
//        System.out.println("Close");
//    }
}
