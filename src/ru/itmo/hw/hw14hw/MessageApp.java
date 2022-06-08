package ru.itmo.hw.hw14hw;

import java.util.List;

public class MessageApp {
    public static void main(String[] args) {

        List<Message> list1 = MessageGenerator.generate(15);
        System.out.println(list1);
        MessageTask.countEachPriority(list1);








    }
}
