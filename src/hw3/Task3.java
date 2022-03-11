package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double randomValue = Math.random();
        double y = 1 + randomValue * 8;
        int x = (int) y / 1;
        System.out.println(x);

        Scanner scanner = new Scanner(System.in);

        boolean res = true;

        while (res) {
            System.out.println("Введите целое положительное число от 1 до 9");
            int userNum = scanner.nextInt();
//            double z = userNum % 1;

            if ( userNum == 0) {
                break;
//            } else if ( z < 1) {
//                res = true;
            }else if (userNum < 1 || userNum > 9) {
                res = true;
            } else if ( x < userNum) {
                System.out.println("загаданное число меньше");
            } else if (x > userNum){
                System.out.println("загаданное число больше");
            } else if (x == userNum){
                System.out.println("Вы угадали");
                break;
            }
        }
    }
}
