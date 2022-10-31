package hw17StAPI.pupil;


import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PupilTask {
    public static void main(String[] args) {

        // Используя Stream API:
        List<Pupil> pupils = new ArrayList<>(Arrays.asList(
                new Pupil(1, "Geny", Pupil.Gender.MALE, LocalDate.now().minusYears(10)),
                new Pupil(2, "Oleg", Pupil.Gender.MALE, LocalDate.now().minusYears(7)),
                new Pupil(3, "Alena", Pupil.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Pupil(4, "Ivan", Pupil.Gender.MALE, LocalDate.now().minusYears(12)),
                new Pupil(5, "Alex", Pupil.Gender.MALE, LocalDate.now().minusYears(9)),
                new Pupil(6, "Petr", Pupil.Gender.MALE, LocalDate.now().minusYears(9)),
                new Pupil(7, "Ivan", Pupil.Gender.MALE, LocalDate.now().minusYears(17)),
                new Pupil(8, "Petr", Pupil.Gender.MALE, LocalDate.now().minusYears(5)),
                new Pupil(9, "Alena", Pupil.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Pupil(10, "Alena", Pupil.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Pupil(11, "Gregory", Pupil.Gender.MALE, LocalDate.now().minusYears(7)),
                new Pupil(12, "Irina", Pupil.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        // 1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Pupil.Gender, ArrayList<Pupil>>
        Map<Pupil.Gender, ArrayList<Pupil>> genderMap = pupils.stream().collect(Collectors.groupingBy(Pupil::getGender, Collectors.toCollection(ArrayList::new)));
        System.out.println(genderMap);

        // 2. Найти средний возраст учеников
        double everegAge = pupils.stream()
                .mapToInt(pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear()).average().orElse(0);
        // FIXME Зачем на конце нужен orEls?  Вообщем некоторые методы, типа average() помещают результат своей работы в Opional контейнер и что бы достать оттуда результат необдим метод orElse или более современный get().
        // .collect(Collectors.averagingInt(age -> LocalDate.now().getYear() - age.getBirth().getYear()));
        // FIXME averagingInt - вот такой метод можно еще использовать
        System.out.println(everegAge);


        ArrayList<Integer> ageFromStream = pupils.stream().map(ageFromMup -> LocalDate.now().getYear() - ageFromMup.getBirth().getYear()).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(ageFromStream);

        ArrayList<String> nameFromStream = pupils.stream().map(Pupil::getName).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(nameFromStream);


        // 3. Найти самого младшего ученика

        int minAge1 = pupils.stream()
                .mapToInt(pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear()).min().orElse(0);
        System.out.println(minAge1);

        Pupil minAge2 = pupils.stream().max(Comparator.comparing(Pupil::getBirth)).orElse(null);
        System.out.println(minAge2);


        // 4. Найти самого старшего ученика
        int maxAge1 = pupils.stream()
                .mapToInt(pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear()).max().orElse(0);
        System.out.println(maxAge1);

        Pupil maxAge2 = pupils.stream().min(Comparator.comparing(Pupil::getBirth)).orElse(null);
        System.out.println(maxAge2);

        Pupil maxAge3 = pupils.stream().min(((o1, o2) -> o1.getBirth().compareTo(o2.getBirth()))).orElse(null);
        System.out.println(maxAge3);

        // 5. Собрать учеников в группы по году рождения

        Map<Integer, ArrayList<Pupil>> ageMap = pupils.stream().collect(Collectors.groupingBy((pupil -> pupil.getBirth().getYear()), Collectors.toCollection(ArrayList::new)));
        System.out.println(ageMap);

        // 6. Убрать учеников с одинаковыми именами, имена и дату рождения оставшихся вывести в консоль

        Map<String, Pupil> unicName = pupils.stream().collect(Collectors.toMap(Pupil::getName, Function.identity(), ((pupil, pupil1) -> pupil)));

        //Collection<Pupil> unicName = pupils.stream().collect(Collectors.toMap(Pupil::getName, Function.identity(), ((pupil, pupil1) -> pupil))).values();
        // System.out.println(unicName);

        unicName.values().forEach(pupil -> System.out.println(pupil.getName() + " " + pupil.getBirth()));
        //System.out.println(pu);

        // 7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)
        List<Pupil> sortGenderBerthDayReversName = pupils.stream().sorted(Comparator.comparing(Pupil::getGender).thenComparing(Pupil::getBirth).thenComparing(Pupil::getName).reversed()).collect(Collectors.toList());
        System.out.println(sortGenderBerthDayReversName);

        // 8. Вывести в консоль всех учеников в возрасте от N до M лет

        List<Pupil> ageFromTo = pupils.stream().filter(ageOfPupil -> ((LocalDate.now().getYear() - ageOfPupil.getBirth().getYear()) >= 10) && ((LocalDate.now().getYear() - ageOfPupil.getBirth().getYear()) <= 17)).collect(Collectors.toList());
        System.out.println(ageFromTo);

/*
        pupils.forEach
                (ageOfPupil ->
                        {
                            if (((LocalDate.now().getYear() - ageOfPupil.getBirth().getYear()) >= 10) && ((LocalDate.now().getYear() - ageOfPupil.getBirth().getYear()) <= 17)) {
                                System.out.println(ageOfPupil);
                            }
                        }
                );
*/

        // 9. Собрать в список всех учеников с именем=someName

        String someName = "Alena";

        List<Pupil> separateByName = pupils.stream().filter(namePuple -> namePuple.getName().equals(someName)).toList();
        System.out.println(separateByName);

        // 10. Собрать Map<Pupil.Gender, Integer>, где Pupil.Gender - пол, Integer - суммарный возраст учеников данного пола

        Map<Pupil.Gender, Integer> mapGenderAge = pupils.stream().collect(/*Collectors.toMap(*/
                Collectors.groupingBy(Pupil::getGender, Collectors.summingInt(pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear()
                        /*, (num, num1) -> num*/)));
        System.out.println(mapGenderAge);

    }
}

