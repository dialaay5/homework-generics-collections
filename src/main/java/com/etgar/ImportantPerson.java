package com.etgar;

import lombok.Getter;

public class ImportantPerson extends Person{
    @Getter
    protected String address;

    public ImportantPerson(String id, String name , String address) {
        super(id, name);
        this.address = address;
    }

}
