package hwFrom10.hw11CursFitnes;

public enum WishZone {
    SWIMMING("Swimming"), GYM("Gym"), GROUPlESSONS("GroupLessons");

    private String name;

    WishZone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TypeZone{" +
                "name='" + name + '\'' +
                '}';
    }
}
