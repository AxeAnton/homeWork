package hw115Mup;


import java.util.*;

public class MapTask {


    public static void task3(HashMap<String, Customer> customerMap) {
        HashMap<String, Customer> customerMapSeparat = new HashMap<>();

        for (Map.Entry<String, Customer> parCustomerMap : customerMap.entrySet()) {
            if (parCustomerMap.getValue().getAge() >= 20 && parCustomerMap.getValue().getAge() < 50) {
                customerMapSeparat.put(parCustomerMap.getKey(), parCustomerMap.getValue());
            }
        }
        System.out.println(customerMapSeparat);
    }

    public static void task2(List<String> words) {
        Integer x = 0;
        Map<String, Integer> qontaryWordsHashMap = new HashMap<>();

        HashSet<String> unicWardsHashSet = new HashSet<>(words);
        // Iterator<String> iterator = unicWardsHashSet.listIterator();
        for (String resUnic : unicWardsHashSet) {
            for (String res : words) {
                if (resUnic.equals(res)) {
                    x++;
                }
                qontaryWordsHashMap.put(resUnic, x);
            }
            x = 0;
        }
        System.out.println(qontaryWordsHashMap);
    }


    public static void task1(HashMap<String, String> firstTaskMap, String city) {
        List<String> logins = new ArrayList<>();
        for (Map.Entry<String, String> pars : firstTaskMap.entrySet()) {
            if (pars.getValue().equals(city)) {
                logins.add(pars.getKey());
            }
        }
        System.out.println(logins);
    }


    public static void main(String[] args) {
        // TODO:: написать статический метод, который принимает на вход мапу (firstTaskMap) и город (city)
        //  и формирует список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Tver");
        firstTaskMap.put("asd", "Tver");
        firstTaskMap.put("zxc", "Moscow");
        firstTaskMap.put("rty", "Tver");
        firstTaskMap.put("fgh", "Magadan");

        String city = "Tver";

        task1(firstTaskMap, city);


        // TODO:: дан список слов (words).
        //  Написать метод, который будет возвращать количество
        //  одинаковых слов с списке
        //  в виде Map<String, Integer>,
        //  где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        task2(words);

        // TODO:: дана мапа (customerMap).
        //  Написать метод, который принимает на вход агрументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели,
        //  возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Pavel", "1", 23));
        customerMap.put("2", new Customer("Oleg", "2", 17));
        customerMap.put("3", new Customer("Max", "3", 48));
        customerMap.put("4", new Customer("Geny", "4", 67));

        task3(customerMap);

        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод:
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  3. написать метод, который выводит в консоль топ 10 самых частых слов

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        String ward1 = "is";

        //task4one(text, ward1);
        // task4two(text);
        task4free(text);
    }


    public static void task4two(String text) {
        String[] arrText = text.toLowerCase().split(" "); // массив слов (текста)
        System.out.println(Arrays.toString(arrText));

        HashSet<Integer> unicNumbers = new HashSet<>(); // Коллекция уникальных номеров (количество букв)
        for (String wardFromArrText : arrText) {
            unicNumbers.add((int) wardFromArrText.codePoints().count());
        }
        System.out.println(unicNumbers);

        LinkedHashMap<Integer, ArrayList<String>> unicNumberLinkedHashMap = new LinkedHashMap<>(); // Мапа с уникальными номерами
        for (Integer unicNumber : unicNumbers) {
            unicNumberLinkedHashMap.put(unicNumber, new ArrayList<>());
        }
        System.out.println(unicNumberLinkedHashMap);

        for (Integer unicNumber : unicNumbers) {
            ArrayList<String> wordFromText = new ArrayList<>();
            for (String wardFromArrText : arrText) {
                int num = (int) wardFromArrText.codePoints().count();
                Integer num2 = num;
                if (unicNumber == num) {
                    wordFromText.add(wardFromArrText);
                    unicNumberLinkedHashMap.replace(num2, wordFromText);
                }
            }
        }
        System.out.println(unicNumberLinkedHashMap);
    }

// {1=[a, a, a, a, a],
// 2=[it, is, be, by, of, at, of, is, it, of, to, it, as, in, by, on],
// 3=[the, its, the, has, and, web, now, use, and, for, web, the, and, the],
// 4=[long, fact, that, will, page, when, that, here, here, look, like, many, page, text, will, many, have, over, like],
// 5=[point, using, lorem, ipsum, sites, still, using, lorem, ipsum, their, model, lorem, ipsum, sites, still, their, years],
// 6=[reader, layout, normal, humour, making, search, humour],
// 7=[uncover, uncover, content, looking, uncover, uncover, opposed, content, uncover, content, english, desktop, editors, default, uncover, uncover, infancy, various, uncover, evolved, uncover, purpose],
// 8=[readable, readable, packages, versions, accident, injected],
// 9=[lettersas, sometimes, sometimes],
// 10=[distracted, publishing],
// 11=[established],
// 12=[more-or-less, distribution]}


    public static void task4free(String text) {
        String[] arrText = text.toLowerCase().split(" "); // массив слов (текста)
        System.out.println(Arrays.toString(arrText) + "\n");

        HashSet<String> unicWords = new HashSet<>(); // Коллекция уникальных слов
        for (String wardFromArrText : arrText) {
            unicWords.add(wardFromArrText);
        }
        System.out.println(unicWords + "\n");

        LinkedHashMap<String, Integer> unicNumberLinkedHashMap1 = new LinkedHashMap<>(); // Мапа c уник.словами и количеством их повторений
        for (String unicWord : unicWords) {
            Integer count = 0;
            for (String arrTextWord : arrText) {
                if (unicWord.equals(arrTextWord)) {
                    count++;
                }
                unicNumberLinkedHashMap1.put(unicWord, count);
            }
        }
        System.out.println(unicNumberLinkedHashMap1 + "\n");

        ArrayList<Map.Entry<String, Integer>> unicNumberArrayList = new ArrayList<>(); // переложили мапу в коллекцию
        for (Map.Entry<String, Integer> pare : unicNumberLinkedHashMap1.entrySet()) {
            unicNumberArrayList.add(pare);
        }
        System.out.println(unicNumberArrayList + "\n");

        unicNumberArrayList.sort(new ValueComparator()); // отсортировали используя компаратор
        System.out.println(unicNumberArrayList + "\n");

        for (int i = 0; i < 10; i++) { // берем первые 10
            System.out.println(unicNumberArrayList.get(i));
        }
    }


    public static class ValueComparator implements Comparator<Map.Entry<String, Integer>> {
        // создали компаратор
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return Integer.compare(o2.getValue(), o1.getValue())   /*o2.getValue() - o1.getValue()*/;
        }
    }
}


/*
        // Это нашел в инте))
        unicNumberLinkedHashMap1.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
*/