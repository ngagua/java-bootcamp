package dev.arrays;

import dev.arrays.universe.CelestialBody;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        CelestialBody earth = new CelestialBody("Earth");
        CelestialBody moon = new CelestialBody("Moon");
        CelestialBody moon1 = new CelestialBody("Moon");
        CelestialBody kutaisi = new CelestialBody("Kutaisi");

        earth.add(moon);
        earth.add(moon);
        earth.add(moon1);
        earth.add(kutaisi);


        Collection<CelestialBody> moons = earth.getMoons();
//        moons.add(new CelestialBody("Europa"));

        System.out.println(earth.getMoons().size());

        for (final var c : earth.getMoons()) {
            System.out.println(c.getMoonOf().getName());
        }
    }
}