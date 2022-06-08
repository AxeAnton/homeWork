package ru.itmo.hw.test1;

import java.util.Properties;

public class Test1App {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("one", "1");
        System.out.println(properties.get("one"));



    }

}
