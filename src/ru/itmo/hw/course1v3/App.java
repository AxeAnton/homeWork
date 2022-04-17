package ru.itmo.hw.course1v3;

import ru.itmo.hw.course1v2.AbonementType;
import ru.itmo.hw.course1v2.Member;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Fitness fitness = new Fitness();

/*
        private static Owner[] generateOwner(int 21){
            Owner[] owners = new Owner[21];
            for (int i = 0; i < 21; i++) {
                if (owners == null)
                Owner owner = new Owner("name" + i, "surname" + i, "1987-09-10" + 1),
                               owners[i] = owner;
            }
            return owners;
        }
*/


        Owner owner1 = new Owner("Anton","Klimenko","1987-09-10");
        Owner owner2 = new Owner("Ivan","Yakovenko","1987-09-10");
        Owner owner3 = new Owner("Petr","Anisimov","1987-09-10");
//        Owner owner4 = new Owner("Test", "тест", "1990-10-28");
//        Owner owner5 = new Owner("Светлана","тест","1990-10-28");
//        Owner owner6 = new Owner("Юля","тест","1990-10-28");
//        Owner owner7 = new Owner("Миша","тест","1990-10-28");
//        Owner owner8 = new Owner("Леня","тест","1990-10-28");
//        Owner owner9 = new Owner("Дима","тест","1990-10-28");
//        Owner owner10 = new Owner("Стас","тест","1990-10-28");
//        Owner owner11 = new Owner("Георгий","тест","1990-10-28");
//        Owner owner12 = new Owner("Галниа","тест","1990-10-28");
//        Owner owner13 = new Owner("Иван","тест","1990-10-28");
//        Owner owner14 = new Owner("Антон","тест","1990-10-28");
//        Owner owner15 = new Owner("Влад","тест","1990-10-28");
//        Owner owner16 = new Owner("Роман","тест","1990-10-28");
//        Owner owner17 = new Owner("Костя","тест","1990-10-28");
//        Owner owner18 = new Owner("Наджеда","тест","1990-10-28");
//        Owner owner19 = new Owner("Вася","тест","1990-10-28");
//        Owner owner20 = new Owner("Нелли","тест","1990-10-28");
//        Owner owner21 = new Owner("АБОНА","тест","1990-10-28");

        Abonement abonement1 = new Abonement(owner1,Type.ONEDAY,new Zone[]{Zone.SWIMINGPOOL,Zone.GYM});
        Abonement abonement2 = new Abonement(owner2,Type.ONEDAY,new Zone[]{Zone.SWIMINGPOOL,Zone.GYM});
        Abonement abonement3 = new Abonement(owner3,Type.ONEDAY,new Zone[]{Zone.SWIMINGPOOL,Zone.GYM});
///       Abonement abonement4 = new Abonement(owner4, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement5 = new Abonement(owner5, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement6 = new Abonement(owner6, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement7 = new Abonement(owner7, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement8 = new Abonement(owner8, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement9 = new Abonement(owner9, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement10 = new Abonement(owner10, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement11 = new Abonement(owner11, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement12 = new Abonement(owner12, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement13 = new Abonement(owner13, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement14 = new Abonement(owner14, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement15 = new Abonement(owner15, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement16 = new Abonement(owner16, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement17 = new Abonement(owner17, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement18 = new Abonement(owner18, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement19 = new Abonement(owner19, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement20 = new Abonement(owner20, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});
//        Abonement abonement21 = new Abonement(owner21, Type.FULLDAY, new Zone[]{Zone.GROUPSLESSONS,Zone.GYM,Zone.SWIMINGPOOL});

        fitness.visitToFitnes(abonement1,Zone.GYM);
        fitness.visitToFitnes(abonement2,Zone.SWIMINGPOOL);
        fitness.visitToFitnes(abonement3,Zone.GROUPSLESSONS);
//        fitness.visitToFitnes(abonement4, Zone.GYM);
//        fitness.visitToFitnes(abonement5, Zone.GYM);
//        fitness.visitToFitnes(abonement6, Zone.GYM);
//        fitness.visitToFitnes(abonement7, Zone.GYM);
//        fitness.visitToFitnes(abonement8, Zone.GYM);
//        fitness.visitToFitnes(abonement9, Zone.GYM);
//        fitness.visitToFitnes(abonement10, Zone.GYM);
//        fitness.visitToFitnes(abonement11, Zone.GYM);
//        fitness.visitToFitnes(abonement12, Zone.GYM);
//        fitness.visitToFitnes(abonement13, Zone.GYM);
//        fitness.visitToFitnes(abonement14, Zone.GYM);
//        fitness.visitToFitnes(abonement15, Zone.GYM);
//        fitness.visitToFitnes(abonement16, Zone.GYM);
//        fitness.visitToFitnes(abonement17, Zone.GYM);
//        fitness.visitToFitnes(abonement18, Zone.GYM);
//        fitness.visitToFitnes(abonement19, Zone.GYM);
//        fitness.visitToFitnes(abonement21, Zone.GYM);
//        fitness.visitToFitnes(abonement20, Zone.GYM);
//        fitness.visitToFitnes(abonement21, Zone.GROUPSLESSONS);

        fitness.getAllDataFromArrays(); //возвращает содержимое всех массивов
        fitness.getInfoByZone(Zone.GROUPSLESSONS);


    }
}
