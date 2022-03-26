package ru.itmo.hw.hw6.task2;

public class Food {
    private String foodName;
    private int foodProtein;
    private int foodFat;
    private int foodCarbohydrates;
    private int foodCalories;

    public Food(String foodName) {
        setFoodName(foodName);
    }

    public Food(String foodName, int foodFat) {
        setFoodFat(foodFat);
        setFoodName(foodName);
    }
    public Food(String foodName, int foodFat,int foodCarbohydrates) {
        setFoodFat(foodFat);
        setFoodName(foodName);
        setFoodCarbohydrates(foodCarbohydrates);
    }

    public Food(String foodName, int foodFat,int foodCarbohydrates, int foodCalories) {
        setFoodFat(foodFat);
        setFoodName(foodName);
        setFoodCarbohydrates(foodCarbohydrates);
        setFoodCalories(foodCalories);
    }

    public Food(String foodName, int foodFat,int foodCarbohydrates, int foodCalories, int foodProtein) {
        setFoodFat(foodFat);
        setFoodName(foodName);
        setFoodCarbohydrates(foodCarbohydrates);
        setFoodCalories(foodCalories);
        setFoodProtein(foodProtein);
    }

    public String getFoodName() {return foodName;}
    public void setFoodName(String foodName) {
        if (foodName.length() < 3) {
            throw new IllegalArgumentException("Имя должно быть не менее Трех букв");
        }
            this.foodName = foodName;
    }

    public int getFoodProtein() {return foodProtein;}
    public void setFoodProtein(int foodProtein) {
        if (foodProtein < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.foodProtein = foodProtein;
    }
    public int getFoodFat() {return foodFat;}
    public void setFoodFat(int foodFat) {
        if (foodFat <= 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.foodFat = foodFat;
    }

    public int getFoodCarbohydrates() {return foodCarbohydrates;}
    public void setFoodCarbohydrates(int foodCarbohydrates) {
        if (foodCarbohydrates < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.foodCarbohydrates = foodCarbohydrates;
    }

    public int getFoodCalories() {return foodCalories;}
    public void setFoodCalories(int foodCalories) {
        if (foodCalories < 0) {
            throw new IllegalArgumentException("нб менее 0");
        }
        this.foodCalories = foodCalories;
    }

}
