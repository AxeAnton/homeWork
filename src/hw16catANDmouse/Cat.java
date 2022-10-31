package hw16catANDmouse;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Cat {
    // 2. Класс Кот: имя, скорость, вес, пойманные мыши;
    private String nameCat;
    private int speedCat;
    private int weightCat;
    private int numberMouse = 0;
    private int numberMouse2 = 0;
    private int numberMouse3 = 0;
    private int numberMouse4 = 0;
    private int[] arrCatchMouce = new int[20];

    public int getNumberMouse4() {
        return numberMouse4;
    }

    public void setNumberMouse4(int numberMouse4) {
        this.numberMouse4 = numberMouse4;
    }

    public int getNumberMouse3() {
        return numberMouse3;
    }

    public void setNumberMouse3(int numberMouse3) {
        this.numberMouse3 = numberMouse3;
    }

    public int getNumberMouse2() {
        return numberMouse2;
    }

    public void setNumberMouse2(int numberMouse2) {
        this.numberMouse2 = numberMouse2;
    }


    public Cat() {

    }

    public Cat(String nameCat, int speedCat, int weightCat) {
        setNameCat(nameCat);
        setSpeedCat(speedCat);
        setWeightCat(weightCat);

    }

    public Cat(String nameCat, int speedCat, int weightCat, Mouse mouse) {
        setNameCat(nameCat);
        setSpeedCat(speedCat);
        setWeightCat(weightCat);

    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        if (nameCat != null && nameCat.length() < 3) {
            throw new IllegalArgumentException("nameCat should be have more then 3 letters ");
        }
        this.nameCat = nameCat;
    }

    public int getSpeedCat() {
        return speedCat;
    }

    public void setSpeedCat(int speedCat) {
        if (speedCat < 0) {
            throw new IllegalArgumentException("speedCat should be > 0 ");
        }
        this.speedCat = speedCat;
    }

    public int getWeightCat() {
        return weightCat;
    }

    public void setWeightCat(int weightCat) {
        if (weightCat < 0) {
            throw new IllegalArgumentException("weightCat should be > 0 ");
        }
        this.weightCat = weightCat;
    }

    public int getNumberMouse() {
        return numberMouse;
    }

/*
public void setNumberMouse(int numberMouse) {
        if (numberMouse < 0) {
            throw new IllegalArgumentException("numberMouse should be > 0 ");
        }
        this.numberMouse = numberMouse;
    }
*/

    public int[] getArrCatchMouce() {
        return arrCatchMouce;
    }

    public void setArrCatchMouce(int[] arrCatchMouce) {
        this.arrCatchMouce = arrCatchMouce;
    }

    public void catchMouce(Mouse mouse) {
        for (int i = 0; i < arrCatchMouce.length; i++) {
            if (arrCatchMouce[i] == 0 && speedCat > mouse.getSpeedMouse()) {
                arrCatchMouce[i] = mouse.getSpeedMouse();
                numberMouse += 1;
                return;
            }
        }
    }

    public void fightCats(Cat cat) {
        if (this.getWeightCat() == cat.getWeightCat()) { // веса котов
            throw new IllegalArgumentException("this.weightCat = weightCat");
        } else if (this.getWeightCat() > cat.getWeightCat()) { // кот №1 победил
            for (int i = 0; i < cat.arrCatchMouce.length; i++) { // массив проигравшего кота
                if (cat.arrCatchMouce[i] != 0) { // скорость мыши проигравшего кота
                    for (int j = 0; j < this.arrCatchMouce.length; j++) { //массив выигравшего кота
                        if (this.arrCatchMouce[j] == 0 && cat.arrCatchMouce[i] < this.speedCat) {
                            // место для добавления скорости мыши в массив ВЫИГРАВШЕГО кота.
                            this.arrCatchMouce[j] = cat.arrCatchMouce[i]; // добавление
                            cat.arrCatchMouce[i] = 0;

                        } else if (cat.arrCatchMouce[i] >= this.speedCat) {
                            cat.arrCatchMouce[i] = 0;
                           numberMouse2 += 1;
                        }
                    }
                }
            }
        } else if (this.getWeightCat() < cat.getWeightCat()) { // This 10 / Cat 11
            for (int i = 0; i < this.arrCatchMouce.length; i++) { // массив проигравшего кота
                if (this.arrCatchMouce[i] != 0) { // скорость мыши проигравшего кота
                    for (int j = 0; j < cat.arrCatchMouce.length; j++) { //массив выигравшего кота
                        if (cat.arrCatchMouce[j] == 0 && this.arrCatchMouce[i] < cat.speedCat) {
                            // место для добавления скорости мыши в массив ВЫИГРАВШЕГО кота.
                            cat.arrCatchMouce[j] = this.arrCatchMouce[i]; // добавление
                            this.arrCatchMouce[i] = 0;
                            //numberMouse3 += 1;
                        } else if (this.arrCatchMouce[i] >= cat.speedCat) {
                            this.arrCatchMouce[i] = 0;
                            numberMouse3 += 1;
                        }
                    }
                }
            }
        }
    }

    public int quantityMouse(int[] arrCatchMouce) {
        for (int i = 0; i < arrCatchMouce.length; i++) {
           if (arrCatchMouce[i] > 0)  numberMouse4 +=1;
        }
        return numberMouse4;
    }

                    @Override
                    public String toString () {
                        return "Cat{" +
                                "nameCat='" + nameCat + '\'' +
                                ", speedCat=" + speedCat +
                                ", weightCat=" + weightCat +
                                ", arrCatchMouce=" + Arrays.toString(arrCatchMouce) +
                                '}';
                    }

                }

