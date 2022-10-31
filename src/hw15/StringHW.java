package hw15;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class StringHW {
    public static void main(String[] args) {
/*
### Задача 1
        Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()),
        и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
        В итоге в массиве будут только уникальные слова.

        Выход их программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен
        Перед завершением программы, вывести получившийся массив в консоль <br>
*/
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder();
        // String st1 = sb1.toString();

        while (true) {
            System.out.println("enter ward");
            String word = scanner.nextLine();
            String st1 = sb1.toString();
            if (word == null) {
                System.out.println("enter the ward");
            } else if (word.equals("exit")) {
               // String st1 = sb1.toString();
                String[] array1 = st1.split(" ");
                System.out.println(Arrays.toString(array1));
                break;
            } else if (st1.contains(word)) { //word.contentEquals(sb1)
                System.out.println("this ward is incl. enter another ward");
            } else {
                sb1.append(word).append(" ");
            }
        }

/*

        String str9 = "by, hello, yes";
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter ward");
        String word = scanner2.nextLine();
        if (str9.contains(word)) {
            System.out.println("this ward is incl. enter another ward");
        } else {
            System.out.println("ward add to pull");
        }
*/

/*
### Задача 2

        Заменить все буквы в слове на строчные, а первую букву на заглавную.
        Например, `дано hello, получаем Hello` / `дано HeLLO, получаем Hello`.
*/

/*

        String st2 = "hello";
        String st3 = "HeLLo";
        System.out.println(st2.replace("h", "H"));
        System.out.println(st3.toLowerCase(Locale.ROOT).replace("h", "H"));
*/

/*
### Задача 3

        Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
        Предложение для поска длинного слова: "в предложении все слова разной длины".
*/

/*
        String st4 = "in the sentence all the words are of different lengths";
        String[] str2 = st4.split(" ");
        int[] int1 = new int[10];

        for (int i = 0; i < 10; i++) {
            int num = str2[i].length();
            int1[i] = num;
        }

        int index = 0;
        int maxResult = 0;
        for (int i = 0; i < 10; i++) {
            if (int1[i] > maxResult) {
                maxResult = int1[i];
                index = i;
            }
        }

        System.out.println(st4.split(" ")[index]);
*/

/*
### Задача 4

        Определить, является ли срока полиндромом.
        Палиндром — это число, буквосочетание, слово или текст, которые одинаково
        читаются по буквам или по словам как слева направо, так и справа налево.
        Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
   */

/*
        String pol1 = "LIVE not on evil";
        String pol2 = pol1.replaceAll(" ", "");
        StringBuilder sb2 = new StringBuilder(pol2);
        String pol3 = sb2.reverse().toString();
        System.out.println(pol2.compareToIgnoreCase(pol3));
*/
    }
}