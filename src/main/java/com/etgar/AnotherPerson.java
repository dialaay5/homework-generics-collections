package com.etgar;

import lombok.Getter;

public class AnotherPerson extends ImportantPerson{
    @Getter
    protected int age;

    public AnotherPerson(String id, String name, String address, int age) {
        super(id, name, address);
        this.age = age;
    }

    @Override
    public String toString() {
        return "AnotherPerson {" +
                "super:[" + super.toString() + "] " +
                ", age= " + age +'}';
    }
}
