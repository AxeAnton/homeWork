package ru.itmo.hw.hw6.task1.climbers;

import java.util.Objects;

public class Mountain {
    private String mountainCountry;
    private int mountainHeight;
    private String mountainName;

    public Mountain(String mountainCountry, int mountainHeight, String mountainName) {
        setMountainCountry(mountainCountry);
        setMountainHeight(mountainHeight);
        setMountainName(mountainName);
    }

    public String getMountainName() {
        return mountainName;
    }
    public void setMountainName(String mountainName) {
        Objects.requireNonNull(mountainName, "mountainName не мб null");
        if (mountainName.length() < 4) {
            throw new IllegalArgumentException("Имя должно быть не менее ЧЕТЫРЕХ букв");
        }
        this.mountainName = mountainName;
    }

    public String getMountainCountry() {return mountainCountry; }
    public void setMountainCountry(String mountainCountry) {
        Objects.requireNonNull(mountainCountry, "mountainCountry не мб null");
        if (mountainCountry.length() < 4) {
            throw new IllegalArgumentException("Название страны должно быть не менее ЧЕТЫРЕХ букв");
        }
        this.mountainCountry = mountainCountry;
    }

    public int getMountainHeight() {return mountainHeight;}
    public void setMountainHeight(int mountainHeight) {
        if (mountainHeight < 100) {
            throw new IllegalArgumentException("Высота горы должно быть не менее ЧЕТЫРЕХ букв");
        }
        this.mountainHeight = mountainHeight;
    }









}
