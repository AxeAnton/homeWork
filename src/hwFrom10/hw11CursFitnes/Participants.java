package hwFrom10.hw11CursFitnes;

import java.time.LocalDate;

public class Participants {

    private String name;
    private String secondName;
    private LocalDate getBirthDay;
    private Zone zone; // илил Zone[]!?
    private WishZone typeZone;

    public Participants(String name, String secondName, LocalDate getBirthDay, Zone zone, WishZone typeZone) {
        this.name = name;
        this.secondName = secondName;
        this.getBirthDay = getBirthDay;
        this.zone = zone;
        this.typeZone = typeZone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getGetBirthDay() {
        return getBirthDay;
    }

    public void setGetBirthDay(LocalDate getBirthDay) {
        this.getBirthDay = getBirthDay;
    }

    public Zone getZone() { //????
        return zone;
    }

    public WishZone getTypeZone() {
        return typeZone;
    }
}
