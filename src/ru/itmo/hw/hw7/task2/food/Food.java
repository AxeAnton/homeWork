package ru.itmo.hw.hw7.task2.food;

public class Food {
    private String foodName;
    private double proteinAmount;
    private double fatAmount;
    private double carbonAmount;
    private double caloriesAmount;



    public double getCarbonAmount() {
        return carbonAmount;
    }
    public double getCaloriesAmount() {
        return caloriesAmount;
    }

   public double getFatAmount() {
        return fatAmount;
    }

   public String getFoodName() {
        return foodName;
    }

    public double getProteinAmount() {
        return proteinAmount;
    }

    public void setCarbonAmount(double carbonAmount) {
        if (carbonAmount <= 0)
            throw new IllegalArgumentException("Количество должно быть больше и не равно нулю");
        this.carbonAmount = carbonAmount;
    }

    public void setCaloriesAmount(double caloriesAmount) {
        if (caloriesAmount <= 0)
            throw new IllegalArgumentException("Количество должно быть больше и не равно нулю");
        this.caloriesAmount = caloriesAmount;
    }
    public void setFatAmount(double fatAmount) {
        if (fatAmount <= 0)
            throw new IllegalArgumentException("Количество должно быть больше и не равно нулю");
        this.fatAmount = fatAmount;
    }
    public void setFoodName(String foodName) {
        if (foodName == null || foodName.length() < 2)
            throw new IllegalArgumentException("Количество должно быть больше и не равно нулю");
        this.foodName = foodName;
    }

    public void setProteinAmount(double proteinAmount) {
        if (proteinAmount <= 0)
            throw new IllegalArgumentException("Количество должно быть больше и не равно нулю");
        this.proteinAmount = proteinAmount;
    }
}


