package ru.itmo.hw.hw8.task1.school;

import ru.itmo.hw.hw8.task1.school.common.Sett;

public class Director extends Sett {

    public Director(String name, int age) {
        super(name, age);
    }

    public void start() {
        System.out.println("Start lessons");
    }
    public void finish() {
        System.out.println("Finish lessons");
    }

}
