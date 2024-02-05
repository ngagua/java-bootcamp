package dev.Exceptions;

import dev.Exceptions.exeption.IllegalSizeException;
import dev.Exceptions.shape.Square;

import java.io.Closeable;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {
        createSquare(5);
    }

    private static void createSquare(Integer size) {
        try (Closeable c = Square.getCloseable()) {
            Square square = new Square(size);
            System.out.printf("Area: %d\n", square.area());
            System.out.printf("Perimeter: %d\n", square.perimeter());
        } catch (IllegalArgumentException | NullPointerException | IllegalSizeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally");
        }

    }
}
