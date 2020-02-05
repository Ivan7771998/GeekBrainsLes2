package com.geekbrains.myhomework;

public enum DayOfWeek {
    MONDAY(40),
    TUESDAY(32),
    WEDNESDAY(24),
    THURSDAY(16),
    FRIDAY(8),
    SATURDAY,
    SUNDAY;

    private int hours;

    DayOfWeek(int hours) {
        this.hours = hours;
    }

    DayOfWeek(){

    }

    int getHours(){
        return hours;
    }
}
