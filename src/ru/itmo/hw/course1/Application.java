package ru.itmo.hw.course1;

import java.time.LocalDate;
import java.util.concurrent.Flow;

public class Application {
    public static void main(String[] args) {



        Members members1 = new Members("Anton", "Klimenko", LocalDate.of(1978,10,9));
        members1.setBirthYear(LocalDate.of(1978,11,9));
//        members1.getFromValidTime(Type.DAILY);


    }
}
