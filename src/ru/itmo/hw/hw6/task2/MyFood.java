package ru.itmo.hw.hw6.task2;


public class MyFood {
    private int maxProtein;
    private int maxFat;
    private int maxCarbohydrates;
    private int maxCalories;
    private MyFood[] myFoods = new MyFood[100];

    public MyFood(int maxProtein, int maxFat, int maxCarbohydrates, int maxCalories) {
    setMaxProtein(maxProtein);
    setMaxFat(maxFat);
    setMaxCarbohydrates(maxCarbohydrates);
    setMaxCalories(maxCalories);
    }

    public int getMaxProtein() {return maxProtein;}
    public void setMaxProtein(int maxProtein) {
        if (maxProtein < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.maxProtein = maxProtein;
    }

    public int getMaxFat() {return maxFat;}
    public void setMaxFat(int maxFat) {
        if (maxFat < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.maxFat = maxFat;
    }

    public int getMaxCarbohydrates() {return maxCarbohydrates;}
    public void setMaxCarbohydrates(int maxCarbohydrates) {
        if (maxCarbohydrates < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.maxCarbohydrates = maxCarbohydrates;
    }

    public int getMaxCalories() {return maxCalories;}
    public void setMaxCalories(int maxCalories) {
        if (maxCalories < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.maxCalories = maxCalories;
    }

  /*  public MyFood[] getMyFoods() {return myFoods;}
    public void setMyFoods(MyFood[] myFoods) {
        this.myFoods = myFoods;
    }
*/
    public void addFood(Food food) {
        if (food.getFoodProtein() > maxProtein) { // Почему здесть ГЕТ?
            System.out.println("Много жира");
            return;
        } else if (food.getFoodCalories() > maxCalories) { // Почему здесть ГЕТ?
            System.out.println("Много калорий");
            return;
        } else if (food.getFoodCarbohydrates() > maxCarbohydrates) { // Почему здесть ГЕТ?
            System.out.println("Много угливодов");
            return;
        } else if (food.getFoodFat() > maxFat) { // Почему здесть ГЕТ?
            System.out.println("Много жира");
            return;
        }
        for (int i = 0; i <myFoods.length; i++) {
            if (myFoods[i] == null) {
                myFoods[i] = getFoodN;
                System.out.println("Добавлен продукт" + +);
                return;
            }
        }
        System.out.println(myFoods);
    }

}
