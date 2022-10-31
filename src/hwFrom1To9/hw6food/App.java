package hwFrom1To9.hw6food;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Food food1 = new Food("meat", 22, 13, 0, 192);
        Food food2 = new Food("bread", 8, 3, 48, 259);
        Food food3 = new Food("cabbage", 1, 0, 6, 25);
        Food food4 = new Food("sugar",  0,  0, 99, 409);

        MyFood myFood = new MyFood();
        myFood.chekFood(food1);
        myFood.chekFood(food2);
        myFood.chekFood(food3);
        myFood.chekFood(food4);
        System.out.println(Arrays.toString(myFood.getNameMyFood()));


    }
}
