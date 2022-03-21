package ru.itmo.hw.hw8.task1.school;

import ru.itmo.hw.hw8.task1.school.common.PupilTeacher;

public class Teacher extends PupilTeacher {

    int skill;

    public Teacher(String subjectName, String name, int age, int skill) {
        super(subjectName, name, age);
        this.skill = skill;
    }
    public int getSkill() {
        return skill;
    }
    public void setSkill(int skill) {
        if (skill > 0)
            throw new IllegalArgumentException("Не верный ввод, ввидите имя длиной не менее двух букв");
        this.skill = skill;
    }

    public void teach(Pupil pupil){
        pupil.study(skill);
        //Вызываем метод study (метод берется из Класса Pupil) у переменной pupil и передаем в него
        // в качестве входного аргумента значение поля skill
    }





}