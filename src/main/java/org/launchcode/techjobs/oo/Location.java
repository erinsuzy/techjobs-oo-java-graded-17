package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

    public Location(String value) {
        super(value);
    }






    // Custom toString, equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location location)) return false;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:


    }


