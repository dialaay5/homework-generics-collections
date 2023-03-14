package com.etgar;

import lombok.Getter;

import java.util.ArrayList;

public class GenericPersonList <T extends Person>{

    @Getter
    protected ArrayList<T> person = new ArrayList<>();

    public int arraySize(){
        return this.person.size();
    }

    public void addItem(T item){
        this.person.add(item);
    }

    public T getItem(int index){
        return this.person.get(index);
    }

    @Override
    public String toString() {
        return "GenericPersonList{" +
                "person=" + person +
                '}';
    }
}
