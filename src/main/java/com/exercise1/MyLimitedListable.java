package com.exercise1;

public interface MyLimitedListable <T extends Number>{

    void addItem(Number item);
    void removeFirstItem();
    Number getItem(int index);
}
