package hw6climber;

public class Mountain {

    private String nameMountain;
    private String countryMountain;
    private int heightMountain;
   // private Climber climber;

    public Mountain(String nameMountain, String countryMountain, int heightMountain) {
        setNameMountain(nameMountain);
        setCountryMountain(countryMountain);
        setHeightMountain(heightMountain);
        this.nameMountain = nameMountain;
        this.countryMountain = countryMountain;
        this.heightMountain = heightMountain;
    }
    public String getNameMountain() {
        return nameMountain;
    }

    public void setNameMountain(String nameMountain) {
        if (nameMountain == null || nameMountain.length() < 3) {
            throw new IllegalArgumentException("nameMountain should be min 4 letters");
        }
        this.nameMountain = nameMountain;
    }

    public String getCountryMountain() {
        return countryMountain;
    }

    public void setCountryMountain(String countryMountain) {
        if (countryMountain == null || countryMountain.length() < 3) {
            throw new IllegalArgumentException("countryMountain should be min 4 letters");
        }
        this.countryMountain = countryMountain;
    }

    public int getHeightMountain() {
        return heightMountain;
    }

    public void setHeightMountain(int heightMountain) {
        if ( heightMountain < 100) {
            throw new IllegalArgumentException("heightMountain should be min 100 m");
        }
        this.heightMountain = heightMountain;
    }

/*
    public Climber getClimber() {
        return climber;
    }

    public void setClimber(Climber climber) {
        this.climber = climber;
    }
*/

    @Override
    public String toString() {
        return "Mountain{" +
                "nameMountain='" + nameMountain + '\'' +
                ", countryMountain='" + countryMountain + '\'' +
                ", heightMountain=" + heightMountain +
                /*", climber=" + climber +*/
                '}';
    }
}
