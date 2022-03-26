package ru.itmo.hw.hw6.task1.climbers;

import java.util.Arrays;
import java.util.Objects;

public class Group {

    private boolean groupOpen;
    private int countClimbers;
    private Climber[] climbers = new Climber[3];  // массив альпенистов
    private Mountain mountainName;

    public Group(Mountain mountainName, boolean groupOpen, int countClimbers) {
        setGroupOpen(groupOpen);
        setCountClimbers(countClimbers);
        setMountainName(mountainName);
    }

    public int getCountClimbers() {return countClimbers;}
    public void setCountClimbers(int countClimbers) {
        if (countClimbers < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.countClimbers = countClimbers;
    }

    public Mountain getMountainName() {return mountainName;}
    public void setMountainName(Mountain mountainName) {
        Objects.requireNonNull(mountainName, "не мб null");
        this.mountainName = mountainName;
    }

    public Climber[] getClimbers() {return climbers;}
    public void setClimbers(Climber[] climbers) {
/*
        if (climbers == null) {
            System.out.println("");
        }
*/
        this.climbers = climbers;
    }

    public boolean isGroupOpen() {return groupOpen;}
    public void setGroupOpen(boolean groupOpen) {
        this.groupOpen = groupOpen;
    }

    public void addClimber(Climber climber) {
            if (!groupOpen) {
                System.out.println("Нет набора");
                return;
            }
        for (int i = 0; i < climbers.length; i++) {
            if (climbers[i] == null ){
                climbers[i] = climber;
                System.out.println("Альпинист " + climber.getName() +" добавлен");
                return;
            }
        }
        System.out.println("Места закончались");
    }
}

