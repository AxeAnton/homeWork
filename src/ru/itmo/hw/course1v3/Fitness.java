package ru.itmo.hw.course1v3;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;

public class Fitness {

    LocalTime localTime = LocalTime.now();
    String timeStamp = new SimpleDateFormat("yyyy-MM-dd: HH:mm").format(Calendar.getInstance().getTime());
    LocalTime timeForClouse = LocalTime.of(22, 00);
    LocalTime timeForOpen = LocalTime.of(8, 00);


    Abonement[] swimingpool = new Abonement[20];
    Abonement[] gym = new Abonement[20];
    Abonement[] groupsLessons = new Abonement[20];



  /*  public void addToSwimingPoolArray(Abonement abonement) {
        for (int i = 0; i < swimingpool.length; i++) {
            if (swimingpool[i] == null) {
                swimingpool[i] = abonement;
                System.out.println(abonement.getOwner() + " добавлен в бассейн. Дата" +
                        "и время посещения " + timeStamp);
                return;
            }
        }
        System.out.println("Бассейн перепеолнен");
    }

    public void addToGymArray(Abonement abonement) {
        for (int i = 0; i < gym.length; i++) {
            if (gym[i] == null) {
                gym[i] = abonement;
                System.out.println(abonement.getOwner() + " добавлен в зону спорт зал. Дата" +
                        "и время посещения " + timeStamp);
                return;
            }
        }
        System.out.println("В зале больше нет мест");
    }

    public void addToGroupLessons(Abonement abonement) {
        for (int i = 0; i < groupsLessons.length; i++) {
            if (groupsLessons[i] == null) {
                groupsLessons[i] = abonement;
                System.out.println(abonement.getOwner() + " добавлен в зону Групповых тренеровок. Дата" +
                        "и время посещения " + timeStamp);
                return;
            }
        }
        System.out.println("В зале групповых тренировок" +
                " больше нет мест");
    }
*/
    public void addToZone (Abonement abonement, Zone zone, Abonement[] abonements) {

        for (int i = 0; i < abonements.length; i++) {
            if (abonements[i] == null) {
                abonements[i] = abonement;
                System.out.println(abonement.getOwner() + "add to zone " + zone + ". Date " + "and time of visit" + timeStamp);
                return;
            }
        }
        System.out.println("The " + zone + " is busy ");

    }

    public boolean isOpenGym(LocalTime timeForClouse) {
        if (localTime.isAfter(timeForClouse) || localTime.isBefore(timeForOpen)) {
            for (int i = 0; i < 20; i++) {
                swimingpool[i] = null;
                gym[i] = null;
                groupsLessons[i] = null;
            }
            System.out.println("Fitness is closed. Working time from 8:00 to 22:00");
            return false;
        }
        return true;
    }


    public boolean checkExpDate(Abonement abonement) {
        if (abonement.getExpireDate().isAfter(abonement.getFirstRegistrationDate())) {
            System.out.println("Abonnement expired");
        }
        return false;
    }

    public boolean checkAvalibleZoneForAbonement(Abonement abonement, Zone zone) {
        for (Zone zone1 : abonement.getZone()) {
            if (zone1 == zone) return true;
        }
        System.out.println("Dear " + abonement.getOwner().getName() + " this " +
                " zone is no available for you");
        return false;
    }


    public boolean checkZoneForAddToArray(Abonement abonement, Zone zone) {

        if (zone.ordinal() == 0) {
           // addToGymArray(abonement);
            addToZone(abonement, zone, gym);
            return true;
        }
        if (zone.ordinal() == 1) {
            addToZone(abonement, zone, swimingpool);
            // addToSwimingPoolArray(abonement);
            return true;
        }
        if (zone.ordinal() == 2) {
            addToZone(abonement, zone, groupsLessons);
            // addToGroupLessons(abonement);
            return true;
        }
        return false;
    }


    public void visitToFitnes(Abonement abonement, Zone zone) {
        if (checkExpDate(abonement)) return; //работает
        if (!isOpenGym(timeForClouse)) return;//работает
        if (!checkAvalibleZoneForAbonement(abonement, zone)) return; //работает
        if (checkZoneForAddToArray(abonement, zone)) return;//работает
    }

    public void getInfoByZone(Zone zone) {
        if (zone.equals(Zone.GYM)) {
            for (Abonement gym1 : gym) {
                if (!(gym1 ==null)){
                    System.out.println("Info about owner of gym "+ gym1.getOwner());
                }
            }return;
        }
        if (zone.equals(Zone.SWIMINGPOOL)){
            for (Abonement swimmingpool1 : swimingpool) {
                if (!(swimmingpool1 == null)){
                    System.out.println("Info about owner of swimingpool "+ swimmingpool1.getOwner());
                }
            }return;
        }
        if (zone.equals(Zone.GROUPSLESSONS)){
            for (Abonement groupsLesson1 : groupsLessons) {
                if (!(groupsLesson1 == null)){
                    System.out.println("Info about owner of group lessons "+ groupsLesson1.getOwner());
                }
            }return;
        }
    }


    //тестовый метод (проверка массивов)
    public void getAllDataFromArrays() {
        System.out.println("Array swiming pool: " + Arrays.toString(swimingpool));
        System.out.println("Array gym: " + Arrays.toString(gym));
        System.out.println("Array groups lessons: " + Arrays.toString(groupsLessons));
    }

}





