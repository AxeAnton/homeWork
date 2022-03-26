package ru.itmo.hw.hw6.task2;

public class MyFood {
    private int maxProtein;
    private int maxFat;
    private int maxCarbohydrates;
    private int maxCalories;
    private Food[] myFoods = new Food[100];
    int num = 0;

    public MyFood(int maxProtein, int maxFat, int maxCarbohydrates, int maxCalories) {
        setMaxProtein(maxProtein);
        setMaxFat(maxFat);
        setMaxCarbohydrates(maxCarbohydrates);
        setMaxCalories(maxCalories);
    }

    //    public int getMaxProtein() {return maxProtein;}
    public void setMaxProtein(int maxProtein) {
        if (maxProtein < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.maxProtein = maxProtein;
    }

    //    public int getMaxFat() {return maxFat;}
    public void setMaxFat(int maxFat) {
        if (maxFat < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.maxFat = maxFat;
    }

    //    public int getMaxCarbohydrates() {return maxCarbohydrates;}
    public void setMaxCarbohydrates(int maxCarbohydrates) {
        if (maxCarbohydrates < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.maxCarbohydrates = maxCarbohydrates;
    }

    //    public int getMaxCalories() {return maxCalories;}
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
            System.out.println("Много белка - " + food.getFoodName());
            return;
        }
        if (food.getFoodCalories() > maxCalories) { // Почему здесть ГЕТ?
            System.out.println("Много калорий -" + food.getFoodName());
            return;
        }
        if (food.getFoodCarbohydrates() > maxCarbohydrates) { // Почему здесть ГЕТ?
            System.out.println("Много угливодов -" + food.getFoodName());
            return;
        }
        if (food.getFoodFat() > maxFat) { // Почему здесть ГЕТ?
            System.out.println("Много жира -" + food.getFoodName());
            return;
        }

        if (num < myFoods.length) {

            myFoods[num] = food;
            num ++;
            System.out.println("Добавлен продукт " + food.getFoodName());
//          return;
            }
    }

    public void listFood() {
        for (int i = 0; i < myFoods.length; i++) {
            if (myFoods[i] != null) {
                System.out.println("Продукт в списке -" + myFoods[i].getFoodName());
//                return;
            }
        }
    }
}



