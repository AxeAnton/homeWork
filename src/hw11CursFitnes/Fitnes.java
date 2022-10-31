package hw11CursFitnes;

import ru.itmo.hw.course1v2.Member;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class Fitnes {

    static Participants[] gym = new Participants[10];
    static Participants[] swimming = new Participants[10];
    static Participants[] groupLessons = new Participants[10];


    public static void addActivity(Participants participant) {
        if (LocalDate.now().isBefore(participant.getZone().getDataRegFinish())) {
            System.out.println(participant.getName() + " " + participant.getSecondName() + " - Day is ok");
            if (participant.getZone().getVisitTimeFrom().isBefore(LocalTime.now())
                    && participant.getZone().getVisitTimeTo().isAfter(LocalTime.now())) {
                System.out.println(participant.getName() + " " + participant.getSecondName() + " - Time is ok");
                for (String zone : participant.getZone().getZons()) {
                    if (zone.equals(participant.getTypeZone().getName()) && zone.equals("Gym")) {
                        System.out.println(participant.getName() + " " + participant.getSecondName() + " - Zon Gym is ok");
                        for (Participants gymName : gym) {
                            if (gymName != null && gymName.getName().equals(participant.getName()) && gymName.getSecondName().equals(participant.getSecondName())) {
                                System.out.println(participant.getName() + " " + participant.getSecondName() + " - Participant already in gym\n");
                                //System.out.println(Arrays.toString(gym));
                                return;
                            } else {
                                for (int i = 0; i < gym.length; i++) {
                                    if (gym[i] == null) {
                                        gym[i] = participant;
                                        System.out.println(participant.getName() + " " + participant.getSecondName() + " is to zon Gym at " + LocalDateTime.now() + " " + Arrays.toString(gym) + "\n");
                                        return;
                                    }
                                }

                            }
                        }
                        System.out.println(participant.getName() + " " + participant.getSecondName() + " - not vacant please in Gym\n");
                        return;


                    } else if (zone.equals(participant.getTypeZone().getName()) && zone.equals("GroupLessons")) {
                        System.out.println(participant.getName() + " " + participant.getSecondName() + " - Zon GroupLessons is ok");
                        for (Participants gymName : groupLessons) {
                            if (gymName != null && gymName.getName().equals(participant.getName()) && gymName.getSecondName().equals(participant.getSecondName())) {
                                System.out.println(participant.getName() + " " + participant.getSecondName() + " - Participant already in GroupLessons\n");
                                return;
                            } else {
                                for (int i = 0; i < groupLessons.length; i++) {
                                    if (groupLessons[i] == null) {
                                        groupLessons[i] = participant;
                                        System.out.println(participant.getName() + " " + participant.getSecondName() + " is to zon GroupLessons at " + LocalDateTime.now() + " " + Arrays.toString(groupLessons) + "\n");
                                        return;
                                    }
                                }
                            }
                        }
                        System.out.println(participant.getName() + " " + participant.getSecondName() + " - not vacant please in GroupLessons\n");
                        return;


                    } else if (zone.equals(participant.getTypeZone().getName()) && zone.equals("Swimming")) {
                        System.out.println(participant.getName() + " " + participant.getSecondName() + " - Zon Swimming is ok");
                        for (Participants gymName : swimming) {
                            if (gymName != null && gymName.getName().equals(participant.getName()) && gymName.getSecondName().equals(participant.getSecondName())) {
                                System.out.println(participant.getName() + " " + participant.getSecondName() + " - Participant already in Swimming\n");
                                return;
                            } else {
                                for (int i = 0; i < swimming.length; i++) {
                                    if (swimming[i] == null) {
                                        swimming[i] = participant;
                                        System.out.println(participant.getName() + " " + participant.getSecondName() + " is add to zon Swimming at " + LocalDateTime.now() + " " + Arrays.toString(swimming) + "\n");
                                        return;
                                    }
                                }

                            }
                        } System.out.println(participant.getName() + " " + participant.getSecondName() + " - not vacant please in Swimming\n");
                        return;

                    } else {

                    }
                }
                System.out.println(participant.getName() + " " + participant.getSecondName() + " Zon isn't ok\n");
            } else {
                System.out.println("Time isn't  ok");
            }
        } else {
            System.out.println("Day isn't ok");
        }
    }

    public static void closdFitness ( ) {
        for (int i = 0; i < 10; i++) {
            gym[i] = null;
            swimming[i] = null;
            groupLessons[i] = null;
        }
    }


}
