package com.erlan.anymal;

public class Horse implements Anymal{
private String breed;
private String color;

    public Horse() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String anymalPlus() {
        return ("Helping a man to work in the field!");
    }

    @Override
    public String anymalMinus() {
        return ("Eats a lot!");
    }
}
