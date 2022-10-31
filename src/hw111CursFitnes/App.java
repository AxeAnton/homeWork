package hw111CursFitnes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Participants participants1 = new Participants("Anton", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants2 = new Participants("Anton", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants3 = new Participants("Ivan", "Ykovenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);

        Participants participants4 = new Participants("Pety", "Anisimov", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.GROUPlESSONS);
        Participants participants5 = new Participants("Pety1", "Anisimov", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GROUPlESSONS);


        Fitnes.addActivity(participants1);
        Fitnes.addActivity(participants2);
        Fitnes.addActivity(participants3);
        Fitnes.addActivity(participants4);
        Fitnes.addActivity(participants5);

        Participants participants6 = new Participants("Anton6", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants7 = new Participants("Anton7", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants8 = new Participants("Anton8", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants9 = new Participants("Anton9", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants10 = new Participants("Anton10", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants11 = new Participants("Anton11", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants12 = new Participants("Anton12", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants13 = new Participants("Anton13", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants14 = new Participants("Anton14", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);
        Participants participants15 = new Participants("Anton15", "Klimenko", LocalDate.of(1978, 10, 9), Zone.ONEDAY, WishZone.GYM);

        Fitnes.addActivity(participants6);
        Fitnes.addActivity(participants7);
        Fitnes.addActivity(participants8);
        Fitnes.addActivity(participants9);
        Fitnes.addActivity(participants10);
        Fitnes.addActivity(participants11);
        Fitnes.addActivity(participants12);
        Fitnes.addActivity(participants13);
        Fitnes.addActivity(participants14);

        // System.out.println(LocalDateTime.from(LocalTime.now(ZoneId.from(LocalTime.now()))));

        Participants participants16 = new Participants("Anna16", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);
        Participants participants17 = new Participants("Anna17", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);
        Participants participants18 = new Participants("Anna18", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);
        Participants participants19 = new Participants("Anna19", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);
        Participants participants20 = new Participants("Anna20", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);
        Participants participants21 = new Participants("Anna21", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);
        Participants participants22 = new Participants("Anna22", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);
        Participants participants23 = new Participants("Anna23", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);
        Participants participants24 = new Participants("Anna24", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);
        Participants participants25 = new Participants("Anna25", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);
        Participants participants26 = new Participants("Anna26", "Makarova", LocalDate.of(1978, 10, 9), Zone.FULL, WishZone.SWIMMING);


        Fitnes.addActivity(participants16);
        Fitnes.addActivity(participants17);
        Fitnes.addActivity(participants18);
        Fitnes.addActivity(participants19);
        Fitnes.addActivity(participants20);
        Fitnes.addActivity(participants21);
        Fitnes.addActivity(participants22);
        Fitnes.addActivity(participants23);
        Fitnes.addActivity(participants24);
        Fitnes.addActivity(participants25);
        Fitnes.addActivity(participants26);


        Fitnes.closdFitness();
        System.out.println(" Array Gym - " + Arrays.toString(Fitnes.gym) + "\n Array Grouplessons - " + Arrays.toString(Fitnes.groupLessons)+ "\n Array Swimming - " + Arrays.toString(Fitnes.swimming));

    }
}
