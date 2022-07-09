package ru.itmo.hw.test1;

import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class Test1App {
    public static void main(String[] args) {

        /*
         * на цикл while
         * считать с консоли количество тарелок и моющего средства
         * Моющее средство расходуется из расчета 0.5 на 1 тарелку
         * В цикле выводить сколько моющего средства осталось
         * после мытья каждой тарелки
         * После цыкла вывести сколько тарелок и моющего средства
         * осталось
         * */

/*
        Scanner num = new Scanner(System.in);
        System.out.println("input number plates");
        int numPlates = num.nextInt();
        System.out.println("input volume Ferry");
        double numFerry = num.nextInt();
        while (numPlates !=0 && numFerry != 0.5){

            numFerry -= 0.5;
            numPlates -= 1;
            System.out.println("ferry " + numFerry);
        }
        System.out.println("ferry " + numFerry);
        System.out.println("plates " +numPlates);
*/
/*        // Перебор цикла по порядку
        int[] array1 = {3, 6, -2, 4};
        for (int index = 0; index < array1.length; index++) {
            array1[index] *= array1[index];
        }
        System.out.println(Arrays.toString(array1)); // [9, 36, 4, 16]

        // Перебор цикла с КОНЦА
        for (int index = array1.length - 1; index >= 0; index--) {
            System.out.println(Arrays.toString(array1)); // [9, 36, 4, 16] - четыре раза
        }*/
/*
        // FIXME Метод SORT
        int[] array3 = {3, 6, -2, 4};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3)); // FIXME [-2, 3, 4, 6]
        // FIXME Метод binarySearch
        int[] array4 = {3, 6, -2, 4};
        int element1 = Arrays.binarySearch(array4, 6);
        System.out.println(element1); // 1
        // FIXME Метод копирования “Clone” – 1й вариант.
        double[] ints9 = {3.7, -6.2, 12.9, 0.4, 4.1};
        // double[] ints10 = ints9; ТАК копировать НЕльзя.
        double[] cloneInts9 = ints9.clone();
        // FIXME  Метод копирования “CopyOf” класс Arrays – 2й вариант.
        double[] copyInts9 = Arrays.copyOf(ints9, 3);
        System.out.println(Arrays.toString(copyInts9)); // [3.7, -6.2, 12.9]
        // FIXME  Метод копирования “newDoubles” класс Arrays – 3й вариант.
        double[] newDoubles = new double[10]; // создали пустой массив
        System.arraycopy(ints9, 1, newDoubles, 3, 2);
        // "ints9,srcPos: 1," - Из какого массива  копируем
        // newDoubles - в какой массив.
        // destPos 3, - начиная с какого индекса будет добавленно значение в новый массиву (3),
        // length 2, - сколь элементов копируем (5).
        System.out.println(Arrays.toString(newDoubles));
        // [0.0, 0.0, 0.0, -6.2, 12.9, 0.0, 0.0, 0.0, 0.0, 0.0]
        */


        // FIXME Метод сравнения Arrays.equals
        int[] array8 = {6, 7, 8, 11, 18, 8, 2, 5};
        int[] array9 = {9, 10, 5, 13, 28, 12, 8, 9};
        System.out.println(Arrays.equals(array8, array9));
        //  Result is false
        int[] array10 = {9, 10, 5, 13, 28, 12, 8, 9, 15, 1, 8};
        int[] array11 = {6, 7, 8, 11, 18, 8, 2, 5};
        System.out.println(Arrays.equals(array10, array11));
        //  Result is false
        int[] array12 = {6, 7, 8, 11, 18, 8, 2, 5};
        int[] array13 = {6, 7, 8, 11, 18, 8, 2, 5};
        System.out.println(Arrays.equals(array12, array13));
        //  Result is true

        // FIXME Метод сравнения  Arrays.deepEquals
        int[][] A = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 8 } };
        int[][] B = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 8 } };
        int[][] C = { { 3, 4, 5 }, { 4, 5, 6 }, { 7, 2, 4 } };
        System.out.println( Arrays.deepEquals(A, B)); // true
        System.out.println(Arrays.deepEquals(B, C));// false

        // FIXME Метод сравнения  Arrays.mismatch
        //  (Показывает номер индекса первого НЕ совпадения, при совпадении "- 1")
        int intArr[] = { 10, 20, 15, 22, 35 };
        int intArr1[] = { 10, 20, 22, 15};
        System.out.println("The element mismatched at index: " + Arrays.mismatch(intArr, intArr1));
        //  Result is 2

        // FIXME Метод сравнения Arrays.compare
        int[] array1 = {6, 7, 8, 11, 18, 8, 2, 5};
        int[] array2 = {3, 5, 9, 13, 28, 6, 8, 9};
        System.out.println("Result is " + Arrays.compare(array1, array2));
        //  Result is 1
        int[] array3 = {6, 7, 8, 11, 18, 8, 2, 5};
        int[] array4 = {9, 10, 5, 13, 28, 12, 8, 9};
        System.out.println("Result is " + Arrays.compare(array3, array4));
        // Result is -1
        int[] array5 = {6, 7, 8, 11, 18, 8, 2, 5};
        int[] array6 = {6, 7, 8, 11, 18, 8, 2, 5};
        System.out.println("Result is " + Arrays.compare(array5, array6));
        // Result is 0

        //FIXME Метод копирования Arrays.copyOfRange
        // FIXME NB - рекурсивно сравнивает - позволяет указать, какие поля не сравнивать и как далеко нужно заходить в дереве иерархии классов при использовании наследования.
        int[] array7 = {6, 7, 8, 11, 18, 8, 2, 5};
        System.out.println(Arrays.toString(Arrays.copyOfRange(array7, 1, 20)));
        // !!! ДВАДЦАТОГО нет в начальном массиве!!!
        // Result  [7, 8, 11, 18, 8, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


    }
}
