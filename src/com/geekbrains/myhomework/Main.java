package com.geekbrains.myhomework;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String[][] mass = new String[][]{
                {"123", "34534", "567"},
                {"123", "34534", "546"},
                {"123", "34534", "43534"}
        };
        try {
            System.out.println("Сумма элементов в массиве равна: " + "\033[4;32m" + calculateMas(mass) + "\u001B[0m");
        } catch (MyArraySizeException e) {
            System.out.println(e.getStringError());
        } catch (MyArrayDataException e) {
            //e.printStackTrace(); можно так показать, если по стеку пройтись хотите
            System.out.println(e.getStringError());
        }

        getWorkingHours(DayOfWeek.THURSDAY);
    }

    static int calculateMas(String[][] mass) throws MyArraySizeException, MyArrayDataException {
        int sumElem = 0;
        if (mass.length != mass[0].length) {
            throw new MyArraySizeException(mass);
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                try {
                    sumElem += Integer.parseInt(mass[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sumElem;
    }

    static void getWorkingHours(DayOfWeek dayOfWeekClass) {
        if (dayOfWeekClass != DayOfWeek.SATURDAY && dayOfWeekClass != DayOfWeek.SUNDAY) {
            System.out.println("Кол-во оставшихся рабочих часов до конца " +
                    "недели по заданному текущему дню: \033[4;32m" + dayOfWeekClass.getHours());
        } else {
            System.out.println("Сегодня выходной!");
        }
    }
}
