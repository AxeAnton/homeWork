package ru.itmo.hw.hw8.task1.school;

public class School {
    private final String schoolName;
    private Director director;
    private Pupil pupils[];
    private Teacher teachers[];

    public School(String schoolName, Director director, Pupil[] pupils, Teacher[] teachers) {
        this.schoolName = schoolName;
        this.director = director;
        this.pupils = pupils;
        this.teachers = teachers;
    }

    public void day () {
        director.start();
        for (Teacher teacher: teachers) {
            for (Pupil pupil: pupils) {
                if (pupil.getSubjectName().equals(teacher.getSubjectName())) {
                    //20 - если предмет учиника = предмету учителя.
                    // у переменной pupil вызываем метод getSubjectName
                    teacher.teach(pupil);

                }
            }
        }


        director.finish();
    }



}
