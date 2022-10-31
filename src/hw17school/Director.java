package hw17school;

import hw17school.base.NameAge;

public class Director extends NameAge {


    public Director(int age, String name) {
        super(age, name);
    }

    public void startLessons() {
        System.out.println("Start lessons");
    }

    public void finishLessons() {
        System.out.println("Finish lessons");
    }
}
