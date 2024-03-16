package com.teachmeskills.lesson18.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
    public static void deleteDuplicates(List<Integer> numbers) {
        List<Integer> str = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(str);
    }
    public static void printEvenNumbers(List<Integer> numbers) {
        List<Integer> str = numbers.stream()
                .limit(17)
                .skip(6).filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(str);
    }
    public static void multiplyNumber(List<Integer> numbers) {
        List<Integer> str = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(str);
    }
    public static void printNumber(List<Integer> numbers) {
        List<Integer> str = numbers.stream()
                .limit(4)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(str);
    }
    public static void printCount(List<Integer> numbers) {
        long str = numbers.stream()
                .count();
        System.out.println(str);
    }
    public static void printArithmeticMean(List<Integer> numbers) {
        double str = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();
        System.out.println(str);
    }
}
