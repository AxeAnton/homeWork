package ru.itmo.hw.hw6.task1;

import ru.itmo.hw.hw6.task1.climbers.Climber;
import ru.itmo.hw.hw6.task1.climbers.Group;
import ru.itmo.hw.hw6.task1.climbers.Mountain;

public class Applitation {

    public static void main(String[] args) {
        Mountain mountain1 = new Mountain("Россия", 5555, "Россия");
        Group group1 = new Group(mountain1, false, 3);
        Group group2 = new Group(mountain1, true, 2);




        Climber climber1 = new Climber("Антон", "Россия");
        Climber climber2 = new Climber("Иван", "Россия");
        Climber climber3 = new Climber("Петя", "Россия");
        Climber climber4 = new Climber("Костя", "Россия");
        Climber climber5 = new Climber("Валера", "Россия");
        Climber climber6 = new Climber("Сияна", "Россия");
        Climber climber7 = new Climber("Аня", "Россия");

        group1.addClimber(climber1);
        group1.addClimber(climber2);
        group1.addClimber(climber3);
        group1.addClimber(climber4);

        group2.addClimber(climber5);
        group2.addClimber(climber6);
        group2.addClimber(climber7);



    }





}

