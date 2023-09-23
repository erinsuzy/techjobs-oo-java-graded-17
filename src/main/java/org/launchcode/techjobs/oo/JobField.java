package org.launchcode.techjobs.oo;

public abstract class JobField {
    private int id;

    private static int nextId = 1;

    private String value;


    public JobField(int aId, int aNextId, String aValue) {
        id = aId;
        nextId = aNextId;
        aId = aNextId;
        aNextId++;
        value = aValue;

    }

    public int getId() {
        return id;
    }




    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String aValue) {
        this.value = aValue;
    }
}
