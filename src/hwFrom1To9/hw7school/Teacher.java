package hwFrom1To9.hw7school;

import hwFrom1To9.hw7school.base.Subject;

public class Teacher extends Subject {

    private int skillTeacher;

    public Teacher(int age, String name, String subject, int skillTeacher) {
        super(age, name, subject);
        setSkillTeacher(skillTeacher);
            }

    public int getSkillTeacher() {
        return skillTeacher;
    }

    public void setSkillTeacher(int skillTeacher) {
        if (skillTeacher < 0) System.out.println("Teacher skill's should be positive");
        this.skillTeacher = skillTeacher;
    }

/*
    public void teach(Pupil pupil) {

    }
*/

}
