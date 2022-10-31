package hw17school;

public class School<Puple> {
    private int numberSchool;
    private Director director;
    private Teacher[] teachers;
    private Pupil[] pupils;

    public School(int numberSchool, Director director) {
        this.numberSchool = numberSchool;
        this.director = director;
    }
    public void setNumberSchool(int numberSchool) {
        this.numberSchool = numberSchool;
    }
    public void setDirector(Director director) {
        this.director = director;
    }
    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void setPupils(Pupil[] pupils) {
        this.pupils = pupils;
    }

    public int getNumberSchool() {
        return numberSchool;
    }

    public Director getDirector() {
        return director;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Pupil[] getPupils() {
        return pupils;
    }



    // учителя учат учеников (предмет учителя и ученика должны совпадать,
    // уровень знаний ученика в процессе обучения должен увеличиваться)
    public void thichingPuple(Teacher[] teachers, Pupil[] pupils) {
        while (true) {
            for (int i = 0; i < pupils.length; i++) {
                for (int j = 0; j < teachers.length; j++) {
                    if (pupils[i].getSubject().equals(teachers[j].getSubject())) {
                        System.out.println(pupils[i].getName() + " got " +
                                pupils[i].addSkill(teachers[j].getSkillTeacher(), pupils[i].getSkillPupil()) +
                                " scores. He got it from " + teachers[j].getName() +
                                ". He has " + teachers[j].getSkillTeacher() + " scores.");
                    }
                }
            }
            return;
        }

    }


}
