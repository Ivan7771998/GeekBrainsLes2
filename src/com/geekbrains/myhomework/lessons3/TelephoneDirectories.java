package com.geekbrains.myhomework.lessons3;

import java.util.*;

public class TelephoneDirectories {

    private Map<String, List<String>> listDirectories = new HashMap<>();

    TelephoneDirectories() {
        addDefaultData();
    }

    private void addDefaultData() {
        add("Vanya", "28384875792");
        add("Vanya", "33333875792");
        add("Vanya", "66666875792");
        add("Darya", "44444875792");
        add("Jack", "34444755792");
        add("Natalya", "26666675792");
        add("Mike", "28555575792");
        add("Dan", "28378875792");
        add("Roma", "29999975792");
        add("Dmitri", "28999975792");
        add("Dan", "28445675792");
    }

    public void add(String surname, String phoneNumber) {
        listDirectories.computeIfAbsent(surname.toUpperCase(), k -> new LinkedList<>()).add(phoneNumber);
    }

    public void get(String surname) {
        System.out.println();
        String surnameUp = surname.toUpperCase(); //учел регистр, ну как учел, просто по дефолту делаю верхним
        listDirectories.forEach((k, v) -> {
            if (k.equals(surnameUp)) {
                System.out.println(surname + ":");
                //жалко, что в forEach нет индекса(только, если самому создавать)
                // а в Котлине это уже сделали!
                for (int i = 0; i < v.size(); i++) {
                    System.out.println("phone#" + (i + 1) + " : " + v.get(i));
                }
            }
        });
    }
}
