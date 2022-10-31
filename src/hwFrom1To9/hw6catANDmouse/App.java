package hwFrom1To9.hw6catANDmouse;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tomy", 5, 11);
        Cat cat2 = new Cat("Barsik", 7, 10);
        Cat cat3 = new Cat("Shuba", 10, 15);

        Mouse mouse1 = new Mouse(1);
        Mouse mouse2 = new Mouse(2);
        Mouse mouse3 = new Mouse(3);
        Mouse mouse4 = new Mouse(4);
        Mouse mouse5 = new Mouse(6);
        Mouse mouse6 = new Mouse(8);
        Mouse mouse7 = new Mouse(9);

        cat1.catchMouce(mouse1);
        cat1.catchMouce(mouse2);
        cat1.catchMouce(mouse3);
        cat1.catchMouce(mouse4);
        cat1.catchMouce(mouse5);
        cat1.catchMouce(mouse6);
        cat1.catchMouce(mouse7);

        cat2.catchMouce(mouse1);
        cat2.catchMouce(mouse2);
        cat2.catchMouce(mouse3);
        cat2.catchMouce(mouse4);
        cat2.catchMouce(mouse5);
        cat2.catchMouce(mouse6);
        cat2.catchMouce(mouse7);

        cat3.catchMouce(mouse1);
        cat3.catchMouce(mouse2);
        cat3.catchMouce(mouse3);
        cat3.catchMouce(mouse4);
        cat3.catchMouce(mouse5);
        cat3.catchMouce(mouse6);
        cat3.catchMouce(mouse7);


        System.out.println("Cat1 is caught = " + cat1.getNumberMouse() + " mouse");
        System.out.println(Arrays.toString(cat1.getArrCatchMouce()));

        System.out.println("Cat2 is caught = " + cat2.getNumberMouse() + " mouse");
        System.out.println(Arrays.toString(cat2.getArrCatchMouce()));

        System.out.println("Cat3 is caught = " + cat3.getNumberMouse() + " mouse");
        System.out.println(Arrays.toString(cat3.getArrCatchMouce()));


        cat1.fightCats(cat2);
        System.out.println("Quantity mouse (Cat1) " + cat1.quantityMouse(cat1.getArrCatchMouce()));
        System.out.println("Array lost won (Cat1) " + Arrays.toString(cat1.getArrCatchMouce()));
        System.out.println("Cat1 lost " + cat1.getNumberMouse3() + " mouse");

        System.out.println("Quantity mouse (Cat2) " + cat2.quantityMouse(cat2.getArrCatchMouce()));
         System.out.println("Array lost cat (Cat2) " + Arrays.toString(cat2.getArrCatchMouce()));
        System.out.println("Cat2 lost " + cat1.getNumberMouse2() + " mouse");



        cat1.fightCats(cat3);
        System.out.println("Quantity mouse (Cat1) " + cat1.quantityMouse(cat1.getArrCatchMouce()));
        System.out.println("Array lost won (Cat1) " + Arrays.toString(cat1.getArrCatchMouce()));
        System.out.println("Cat1 lost " + cat1.getNumberMouse3() + " mouse");

        System.out.println("Quantity mouse (Cat3) " + cat3.quantityMouse(cat3.getArrCatchMouce()));
        System.out.println("Array lost cat (Cat3) " + Arrays.toString(cat3.getArrCatchMouce()));
        System.out.println("Cat2 lost " + cat3.getNumberMouse2() + " mouse");

    }
}
