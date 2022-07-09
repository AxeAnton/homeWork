package hw13;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {

/*
        ### Задача на for
        Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
*/

/*
        for (int count = 1, num = 1; count <= 55; num += 2, count++) {
            System.out.println(num);
        }
*/

/*
        ### Задача на while
        Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр
*/

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter integer positive figure");
        int positFigure = scanner.nextInt();
        int sum = 0;
        while (positFigure > 0){
            int count = positFigure % 10;
            sum += count;
            positFigure /= 10;
         }
        System.out.println(sum);
*/

/*
        ### Задача на цикл
        1. Программа загадывает число в диапазоне [1;9] - рандом
        2. Пользователь вводит число с клавиатуры
        3. Программа в зависимости от введенного числа выводит в консоль следующее:
        1) "загаданное число больше"
        2) "загаданное число меньше"
        3) "Вы угадали" (программа завершает работу)
        4. Если введен 0, выввести "выход из программы" (программа завершает работу)
*/

/*

        int num1 = (int) (1 + (Math.random() * 399));
       //  System.out.println(num1);
        Scanner scanner = new Scanner(System.in);

        int num2;
           do {
            System.out.println("enter integer figure from 1 to 400 or 0 for fines"); // введите целое число
            num2 = scanner.nextInt();
           // int check = num2 % 1;
            if (num2 < 0 || num2 > 400 ) {System.out.println("enter the right figure"); continue;}
           // else if ( check != 0 ) {System.out.println("enter the right figure"); continue;}
            else if (num2 == 0) { System.out.println("program exit"); break;}
            else if (num2 < num1) { System.out.println("figure bigger");} // цифра больше
            else if (num2 > num1) {System.out.println("figure smaller");} // цифра меньше
            else if (num1 == num2) { System.out.println("you are winner!"); break;}
        }
        while (num1 != num2);

*/


/*
        ### Задача на цикл
        1. Пользователь загадывает число в диапазоне от [2 до 100]
        2. Программа пытается его угадать (используйте метод бинарного поиска - деление отрезка на 2). -
        3. Программа может задавать пользователю вопросы: Число равно ...? / Число больше ...? / Число меньше ...?
        и в зависимоти от ответа пользователя принимать решения.
        4. Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
*/
        int a = 2;
        int b = 100;
        int figure;
        System.out.println("make a number from 2 to 100");
        Scanner scanner1 = new Scanner(System.in);

        while (true) {
            int result1 = b - a;
            int result2 = result1 / 2;
            int result3 = result2 + a;

            System.out.println("Are your figure " + result3 + " ?\nEnter 1 - if YES or 0 - if NOT");
            figure = scanner1.nextInt();
            if (figure != 0 && figure != 1) {
                System.out.println("Error! Enter 1 - if YES or 0 - if NOT++");
            } else if (figure == 1) {
                System.out.println("you are winner!");
                break;
            } else if (figure == 0) {
                System.out.println("Are your figure is bigger " + result3 + " ?\nEnter 1 - if YES or 0 - if NOT");
                int figure1 = scanner1.nextInt();
                if (figure1 != 0 && figure1 != 1) {
                    System.out.println("Error! Enter 1 - if YES or 0 - if NOT");
                } else if (figure1 == 1) {
                    a = result3;
                } else if (figure1 == 0) {
                    b = result3;

                }
            }
        }
    }
}