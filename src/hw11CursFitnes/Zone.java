package hw11CursFitnes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public enum Zone {
    ONEDAY(LocalTime.of(8, 00), LocalTime.of(22, 00), LocalDate.now(), LocalDate.now().plusDays(1), new String[]{"Swimming", "Gym"}),
    DALY(LocalTime.of(8, 00), LocalTime.of(14, 00), LocalDate.now(), LocalDate.now().plusMonths(1), new String[]{"Swimming", "Gym", "GroupLessons"}),
    FULL(LocalTime.of(8, 00), LocalTime.of(22, 00), LocalDate.now(), LocalDate.now().plusMonths(1), new String[]{"Swimming", "Gym", "GroupLessons"});

    private LocalTime visitTimeFrom;
    private LocalTime visitTimeTo;
    private LocalDate dataRegStart;
    private LocalDate dataRegFinish;
    private String[] zons;

    Zone(LocalTime visitTimeFrom, LocalTime visitTimeTo, LocalDate dataRegStart, LocalDate dataRegFinish, String[] zons) {
        this.visitTimeFrom = visitTimeFrom;
        this.visitTimeTo = visitTimeTo;
        this.dataRegStart = dataRegStart;
        this.dataRegFinish = dataRegFinish;
        this.zons = zons;
    }

    public LocalTime getVisitTimeFrom() {
        return visitTimeFrom;
    }

    public LocalTime getVisitTimeTo() {
        return visitTimeTo;
    }

    public LocalDate getDataRegStart() {
        return dataRegStart;
    }

    public LocalDate getDataRegFinish() {
        return dataRegFinish;
    }

    public String[] getZons() {
        return zons;
    }

    @Override
    public String toString() {
        return "Abonnement{" +
                "visitTimeFrom=" + visitTimeFrom +
                ", visitTimeTo=" + visitTimeTo +
                ", dataRegStart=" + dataRegStart +
                ", dataRegFinish=" + dataRegFinish +
                ", strings=" + Arrays.toString(zons) +
                '}';
    }
}


