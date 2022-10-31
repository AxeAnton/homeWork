package hw16food;

import java.util.Arrays;

public class MyFood {

    public String[] nameMyFood = new String[10];
    private int maxProtein = 10;
    private int maxFat = 10;
    private int maxCarbohydrates = 50;
    private int maxCalories = 200;


    public String[] getNameMyFood() {
        return nameMyFood;
    }

    public int getMaxProtein() {
        return maxProtein;
    }

    public int getMaxFat() {
        return maxFat;
    }

    public int getMaxCarbohydrates() {
        return maxCarbohydrates;
    }

    public int getMaxCalories() {
        return maxCalories;
    }

    @Override
    public String toString() {
        return "MyFood{" +
                "nameMyFood=" + Arrays.toString(nameMyFood) +
                ", maxProtein=" + maxProtein +
                ", maxFat=" + maxFat +
                ", maxCarbohydrates=" + maxCarbohydrates +
                ", maxCalories=" + maxCalories +
                '}';
    }

    public void chekFood(Food food) {
        for (int i = 0; i < nameMyFood.length; i++) {
            if (nameMyFood[i] == null) {
                if (food.getProtein() > maxProtein) {
                    System.out.println("The product " + food.getNameFood() + " has a lot of Proteins " + food.getProtein());
                     return;
                } else if (food.getFat() > maxFat) {
                    System.out.println("The product " + food.getNameFood() + " has a lot of Fat " + food.getFat());
                     return;
                } else if (food.getCarbohydrates() > maxCarbohydrates) {
                    System.out.println("The product " + food.getNameFood() + " has a lot of Carbohydrates " + food.getCarbohydrates());
                     return;
                } else if (food.getCalories() > maxCalories) {
                    System.out.println("The product " + food.getNameFood() + " has a lot of Calories " + food.getCalories());
                    return;
                }
                nameMyFood[i] = food.getNameFood();
                return;
            }
        }
    }
}
