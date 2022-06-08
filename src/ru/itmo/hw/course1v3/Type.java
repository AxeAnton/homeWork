package ru.itmo.hw.course1v3;

import java.time.LocalTime;

public enum Type {

    ONEDAY(new Zone[]{Zone.SWIMINGPOOL,Zone.GYM}, LocalTime.of(8, 0), LocalTime.of(22, 0)),
    DIURNAL(new Zone[]{Zone.GYM,Zone.GROUPSLESSONS},LocalTime.of(8,0),LocalTime.of(16,00)),
    FULLDAY(new Zone[]{Zone.GYM,Zone.SWIMINGPOOL,Zone.GROUPSLESSONS},LocalTime.of(8,00),LocalTime.of(22,00));

    private Zone[] zones;
    private LocalTime openHour;
    private LocalTime clouseHour;


    Type(Zone[] zones, LocalTime openHour, LocalTime clouseHour) {
        this.zones = zones;
        this.openHour = openHour;
        this.clouseHour = clouseHour;
    }






}
