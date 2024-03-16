package com.teachmeskills.lesson18.task2;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public static List<String> createCollection(){
        List<String> name = new ArrayList<>();
        name.add("Artem");
        name.add("Alina");
        name.add("Anastasia");
        name.add("Artem");
        name.add("Nikita");
        name.add("Oleg");
        name.add("Ivan");
        name.add("Kirill");
        name.add("Ruslan");
        name.add("Evgeniy");
        name.add("Pavel");
        name.add("Ruslan");
        name.add("Alexander");
        name.add("Daniil");
        name.add("Alexey");
        name.add("Vladislav");
        return name;
    }
}
