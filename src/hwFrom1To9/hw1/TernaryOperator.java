package hwFrom1To9.hw1;

public class TernaryOperator {

    public static void main(String[] args) {

        // 1 . Задача на тернарный оператор: Дана переменная sum - сумма покупки. Если сумма покупки больше 100 000, то вывести в консоль сумму к оплате с учетом скидки в 10%, в противном случае вывести в консоль сумму к оплате без скидки.

        int sum1 = 110_000;
        double res = sum1 > 100_000 ? sum1 * 0.9 : sum1;
        System.out.println("final price " + res);

        // 2. Задача на арифметические операторы! Найти сумму цифр 2х значного числа 45 и 11.
        int figure = 11;
        int firfstFigure = figure / 10;
        int secondFigure = figure % 10;
        int sum2 = firfstFigure + secondFigure;
        System.out.println(firfstFigure);
        System.out.println(secondFigure);
        System.out.println(sum2);

        //3. Объяснить причину ошибок
        float a = 45.6f; // f на конце поставить
        long b = 60000;
        float c = a / b; // поменять long на float

        int x = 34;
        long y = 78;
        double z = x / y; // int - заменить на double

        double n = 90.8;
        double m = -100.1;
        double max = n > m ? n : m; // int заменить на douuble

        byte code = 1;
        byte isActive = code; // boolean не конвертируемый ТД, должен быть заменен на byte


    }
}
