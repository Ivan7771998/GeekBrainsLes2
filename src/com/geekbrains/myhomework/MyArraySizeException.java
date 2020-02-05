package com.geekbrains.myhomework;

public class MyArraySizeException extends Exception {

    private String [][] mass;

    public MyArraySizeException(String [][] mass){
        this.mass=mass;
    }

    public String getStringError(){
        return "Данный массив " +
                "не является квадратным: \033[1;31m (mass[" + mass.length + "][" + mass[0].length + "])";
    }

    @Override
    public String toString() {
        return "Данный массив " +
                "не является квадратным (mass[" + mass.length + "][" + mass[0].length + "])!!!";
    }
}
