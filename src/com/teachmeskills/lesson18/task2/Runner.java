package com.teachmeskills.lesson18.task2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> name = Factory.createCollection();
        Service.chooseName(name);
        Service.chooseFirstStudent(name);
    }
}
