package wh4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
/*
        int ints1 [] = new int [11];
//        int n = 0;

        for ( int i = 0; i < ints1.length; i += 1 ) {
           int n = (int) ((Math.random() * 2) - 1);
           ints1[i] = n;
        }
        System.out.println(Arrays.toString(ints1));
*/

        int ints [] = {0, -1, 0, -1, 1, 1, 0, -1, 0, -1, 0};
        int i = 0;
        int n = 0;
        int sumMin = 0, sumMax = 0, sumZ = 0;

        for (i=0;i < ints.length;i += 1 ) {
            n = ints[i];
            if (n==0) {
                sumZ +=1;
            }
            if (n==1) {
                sumMax +=1;
            }
            if (n==-1) {
                sumMin +=1;
            }
        }
        System.out.println(sumZ);
        System.out.println(sumMax);
        System.out.println(sumMin);

        if (sumZ > sumMax && sumZ > sumMin) System.out.println("Ноль встречается чаще всего " + sumZ + " раз");
        if (sumMax == sumZ && sumMax == sumMin) System.out.println("Единица встречается чаще всего " + sumMax + " раз");
        if (sumMin == sumZ && sumMin == sumMax) System.out.println("Минус единица встречается чаще всего " + sumMin +  "раз");
    }
}
