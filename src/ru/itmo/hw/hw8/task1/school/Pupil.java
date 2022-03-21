package ru.itmo.hw.hw8.task1.school;


import ru.itmo.hw.hw8.task1.school.common.PupilTeacher;

public class Pupil extends PupilTeacher {

    int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level > 0)
            throw new IllegalArgumentException("Не верный ввод, ввидите имя длиной не менее двух букв");
        this.level = level;
    }

    public Pupil(String subjectName, String name, int age) {
        super(subjectName, name, age);
    }

    public void study(int skill) {
    double b = Math.random();
    long a = Math.round(b * skill);
    level +=a;
        System.out.println("level of " + getName() + " is set to " + getLevel());
}



}


