package hw2;

public class IfSwitch {
    public static void main(String[] args) {

/*
        ### Задача на  if

        Дана целочисленная переменная count - количество верных ответов.
        В зависимости от значения этой переменной вывести в консоль оценку:
        100 - 90 правильных ответов - отлично
        89 - 60 правильных ответов - хорошо
        59 - 40 правильных ответов - удовлетворительно
        39 - 0 правильных ответов - попробуйте в следующий раз
*/

        int count = 5;
        if (count >= 0 && count <= 39) {
            System.out.println("try letter");
        } else if (count >= 40 && count <= 59) {
            System.out.println("score three");
        } else if (count >= 60 && count <= 89) {
            System.out.println("score four");
        } else if (count >= 90 && count <= 100) {
            System.out.println("score is five");
        } else {
            System.out.println("error");
        }

/*
        ### Задача на switch

        Пользователь вводит 3 числа:
        1. первый операнд
        2. второй операнд
        3. оператор

        В зависимости от третьего введенного числа нужно вывести в консоль:
        сумму, разность, умножение, деления чисел, которые ввел пользователь.

        Если третье введенное число:
        * 3, нужно найти сумму,
        * 5 - разность,
        * 7 - результат умножения,
        * 9 - результат деления.
*/
        double a = 5;
        double b = 3;
        int c = 9;
        switch (c) {
            case 3:
                System.out.println(a + b);
                break;
            case 5:
                System.out.println(a - b);
                break;
            case 7:
                System.out.println(a * b);
                break;
            case 9:
                System.out.println(a / b);
                break;
            default:
                System.out.println("error");

        }

/*
        ### Задача на Math.random() и if

        Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500]
        в интервал (25;200) и выводить результат в консоль.

        Примеры работы программы:
        1. Число 345 не содержится в интервале (25;200)
        2. Число 110 содержится в интервале (25;200)
*/
        int num1 = 10;
        int num2 = 500;
        int num3 = (int) (num1 + (Math.random() * (num2 - num1)));
        System.out.println(num3);

        if (num3 < 25) {
            System.out.println("number " + num3 + " out of interval from 25 to 200");
        } else if (num3 > 25 && num3 < 200) {
            System.out.println("number " + num3 + " in the interval from 25 to 200");
        } else if (num3 < 500) {
            System.out.println("number " + num3 + " out of interval from 25 to 200");
        }

/*
        ### Задача на if

        Даны переменные age и exp.
        Если значение переменной age больше 100, вывести в консоль "Мы Вам перезвоним".
        В противном случае перейти к проверке exp.
        Если значение exp меньше 5, вывести в консоль "Вы подходите на должность стажера".
        Если значение exp больше или равно 5, вывести в консоль "Вы подходите на должность разработчика".
*/

        int age1 = 67;
        int exp1 = 5;

        if (age1 > 100) {
            System.out.println("We will call you");
        } else if (exp1 < 5) {
            System.out.println("You are is suit for internship");
        } else if (exp1 >= 5) {
            System.out.println("You are is suit for developers");
        }


/*
        ### Задача по решению на уроке

                Сократить условия в блоках if;

                int month = 5;

                if (month > 0 && month < 3 || month == 12) {
                    System.out.println("Зима");
                } else if (month > 2 && month < 6) {
                    System.out.println("Весна");
                } else if (month > 5 && month < 9){
                    System.out.println("Лето");
                } else if (month > 8 && month < 11) {
                    System.out.println("Осень");
                } else {
                    System.out.println("Ошибка");
*/
        int month = 25;
        if (month == 12 || month <= 2) {
            System.out.println("winter");
        } else if (month <= 5) {
            System.out.println("spring");
        } else if (month <= 8) {
            System.out.println("summer");
        } else if (month <= 11) {
            System.out.println("autumn");
        } else {
            System.out.println("error");
        }

        }
    }

