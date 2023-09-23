package org.launchcode.techjobs.oo;

import javax.swing.text.Position;
import java.util.Objects;

public class PositionType extends JobField{


    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return super.getValue();
    }
    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType positionType = (PositionType) o;
        return super.getId() == positionType.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    // Getters and Setters:


}
