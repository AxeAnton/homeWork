package hw21playFox.menuCommand;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSi implements Serializable {
    int xx;

    public TestSi(int xx) {
        this.xx = xx;
    }

    public void markerTrueFalse() {
        Scanner in = new Scanner(System.in);

        boolean mark = true;

        while (mark) {
            try {
                System.out.println("введите число");
                int userNum = in.nextInt();

                if (userNum > xx) {
                    System.out.println("Цифра больше чем " + xx);
                    xx = userNum;
                } else {
                    System.out.println("Цифра меньше чем " + xx);
                    xx = userNum;
                }
            } catch (InputMismatchException e) {
                System.out.println("не верная цифра, попробуйте снова");
                mark = false;
            }
        }

    }
}
