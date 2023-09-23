package org.launchcode.techjobs.oo;

import javax.swing.text.Position;
import java.util.Objects;

public class PositionType extends JobField{


    public PositionType(String value) {
        super(value);
    }


    @Override
    public String toString() {
        return super.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType positionType)) return false;
        return super.getId() == positionType.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    // Getters and Setters:


}
