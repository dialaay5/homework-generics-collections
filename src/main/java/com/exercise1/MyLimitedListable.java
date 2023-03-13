package com.exercise1;

public interface MyLimitedListable <T>{

    void addItem(T item);
    void removeFirstItem();
    T getItem(int index);
}
