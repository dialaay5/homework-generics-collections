package com.etgar;

import lombok.Getter;

public class Person {
    @Getter
    protected String id;
    @Getter
    protected String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
