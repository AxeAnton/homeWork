package ru.itmo.hw.hw6.task1.climbers;


import java.util.Objects;

public class Climber {
    private String name;
    private String address;

    public Climber(String name, String address) {
        setName(name);  // что бы проверка из отрабатывала корректро, видимо из stter??
        setAddress(address); // что бы проверка из отрабатывала
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name, "name не мб null");
        if (name.length() < 3) {
            throw new IllegalArgumentException("Имя должно быть не менее ПЯТИ букв");
            }
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        Objects.requireNonNull(address, "address не мб null");
        if (address.length() < 5) {
            throw new IllegalArgumentException("Имя должно быть не менее ПЯТИ букв");
        }
        this.address = address;
    }

}
