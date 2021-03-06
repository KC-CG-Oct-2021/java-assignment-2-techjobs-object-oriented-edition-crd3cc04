package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField{

    private int id;
    private static int nextId = 1;
    private String value;

    public Employer() { //constructor that assigns value to id field and generates different id number for new Employer object
        id = nextId;
        nextId++;
    }

    public Employer(String value) { //constructor assigns a value to the value field, it also calls the first constructor with this.() that initializes id
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    /*public int getId() {
        return id;
    }*/

    public String getValue() {
        if (value == null || value.isEmpty()) {
            return "Data not available";
        }
        return value;
    }

    /*public void setValue(String value) {
        this.value = value;
    }*/

}
