package com.exercise1;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        MyLimitedList<Integer> int_list = new MyLimitedList<>(5);
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            Integer element = rand.nextInt(10);
            int_list.addItem(element);

            System.out.println(int_list);
        }

        System.out.println("-----------------------------------------------");

        MyLimitedList<Float> float_list = new MyLimitedList<>(5);
        Random rand1 = new Random();
        for (float i = 0; i < 6; i++) {
            Float elementt = rand1.nextFloat();
            float_list.addItem(elementt);

            System.out.println(float_list);
        }
    }
}