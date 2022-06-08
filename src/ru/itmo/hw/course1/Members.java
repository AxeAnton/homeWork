package ru.itmo.hw.course1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Members {



    private String name;
    private String surName;
    private LocalDate birthYear;

    public Members(String name, String surName, LocalDate birthYear) {
        this.name = name;
        this.surName = surName;
        setBirthYear(birthYear);
    }

    public LocalDate getBirthYear() {return birthYear;}

    public void setBirthYear(LocalDate birthYear) {
        if (birthYear.plusYears(18).isBefore(LocalDate.now()) && birthYear.plusYears(60).isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Слишком молод, вход запрещен");
            this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.length() < 2)
            throw new IllegalArgumentException("Не верный ввод, ввидите имя длиной не менее двух букв");
        this.name = name;
    }

    public String getSurName() {return surName;}
    public void setSurName(String surName) {
        if (surName == null || name.length() < 2)
            throw new IllegalArgumentException("Не верный ввод, ввидите имя длиной не менее двух букв");
        this.surName = surName;

    }

    public void getFromValidTime(Type daily) {
    }
}
