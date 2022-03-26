package ru.itmo.hw.hw6.task3;

public class Application {
    public static void main(String[] args) {

        Mouse mouse1 = new Mouse(1);
        Mouse mouse2 = new Mouse(2);
        Mouse mouse3 = new Mouse(3);
        Mouse mouse4 = new Mouse(4);

        Cat cat1 = new Cat(3, "Cat1", 10);
        Cat cat2 = new Cat(5, "Cat2", 8);
        Cat cat3 = new Cat(7, "Cat3", 8);

        cat1.addMouse(mouse1);
        cat1.addMouse(mouse2);
        cat3.addMouse(mouse3);
        cat3.addMouse(mouse4);

        cat1.fightCats(cat3);

    }
}
