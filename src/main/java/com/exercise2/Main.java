package com.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    static int num;
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i<100; i++)
        {
            num = rand.nextInt(100);
            numbers.add(num);
        }
        System.out.println("Array list Numbers" + numbers);

        HashMap<Integer, Integer> counter_numbers = new HashMap<>();
        for (Integer one_number : numbers) {
            if (!counter_numbers.containsKey(one_number)) {
                counter_numbers.put(one_number, 0);
            }
            counter_numbers.replace(one_number, counter_numbers.get(one_number) + 1);
        }

        for (var entry: counter_numbers.entrySet()) {
            System.out.format("number = %s, count = %d \n", entry.getKey(), entry.getValue());
        }
    }
}
