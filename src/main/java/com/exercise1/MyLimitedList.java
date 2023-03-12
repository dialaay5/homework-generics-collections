package com.exercise1;

import java.util.ArrayList;

public class MyLimitedList <T extends Number> implements MyLimitedListable{
    protected ArrayList<Number> items = new ArrayList<>(); //רשימה מכילה את האיברים
    protected final Integer max_items; // מכיל את מספר האיברים המקסימלי ברשימה

    public MyLimitedList(Integer maxItems) {
        this.max_items = maxItems;
    }
@Override
    public void addItem(Number item) {
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
    public Number getItem(int index) {
        return items.get(index); // לקבל את המספר הנמצא במקום האנדיקס ברשימה
    }

    @Override
    public String toString() {
        return "List=" + items +
                ", max_items=" + max_items;
    }
}

