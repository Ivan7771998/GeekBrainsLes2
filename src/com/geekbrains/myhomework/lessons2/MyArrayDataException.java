package com.geekbrains.myhomework.lessons2;

public class MyArrayDataException extends Exception {

    private int i;
    private int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    //Так тоже можно сделать?
    @Override
    public String toString() {
        return "Неверные данные в ячейке: mass[" + i + "][" + j + "]";
    }

    public String getStringError() {
        return "Неверные данные в ячейке: \033[1;31m mass[" + i + "][" + j + "]";
    }
}
