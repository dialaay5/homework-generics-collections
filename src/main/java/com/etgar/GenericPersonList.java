package com.etgar;

import lombok.Getter;

import java.util.ArrayList;

public class GenericPersonList <T extends Person>{

    @Getter
    ArrayList<T> person;

}
