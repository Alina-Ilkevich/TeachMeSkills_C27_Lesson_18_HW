package com.teachmeskills.lesson18.task2;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
    public static void chooseName(List<String> name){
        List<String> str = name.stream()
                                .filter(a -> a.toLowerCase().startsWith("a"))
                                .collect(Collectors.toList());
        System.out.println(str);
    }
    public static void chooseFirstStudent(List<String> name){
        String str = name.stream()
                            .sorted()
                            .findFirst()
                            .get();
        System.out.println(str);
    }
}
