package com.teachmeskills.lesson18.task1;

import java.util.List;


public class Runner {
    public static void main(String[] args) {
        List<Integer> list = Factory.createCollection();
        Service.deleteDuplicates(list);
        Service.printEvenNumbers(list);
        Service.multiplyNumber(list);
        Service.printNumber(list);
        Service.printCount(list);
        Service.printArithmeticMean(list);
    }
}
