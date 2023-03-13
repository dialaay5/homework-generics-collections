package com.exercise1;

import java.util.ArrayList;

public class MyLimitedList <T> implements MyLimitedListable<T>{
    protected ArrayList<T> items = new ArrayList<>(); //רשימה מכילה את האיברים
    protected final Integer max_items; // מכיל את מספר האיברים המקסימלי ברשימה

    public MyLimitedList(Integer maxItems) {
        this.max_items = maxItems;
    }
@Override
    public void addItem(T item) {
        if(this.max_items == items.size()){
            removeFirstItem();
        }
        items.add(item);
}
@Override
    public void removeFirstItem() {
        items.remove(getItem(0));
    }
@Override
    public T getItem(int index) {
        return items.get(index); // לקבל את המספר הנמצא במקום האנדיקס ברשימה
    }

    @Override
    public String toString() {
        return "List=" + items +
                ", max_items=" + max_items;
    }
}

