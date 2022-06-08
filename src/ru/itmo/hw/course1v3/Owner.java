package ru.itmo.hw.course1v3;

import java.time.LocalDate;

public class Owner {


    private String name;
    private String surname;
    private String yearOfBirthday;


    public Owner() {
    }

    public Owner(String name, String surname, String yearOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirthday = yearOfBirthday;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 2) throw new IllegalArgumentException("Name" +
                " must not be empty or less than 2 letters");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.length() < 2) throw new IllegalArgumentException("Surname" +
                " must not be empty or less than 2 letters");
        this.surname = surname;
    }

    public String getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(String yearOfBirthday) {
        if (yearOfBirthday == null || yearOfBirthday.length() < 10)
            throw new IllegalArgumentException("Requested format" +
                    " yearOfBirthday must not be yyyy-MM-dd (1987-06-11)");
        LocalDate parseDate = LocalDate.parse(yearOfBirthday);
        this.yearOfBirthday = String.valueOf(parseDate);
    }

    @Override
    public String toString() {
        return "Owner: " + name + " " + surname;
    }




}