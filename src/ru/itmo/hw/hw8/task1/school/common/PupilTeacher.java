package ru.itmo.hw.hw8.task1.school.common;

abstract public class PupilTeacher extends Sett{

    protected String subjectName;

    public PupilTeacher(String subjectName, String name, int age) {
        super(name, age);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        if (subjectName == null || subjectName.length() < 2)
            throw new IllegalArgumentException("Не верный ввод, ввидите имя длиной не менее двух букв");
        this.subjectName = subjectName;
    }

}
