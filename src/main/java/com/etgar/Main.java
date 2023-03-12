package com.etgar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GenericPersonList<ImportantPerson> importantPersons = new GenericPersonList<>();
        GenericPersonList<Person> persons = new GenericPersonList<>();
        GenericPersonList<AnotherPerson> anothePersons = new GenericPersonList<>();

        copyLists(importantPersons,persons);
        copyLists(anothePersons,importantPersons);


    }

    public static void copyLists(GenericPersonList<? extends ImportantPerson> src,
                                 GenericPersonList<? super ImportantPerson> dest) {
        Person person = new Person("809513800", "danny");

        ImportantPerson importantPerson = new ImportantPerson("809112346", "suzi", "haifa");

        AnotherPerson anotherPerson = new AnotherPerson("809000112", "tal", "tel-aviv", 27);

        Person clone1 = new Person(importantPerson.getId(), importantPerson.getName()); // להעתיק מבן לאבא
        ImportantPerson clone2 = new ImportantPerson(anotherPerson.getId(), anotherPerson.getName(), anotherPerson.getAddress());

        System.out.println(clone1 + "\n" + clone2);
    }
}
