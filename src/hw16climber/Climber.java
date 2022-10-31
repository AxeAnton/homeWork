package hw16climber;

public class Climber {

    private String nameClimber;
    private String addressClimber;


    public Climber() {}

    public Climber(String nameClimber, String addressClimber) {
        setAddressClimber(addressClimber);
        setNameClimber(nameClimber);
        this.nameClimber = nameClimber;
        this.addressClimber = addressClimber;
    }

    public String getNameClimber() {
        return nameClimber;
    }

    public void setNameClimber(String nameClimber) {
        if (nameClimber == null || nameClimber.length() < 3) {
            throw new IllegalArgumentException("nameClimber should be min 3 letters");
        }
        this.nameClimber = nameClimber;
    }

    public String getAddressClimber() {
        return addressClimber;
    }

    public void setAddressClimber(String addressClimber) {
        if (addressClimber == null || addressClimber.length() < 3) {
            throw new IllegalArgumentException("addressClimber should be min 3 letters");
        }
        this.addressClimber = addressClimber;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "nameClimber='" + nameClimber + '\'' +
                ", addressClimber='" + addressClimber + '\'' +
                '}';
    }

}
