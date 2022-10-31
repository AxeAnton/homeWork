package hwFrom10.hw14Comparator;


import java.util.*;


public abstract class MessageTask {


    public static void countEachPriority(List<Message> messageList) {
        // Подсчитать количество сообщений для каждого приоритета
        //ответ в консоль
        int countHigh = 0;
        int countMedium = 0;
        int countLow = 0;
        int countUrgent = 0;

        for (Message valueTypePrioryty : messageList) {
            if ((valueTypePrioryty.getPriority().compareTo(MessagePriority.HIGH)) == 0) {
                countHigh += 1;
            } else if ((valueTypePrioryty.getPriority().compareTo(MessagePriority.MEDIUM)) == 0) {
                countMedium += 1;
            } else if ((valueTypePrioryty.getPriority().compareTo(MessagePriority.LOW)) == 0) {
                countLow += 1;
            } else if ((valueTypePrioryty.getPriority().compareTo(MessagePriority.URGENT)) == 0) {
                countUrgent += 1;
            } else {
                System.out.println("Error");
            }
        }
        System.out.println
                ("High -" + countHigh + ", Medium - " + countMedium + ", Low - " + countLow + ", Urgent - " + countUrgent + ", Count - " + messageList.size());
    }

    public static void countEachCode2(List<Message> messageList) {
        //Подсчитать количество сообщений для каждого кода сообщения
        //Set хранит уникальные значения
        HashSet<Integer> codes = new HashSet<>();
        //для Integer сразу получим упорядоченный по возрастанию
        for (Message message : messageList) {
            codes.add(message.getCode());
        }
        System.out.println(codes); // [0, 1, 2, 3, 4, 6, 7, 8, 9]

        ArrayList<Integer> codesList = new ArrayList<>(codes); // [0, 1, 2, 3, 4, 6, 7, 8, 9]
        int[] counts = new int[codesList.size()];// [null, null, null, null, null, null, null, null, null]
        for (Message message : messageList) { // наш список
            counts[codesList.indexOf(message.getCode())]++; // регинальное решение в массив counts, добавляем единицу на тот индекс который был найден indexOf в getCode коллекции messageList.
        }

        for (int i = 0; i < codesList.size(); i++) {
            System.out.println("for code " + codesList.get(i) + " count of messages = " + counts[i]);
        }

    }

    public static void countEachCode1(List<Message> messageList) {
        //Подсчитать количество сообщений для каждого кода сообщения
        //ответ в консоль

        HashSet<Integer> codes = new HashSet<>(); //уникальные кода
        for (Message codeValue : messageList) {
            codes.add(codeValue.getCode());
        }
        Integer[] codesArray = codes.toArray(new Integer[codes.size()]);
        System.out.println(Arrays.toString(codesArray));

        int count = 0;
        for (int i = 0; i < codesArray.length; i++) {
            for (int j = 0; j < messageList.size(); j++) {
                if (codesArray[i] == messageList.get(j).getCode()) {
                    count++;
                }
            }
            System.out.println("Quantity coded " + codesArray[i] + " = " + count);
            count = 0;
        }
    }


    public static void countEachCode3(List<Message> messageList) { // FIXME Перебор кодового замка
        //Подсчитать количество сообщений для каждого кода сообщения
        //ответ в консоль

        System.out.println();

        HashSet<Integer> codes = new HashSet<>(); /// уникальные коды
        for (Message codeValue : messageList) {
            codes.add(codeValue.getCode());
        }

        int count = 0;
        for (Integer velueFromHashSet : codes) {
            for (int j = 0; j < messageList.size(); j++) {
                if (velueFromHashSet == messageList.get(j).getCode()) {
                    count++;
                }
            }
            System.out.println("Quantity Messages with code " + velueFromHashSet + " = " + count);
            count = 0;
        }
    }


    public static void uniqueMessageCount1(List<Message> messageList) { // мое решение
        // Подсчитать количество уникальных сообщений ( уникальные сообщения это те у которых и code и priority совпадают!)
        //ответ в консоль
        System.out.println();

        HashSet<Message> codes = new HashSet<>();
        for (Message codeValue : messageList) {
            codes.add(codeValue);

        }

        System.out.println("Quantity Messages with unique code = " + codes.size());

    }

    public static void uniqueMessageCount2(List<Message> messageList) {
        // Подсчитать количество уникальных сообщений
        HashSet<Message> unique = new HashSet<>();
        int count = 0;
        for (Message message : messageList) {
            if (unique.add(message)) {
                count++;
            }
        }
        System.out.println("Unique messages = " + count);

    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        // например было [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        // на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        System.out.println();

/*      // не лучший вариант
        LinkedHashSet<Message> codes = new LinkedHashSet<>();
        for (Message codeValue : messageList) {
            codes.add(codeValue);
        }
*/
        LinkedHashSet<Message> codes = new LinkedHashSet<>(messageList);

        System.out.println(codes);
        System.out.println("\nQuantity unique Messages in Original Order = " + codes.size());

        return null;
    }


    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // удалить из коллекции каждое сообщение с заданным приоритетом
        // вывод в консоль до удаления и после удаления

        Iterator<Message> iterator1 = messageList.listIterator();
        while (iterator1.hasNext()) { // пок есть что перебирать
            if (iterator1.next().getPriority().equals(priority)) {
                iterator1.remove();
            }
        } System.out.println(messageList);
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления

        System.out.println();

        Iterator<Message> iterator2 = messageList.listIterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().getPriority().equals(priority)) {
                iterator2.remove();
            }
        } System.out.println(messageList);
    }


}
