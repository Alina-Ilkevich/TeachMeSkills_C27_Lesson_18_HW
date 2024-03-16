package com.teachmeskills.lesson18.task1;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public static List<Integer> createCollection(){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100);
            numbers.add(num);
        }
        return numbers;
    }
}
