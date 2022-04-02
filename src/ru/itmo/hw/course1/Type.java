package ru.itmo.hw.course1;

import java.time.LocalDate;
import java.time.LocalTime;

public enum Type {
    DAY(LocalTime.of(8, 00), LocalTime.of(16, 00), LocalDate.now(), LocalDate.now(),  new String[]{"Gym", "Swimming pool"}),
    DAILY(LocalTime.of(8, 00), LocalTime.of(22, 00), LocalDate.now(), LocalDate.now().plusMonths(6),  new String[]{"Gym", "Group lessons"}),
    FULLDAY(LocalTime.of(8, 00), LocalTime.of(22, 00), LocalDate.now(), LocalDate.now().plusMonths(4),  new String[]{"Gym", "Group lessons", "Swimming pool"});

    LocalTime fromValidTime;
    LocalTime beforValidTime;
    LocalDate startRegistryDay;
    LocalDate finishRegistryDay;
    String[] strings;

    Type(LocalTime fromValidTime, LocalTime beforValidTime, LocalDate startRegistryDay, LocalDate finishRegistryDay, String[]strings){
        this.fromValidTime = fromValidTime;
        this.beforValidTime = beforValidTime;
        this.startRegistryDay = startRegistryDay;
        this.finishRegistryDay = finishRegistryDay;
        this.strings = strings;
    }


    public LocalTime getFromValidTime() {
        return fromValidTime;
    }

    public LocalTime getBeforValidTime() {
        return beforValidTime;
    }

    public LocalDate getStartRegistryDay() {
        return startRegistryDay;
    }

    public LocalDate getFinishRegistryDay() {
        return finishRegistryDay;
    }

    public String[] getStrings() {
        return strings;
    }




}






