package hw17school;

public class App {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(43, "Anton", "Math", 5);
        Teacher teacher2 = new Teacher(43, "Anna", "Eng", 5);

        Pupil pupil1 = new Pupil(10, "Shiny1", "Math", 7);
        Pupil pupil2 = new Pupil(10, "Shiny2", "Math", 7);
        Pupil pupil3 = new Pupil(10, "Demid", "Song", 5);
        Pupil pupil4 = new Pupil(10, "Shiny3", "Math", 7);
        Pupil pupil5 = new Pupil(12, "Piter1", "Eng", 5);
        Pupil pupil6 = new Pupil(12, "Piter2", "Eng", 5);

        Director director1 = new Director(55, "Ivan");

        School school1 = new School(209,director1);

        Teacher[] teachers = new Teacher[]{teacher1, teacher2};
        Pupil[] pupils = new Pupil[]{pupil1, pupil2, pupil3, pupil4, pupil5, pupil6};

        System.out.println("Director name " + director1.getName());
        director1.startLessons();
        school1.thichingPuple(teachers, pupils);
        director1.finishLessons();
    }
}
