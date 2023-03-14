package com.etgar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GenericPersonList<ImportantPerson> importantPersons = new GenericPersonList<>();
        GenericPersonList<Person> persons = new GenericPersonList<>();
        copyLists(importantPersons,persons);
    }

    public static void copyLists(GenericPersonList<? extends ImportantPerson> src,
                                 GenericPersonList<? super Person> dest) {
        for (int i = 0; i < src.arraySize(); i++){
            dest.addItem(src.getItem(i));
        }
        System.out.println(dest);
    }
}
