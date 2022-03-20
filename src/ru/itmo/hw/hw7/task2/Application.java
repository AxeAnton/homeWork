package ru.itmo.hw.hw7.task2;

import ru.itmo.hw.hw7.task2.food.Food;
import ru.itmo.hw.hw7.task2.food.MyFood;

public class Application {

    public static void main(String[] args) {

        Food food1 = new Food();
        food1.setFoodName("Sugar");
        food1.setCaloriesAmount(5000);
        food1.setCarbonAmount(10);
        food1.setFatAmount(10);
        food1.setProteinAmount(10);

        Food food2 = new Food();
        food2.setFoodName("Wine");
        food2.setCaloriesAmount(100);
        food2.setCarbonAmount(10);
        food2.setFatAmount(10);
        food2.setProteinAmount(10);

        Food food3 = new Food();
        food3.setFoodName("Sushi");
        food3.setCaloriesAmount(100);
        food3.setCarbonAmount(10);
        food3.setFatAmount(10);
        food3.setProteinAmount(10);

        Food food4 = new Food();
        food4.setFoodName("Pizza");
        food4.setCaloriesAmount(100);
        food4.setCarbonAmount(10);
        food4.setFatAmount(10);
        food4.setProteinAmount(10);


        MyFood myFood = new MyFood();

        myFood.addFood(food1);
        myFood.addFood(food2);
        myFood.addFood(food3);
        myFood.addFood(food4);

        myFood.printFoodListName();
    }
}
