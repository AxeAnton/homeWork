package hwFrom1To9.hw6climber;

import java.util.Arrays;

public class Group {

    private Climber[] climbers = new Climber[3];
    private Mountain mountain;

    public Group() {
    }

    public Group(Mountain mountain) {
        this.climbers = climbers;
        this.mountain = mountain;
    }

    public Group(Climber[] climbers, Mountain mountain) {
        this.climbers = climbers;
        this.mountain = mountain;
    }

    public Climber[] getClimbers() {
        return climbers;
    }

    public void setClimbers(Climber[] climbers) {
        this.climbers = climbers;
    }

    public Mountain getMountain() {
        return mountain;
    }

    public void setMountain(Mountain mountain) {
        this.mountain = mountain;
    }

    @Override
    public String toString() {
        return "Group{" +
                "climbers=" + Arrays.toString(climbers) +
                ", mountain=" + mountain +
                '}';
    }

    public void addToGroup(Climber climber) {
        for (int i = 0; i < climbers.length; i++) {
            if (climbers[i] == null) {
                climbers[i] = climber;
                return;
            }
        }
        System.out.println("No place for climber " + climber.getNameClimber());
    }

    public void checkGroup() {
        for (Climber nameClimbers : climbers) {
            if (nameClimbers == null) {
                System.out.println("The group entry is opened");
            }
            else System.out.println("The group entry is closed");
        }
    }
}
