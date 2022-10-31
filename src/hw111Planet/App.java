package hw111Planet;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Planet mars = Planet.MARS;
        System.out.println(mars.getMuss()); //140

        mars.setMuss(180);
        System.out.println(mars.getMuss()); //180

        Planet[] Planets = Planet.values(); // МЕТОД values() для перевода в МАССИВ ПЕРЕЧЕСЛЕНИЯ
        System.out.println(Arrays.toString(Planets));

        for (Planet res: Planets) {
            System.out.println("Name - " + res.getName() + ", Radius - " + res.getRadius() + ", Muss - " + res.getMuss());
            
        }


    }
}
