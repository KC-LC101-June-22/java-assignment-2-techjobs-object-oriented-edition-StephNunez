package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    //Questions:
    //1. What fields do ALL FOUR of the classes have in common?
    //2. Which constructors are the same in ALL FOUR classes?
    //3. What getters and setters do ALL the classes share?
    //4. Which custom methods are identical in all the classes?


    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }



    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
