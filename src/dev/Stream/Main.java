package dev.Stream;

import dev.Stream.tecnolab.Laptop;
import dev.Stream.tecnolab.LaptopType;

import java.util.ArrayList;
import java.util.Collection;


/*
java.util.Optional
java.util.stream.Stream
java.lang.Runnable
java.util.stream.Collectors
java.util.stream.Collector
*/
public class Main {
    public static void main(String[] args) {
        Collection<Laptop> laptops = laptopGenerator(20);
        Collection<Laptop> businessLaptops = new ArrayList<>();
        laptops.stream()
                .filter(laptop -> laptop.getType() == LaptopType.BUSINESS)
//                .peek(System.out::println)
                .map(Laptop::getScreenSize)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .distinct()
                .filter(screenSize -> screenSize < 12)
                .reduce(Double::sum)
                .ifPresent(System.out::println);
//                .collect(Collectors.toMap(a -> a, a -> a))
//                .entrySet()
//                .forEach(System.out::println);

//        System.out.println(result);

        for (final var laptop : laptops) {
            if (laptop.getType() == LaptopType.BUSINESS) {
                businessLaptops.add(laptop);

            }

        }
//        businessLaptops.forEach(System.out::println);
    }

    private static Collection<Laptop> laptopGenerator(int num) {
        Collection<Laptop> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            result.add(new Laptop());
        }
        return result;
    }
}
