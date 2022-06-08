package ru.itmo.hw.hw14hw;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль

        int countHigh = 0;
        int countUrgent = 0;
        int countMedium = 0;
        int countLow = 0;
        for (Message message: messageList) {
            if (message.getPriority().equals(MessagePriority.URGENT))
                countUrgent +=1;
            if (message.getPriority().equals(MessagePriority.HIGH))
                countHigh +=1;
            if (message.getPriority().equals(MessagePriority.MEDIUM))
                countMedium +=1;
            if (message.getPriority().equals(MessagePriority.LOW))
                countLow +=1;
        }

        System.out.println("количество сообщений: " + countUrgent + "важность High: "
                + countHigh + "важность Medium: " + countMedium + "важность Low: " + countLow);

    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return null;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
    }




    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
    }

}
