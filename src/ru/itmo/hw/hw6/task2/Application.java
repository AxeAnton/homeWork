package ru.itmo.hw.hw6.task2;

public class Application {
    public static void main(String[] args) {

    Food food1 = new Food("milk", 3, 4, 5, 19);
    Food food2 = new Food("mayonnaise", 3, 64, 4,629);
    Food food3 = new Food("sugar", 1, 1, 100,387);
    Food food4 = new Food("cheese", 23, 30, 0,364);

    MyFood myFood = new MyFood(500,4, 100, 100);

    myFood.addFood(food1);
    myFood.addFood(food2);
    myFood.addFood(food3);
    myFood.addFood(food4);

    myFood.listFood();

    }
}
