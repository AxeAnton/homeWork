package ru.itmo.hw.hw8.task1;

import ru.itmo.hw.hw8.task1.school.Director;
import ru.itmo.hw.hw8.task1.school.Pupil;
import ru.itmo.hw.hw8.task1.school.School;
import ru.itmo.hw.hw8.task1.school.Teacher;


public class Application {
    public static void main(String[] args) {

        String subjectName = "Math";
        String name = "Anton";
        int age = 15;

        Pupil pupil = new Pupil(subjectName, name, age);

        Teacher teacher = new Teacher("Math", "Anton", 15, 10);

        Teacher teachers[] = new Teacher[] {teacher};

        Pupil pupils[] = new Pupil[] {pupil};

        Director director = new Director("Tom", 50);

        School school = new School("ok", director, pupils, teachers);

        school.day();
        school.day();
        // Метод вызывается у переменны а не у ТД








    }
}
