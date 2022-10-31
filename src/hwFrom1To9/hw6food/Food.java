package hwFrom1To9.hw6food;

public class Food {

    private String nameFood;
    private int protein;
    private int fat;
    private int carbohydrates;
    private int calories;

    public Food() {
    }

    public Food(String nameFood) {
        this.nameFood = nameFood;
    }

    public Food(String nameFood, int protein, int fat, int carbohydrates, int calories) {
        setNameFood(nameFood);
        setProtein(protein);
        setFat(fat);
        setCarbohydrates(carbohydrates);
        setCalories(calories);
/*        this.nameFood = nameFood;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.calories = calories;*/
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        if (nameFood == null || nameFood.length() < 3) {
            throw new IllegalArgumentException("nameFood should be min 3 letters");
        }
        this.nameFood = nameFood;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        if (protein < 0) {
            throw new IllegalArgumentException("protein should be >=0 ");
        }
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        if (fat < 0) {
            throw new IllegalArgumentException("fat should be >=0 ");
        }
        this.fat = fat;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        if (carbohydrates < 0) {
            throw new IllegalArgumentException("carbohydrates should be >=0 ");
        }
        this.carbohydrates = carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories < 0) {
            throw new IllegalArgumentException("calories should be >=0 ");
        }
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "nameFood='" + nameFood + '\'' +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';
    }
}
