package hwFrom10.hw11Planet;

public enum Planet {
    JUPITER("Jupiter", 100, 50), SATURN("Saturn", 120, 60), MARS("Mars", 140, 75);

    private String name;
    private int muss;
    private int radius;

    Planet(String name, int muss, int radius) {
        this.name = name;
        this.muss = muss;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public int getMuss() {
        return muss;
    }

    public void setMuss(int muss) {
        this.muss = muss;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", muss=" + muss +
                ", radius=" + radius +
                '}';
    }
}
