package hw5;

import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {

        String word1 = "Hello";
        String word2 = word1.toLowerCase();
        String word3 = word2.replaceFirst("h", "H");
        System.out.println(word3);

    }
}
