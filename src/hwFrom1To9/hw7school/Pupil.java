package hwFrom1To9.hw7school;

import hwFrom1To9.hw7school.base.Subject;

public class Pupil extends Subject {
    private int skillPupil;


    public Pupil(int age, String name, String subject, int skillPupil) {
        super(age, name, subject);
        if (skillPupil < 3) System.out.println("Pupil skill's should be more then 2 scores");
        this.skillPupil = skillPupil;
        // this.skillPupil = skillPupil; //Если есть проверка то прямая ссылка НЕ НУЖНА!

    }

    public int getSkillPupil() {
        return skillPupil;
    }

/*    FIXME по сути если ЕСТЬ метод addSkill (т.е  и он принемет в аргумент int skillPupil), то сеттор не нужен, а проверку надо в конструктор перенести или private сеттеру поставить.
        private void setSkillPupil(int skillPupil) {
        if (skillPupil < 3) System.out.println("Pupil skill's should be more then 2 scores");
        this.skillPupil = skillPupil;
    }
*/

    public int addSkill(int skillTeacher, int skillPupil) {
        skillPupil += (int) (Math.random() * skillTeacher);
        return skillPupil;
    }
}
