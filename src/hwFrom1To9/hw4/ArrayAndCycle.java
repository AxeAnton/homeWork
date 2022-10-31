package hwFrom1To9.hw4;

import java.util.Arrays;

public class ArrayAndCycle {
    public static void main(String[] args) {
/*
        ### Задача 1
        Заполните массив на N (сами) элементов случайным целыми числами и выведете максимальное, минимальное и среднее значение
*/
/*
        int[] arry1 = {4, -5, 0, 8, 12, 1};
        int max = arry1[0];
        for (int volume1 : arry1) {
            if (max < volume1) {
            max = volume1;
            }
        }
        System.out.println(max);

        int min1 = arry1[0];
        for (int volume1 : arry1) {
            if (min1 > volume1) {
                min1 = volume1;
            }
        }
        System.out.println(min1);

        int arry1Langht = arry1.length;
        double sum1 = 0;
        double sum2 = 0;
        for (int volume1 : arry1) {
               sum1 += volume1;
               sum2 = sum1 / arry1Langht;
            }
        System.out.println(sum2);
*/

/*
        ### Задача 2
        Создайте массив из чётных чисел [2;20] и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
*/
/*
        int[] arry2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arry3 = new int [10];
        int ind3 = 0;
        int res;
        for (int ind = arry2.length - 1; ind >= 0 ; ind--) {
            res = arry2[ind];
            arry3[ind3] = res;
            ind3 += 1;
            System.out.println(res);
        }
        System.out.println(Arrays.toString(arry3));


*/

/*
        ### Задача 3
        Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
        Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.
                Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
*/

/*
        int[] arry4 = {-1, 0, -1, -1, 0, 1, 1, 0, 0, 0, -1, -1};
        System.out.println(Arrays.toString(arry4));
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int volum : arry4) {
            if (volum == -1) {
                sum1 += 1;
            } else if (volum == 0) {
                sum2 += 1;
            } else if (volum == 1) {
                sum3 += 1;
            }
        }
        System.out.println("Firsr sum1 " + sum1 + " Second sum2 " + sum2 + " Therd sume3 " + sum3);

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println(sum1);
            System.out.println(-1);
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println(sum2);
            System.out.println(0);
        } else if (sum3 > sum1 && sum2 > sum3) {
            System.out.println(sum3);
            System.out.println(1);
        } else {
            System.out.println("There are double results");
        }

*/



/*
        ### Задача 4
        Задан одномерный массив целых чисел.
        Образуйте из него два отсортированных по возрастанию массива, содержащих четные и нечетные числа.
*/



/*
        int[] arry5 = {56, 21, 29, 36, 77, 13, 78, 30, 4, 1, 90, 11};

        int odd = 0;
        int even = 0;
        for (int volum1 : arry5) {
            int res3 = volum1 % 2;
            if (res3 != 0) odd += 1;
            else even += 1;
        }
        int[] oddArray = new int[odd];
        int[] evenArray = new int[even];

        int oddInd = 0;
        int evenInd = 0;
        for (int volum1 : arry5) {
            if (volum1 == 0) {
                System.out.println("Theis is 0");
                break;
            }
            if (volum1 % 2 != 0) {
                oddArray[evenInd] = volum1;
                evenInd += 1;
            } else {
                evenArray[oddInd] = volum1;
                oddInd += 1;
            }
        }
        System.out.println(Arrays.toString(oddArray));
        System.out.println(Arrays.toString(evenArray));

*/
/*
        ### Задача 5
        Задать массив. Отрицательные элементы массива перенести в новый массив.
        Размер массива должен быть равен количеству отрицательных элементов.
*/


        int[] arry5 = {56, -21, 29, 36, 77, -13, 78, -30, 4, -1, 90, -11};

        int negativ = 0;

        for (int volum1 : arry5) {
            if (volum1 < 0) negativ += 1;
        }
        int[] negativArray = new int[negativ];
        System.out.println(Arrays.toString(negativArray));

        int indNewArry = 0;
        for (int volum1 : arry5) {
            if (volum1 == 0) {
                System.out.println("Theis is 0");
                break;
            } else if (volum1 < 0) {
                negativArray[indNewArry] = volum1;
                indNewArry += 1;
            }
        }
        System.out.println(Arrays.toString(negativArray));




/*
### Задания
        1. Разобрать алгоритм быстрой сортировки, объяснить работу метода Arrays.sort
        2. Разобрать методы класса [Arrays](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html):
        1) compare
        2) copyOfRange
        3) equals / deepEquals
        4) mismatch
*/


    }
}
