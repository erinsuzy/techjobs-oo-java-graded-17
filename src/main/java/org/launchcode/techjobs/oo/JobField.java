package org.launchcode.techjobs.oo;

public abstract class JobField {
    private final int id;

    private static int nextId = 1;

    private String value;


    public JobField(String value){
        this.id = nextId;
        this.value = value;
        nextId++;

    }

    public int getId() {
        return id;
    }


    public static int getNextId(){
        return nextId;
    }

    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }
}
