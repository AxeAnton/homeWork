package ru.itmo.hw.test1;

public class Test2App {
    public static void main(String[] args) {

        // FIXME Метод charAt(int index)
        // Возвращает тот char (букву), индекс которого запросишь.
        String str1 = "Hello ward";
        System.out.println(str1.charAt(3)); //res - (l)


        // FIXME Метод compareTo(String anotherString) - сравнение строк, res 0 / - /+
        String str2 = "HiDen00000j0";
        String str3 = "Hello ward";
        String str4 = "Hello ward";
        System.out.println(str2.compareTo(str3)); //res - (4) если 1я строка следует (не понятное выражение но с char завсегда так) за 2-й.
        System.out.println(str3.compareTo(str4)); //res - (0) если равны
        System.out.println(str3.compareTo(str2)); //res - (-4) если 2я строка следует (не понятное выражение но с char завсегда так) за 1-й.

        // FIXME Метод compareToIgnoreCase(String str) - ИГНОРИРОВАНИЕ заглавных и строчных букв, res 0 / - /+
        String str5 = "Hello ward";
        String str6 = "Hello ward";
        String str7 = "hello ward";
        System.out.println(str5.compareToIgnoreCase(str6)); //res - (0) если равны ИГНОРИРОВАНИЕ заглавных и строчных букв
        System.out.println(str6.compareTo(str7)); //res - (-32) если 2я строка следует (не понятное выражение но с char завсегда так) за 1-й.
        System.out.println(str7.compareTo(str6)); //res - (32) если 1я строка следует (не понятное выражение но с char завсегда так) за 2-й.

        //FIXME Метод indexOf(int ch)
        // возвращает индекс искомой буквы.
        String str8 = "Hello ward";
        int int1 = 1978;
        System.out.println(str8.indexOf('w')); // аргументе, только одна буква((, res - (6), если не найдет то (-1)

        //FIXME Метод isBlank()
        // isBlank - возвращает true только если в строке есть только пробел(-ы) (и нет других символов) или строка пустая ("").
        String str9 = "";
        String str10 = " ";
        String str11 = null;
        System.out.println(str9.isBlank()); // res - true
        System.out.println(str10.isBlank()); // res - true
        // System.out.println(str11.isBlank()); // NullPointerException

        //FIXME Метод isEmpty()
        // isEmpty - возвращает true только если строка абсолютно пустая ("")
        String str12 = "";
        String str13 = " ";
        String str14 = null;
        System.out.println(str12.isEmpty()); // res - true
        System.out.println(str13.isEmpty()); // res - false
        // System.out.println(str14.isEmpty()); // NullPointerException

        //FIXME Метод repeat(int count)
        // повторяет значение строчки указанное количество раз.
        String str15 = "hello boy, ";
        String str16 = "";
        System.out.println(str15.repeat(5)); // res - hello boy, hello boy, hello boy, hello boy, hello boy
        System.out.println(str16.repeat(5)); // res - пусто и так же будет если в аргументе (0)

        //FIXME Метод substring(int beginIndex)



    }
}
