package wh4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int ints1 [] = new int [10];
        int n = 0;
        int sum = 0;
        int max = 0;

        for ( int i = 0; i < ints1.length; i += 1 ) {
            n = (int) ( Math.random() * 100);
            ints1[i] = n;
            sum += n;

        }
        System.out.println(Arrays.toString(ints1));
        System.out.println(sum);

        for (int elem: ints1) {
            if (max < elem) {
                max = elem;
            }
        }
        System.out.println(max);

        int min = ints1[0];
        for (int elem: ints1) {
            if (min > elem  ) {
                min = elem;
            }
        }
        System.out.println(min);

    }
}
