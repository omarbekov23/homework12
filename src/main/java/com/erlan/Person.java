package com.erlan;

import com.erlan.anymal.Anymal;

public class Person {
    private String name;
    private Byte age;
    private Anymal anymal;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Anymal getAnymal() {
        return anymal;
    }

    public void setAnymal(Anymal anymal) {
        this.anymal = anymal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", anymal=" + anymal +
                '}';
    }
}
