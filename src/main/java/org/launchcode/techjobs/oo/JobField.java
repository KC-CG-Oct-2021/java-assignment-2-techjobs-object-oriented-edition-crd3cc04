package org.launchcode.techjobs.oo;

public abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;

    @Override
    public String toString(){
        return value;
    }

    public int getId() {
        return id;
    }

    public void setValue(String value) {
        this.value = value;
    }
} //Make sure that any method coded in here is commented out in the other classes
