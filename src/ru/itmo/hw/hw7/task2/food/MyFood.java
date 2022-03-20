package ru.itmo.hw.hw7.task2.food;

public class MyFood {

    public double maxProteinAmount = 150;
    public double maxFatAmount = 50;
    public double maxCarbonAmount = 90;
    public double maxCaloriesAmount = 1300;
    public Food[] foodList = new Food[10];

    public void addFood(Food food) {
        for (int i = 0; i < foodList.length; i++) {
            if (foodList[i] != null) {
                if (food.getCaloriesAmount() > maxCaloriesAmount) {
                    System.out.println("A lot of Calories");
                }
                if (food.getCarbonAmount() > maxCarbonAmount) {
                    System.out.println("A lot of Carbon");
                }
                if (food.getFatAmount() > maxFatAmount) {
                    System.out.println("A lot of Fat");
                }
                if (food.getProteinAmount() > maxProteinAmount) {
                    System.out.println("A lot of Protein");
                }
                foodList[i] = food;
            }
        System.out.println("list is full");
    }
        public void printFoodListNames(){
            for (Food foodlist: foodList) {
                if (foodlist != null) {
                    System.out.println(foodList);
                }
            }
        }


    }

}
