package hw3;
import java.util.Scanner; //
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int userNum = scanner.nextInt();
        int s = 0;

        if (userNum >0) {
            while (userNum != 0){
                s += userNum % 10;
                userNum /= 10;
            }
            System.out.println( s );
        } else {
            System.out.println("Ошибка, запустите программу еще раз и введите ПОЛОЖИТЕЛЬНОЕ цисло");
        }
    }
}
