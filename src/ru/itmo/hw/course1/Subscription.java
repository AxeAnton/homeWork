package ru.itmo.hw.course1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Subscription {

    private Members members;
    private Type type;


    public Members getMembers() {return members;}
    public void setMembers(Members members) {
        this.members = members;
    }

    public Type getType() {return type;}
    public void setType(Type type) {
        this.type = type;
    }

/*    LocalTime a = type.getFromValidTime();
    LocalTime b = type.getBeforValidTime();
    LocalDate c = type.getStartRegistryDay();
    LocalDate d = type.getFinishRegistryDay();
    */

}
