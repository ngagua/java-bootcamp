package dev.arrays.universe;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class CelestialBody implements Named, Comparable<CelestialBody> {
    private String name;
    private final Set<CelestialBody> moons;
    private CelestialBody moonOf;


    public CelestialBody(String name) {
        this.name = name;
        this.moons = new TreeSet<>();
    }


    @Override
    public String getName() {
        return name;
    }

    public Set<CelestialBody> getMoons() {
        return Collections.unmodifiableSet(moons);
    }

    public CelestialBody getMoonOf() {
        return moonOf;
    }

    public boolean add(CelestialBody celestialBody) {
        celestialBody.moonOf = this;
        return moons.add(celestialBody);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() called on " + this.name);
        return Objects.hashCode(this.name);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.printf("equals() called on %s%n", this.name);
        return this == obj || obj instanceof CelestialBody && Objects.equals(this.name, ((CelestialBody) obj).name);
    }

    @Override
    public int compareTo(CelestialBody o) {
        if (this.name == null && o.name == null) {
            return 0;
        } else if (this.name != null) {
            return this.name.compareTo(o.name);
        }
        return -1;
    }
}
