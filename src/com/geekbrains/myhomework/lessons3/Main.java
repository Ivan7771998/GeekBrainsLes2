package com.geekbrains.myhomework.lessons3;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //Задание #1
        outputUniqueWords();
        calculateNumWords();

        System.out.println("///////////////////////////////////////////////");

        //Задание #2
        TelephoneDirectories telephoneDirectories = new TelephoneDirectories();
        telephoneDirectories.add("Petya","12345655778");
        telephoneDirectories.get("Petya");
        telephoneDirectories.get("Vanya");

    }


    static List<String> createListWords() {
        return Arrays.asList(
                "Ivan",
                "Vladimir",
                "Alexsandr",
                "Boris",
                "Mike",
                "Jon",
                "Jack",
                "Sonya",
                "Darya",
                "Ivan",
                "Vladimir",
                "Alexsandr",
                "Boris",
                "Ivan",
                "Vladimir",
                "Alexsandr",
                "Boris"
        );
    }

    static void outputUniqueWords() {
        Set<String> uniqueWords = new HashSet<>(createListWords());
        uniqueWords.forEach(s -> {
            System.out.print(s + " ");
        });
        System.out.println();
    }

    static void calculateNumWords() {
        List<String> listWords = createListWords();
        Map<String, Integer> mapWords = new HashMap<>();
        listWords.forEach(word -> {
            mapWords.put(word, mapWords.getOrDefault(word, 0) + 1);
        });
        mapWords.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
        System.out.println();
    }

}
