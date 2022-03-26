package ru.itmo.hw.hw6.task3;

import java.util.Objects;

public class Cat {

    private int catSpeed;
    private String catName;
    private int weight;
//    private int numberCaughtMouse;
    private Mouse mice[] = new Mouse[100];


    public Cat(int CatSpeed, String catName, int weight) {
        setCatSpeed(catSpeed);
        setCatName(catName);
        setWeight(weight);
//        setNumberCaughtMouse(numberCaughtMouse); // Это вообще недо?
}

    public int getCatSpeed() {
        return catSpeed;
    }

    public void setCatSpeed(int catSpeed) {
        if (catSpeed < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.catSpeed = catSpeed;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        Objects.requireNonNull(catName, "name не мб null");
        if (catName.length() < 3) {
            throw new IllegalArgumentException("Имя должно быть не менее Трех букв");
        }
        this.catName = catName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.weight = weight;
    }

 /*   public int getNumberCaughtMouse() {
        return numberCaughtMouse;
    }

    public void setNumberCaughtMouse(int numberCaughtMouse) {
        if (numberCaughtMouse < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.numberCaughtMouse = numberCaughtMouse;
    }
*/
    public Mouse[] getMice() {
        return mice;
    }


    public void addMouse(Mouse mouse) {
        if (mouse.getMouseSpeed() > getCatSpeed()) {
            System.out.println("The mouse ran away");
            return;
        }
        for (int i = 0; i < mice.length; i++) {
            if (mice[i] == null) {
                mice[i] = mouse;
                System.out.println("Мыш " + mice + " поймана");
                return;
            }
        }
    }

    public void fightCats(Cat cat) {  // fightCats  - это один кот, а это (Cat cat) второй кот.
        if (this.weight > cat.weight) {
            for (int i = 0; i < cat.mice.length; i++) {
                if (cat.mice[i] == null) continue;
                if (cat.mice[i].getMouseSpeed() > this.catSpeed) {
                    System.out.println("ооооо");
                    return;
                }
                this.addMouse(cat.mice[i]);
            }


        }


    }

}
