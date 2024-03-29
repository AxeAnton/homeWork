package hw17StAPI;


import java.util.*;
import java.util.stream.Collectors;

public class TopTenWords {
    public static void main(String[] args) {

        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout the point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        // TODO:  Используя  Stream API: создать Map<String, Long>, где
        //  - String - слово
        //  - Long - частота встречаемости
        //  в маппу должны войти только первые 10 по частоте встречаемости слов


        Map<Object, Long> tenTopWords = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(tenTopWords);

    }
}