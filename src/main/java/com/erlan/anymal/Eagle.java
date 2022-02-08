package com.erlan.anymal;

public class Eagle implements Anymal {
    private String breed;
    private String name;
    private String color;

    public Eagle() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Eagle{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' ;
    }

    @Override
    public String anymalPlus() {
        return ("Helps on the hunt!");
    }

    @Override
    public String anymalMinus() {
        return ("Dangerous for pets!");
    }
}
