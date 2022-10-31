package hw17school.base;

public class NameAge {
    private int age;
    private String name;

    public NameAge(int age, String name) {
        setAge(age);
        setName(name);
        // this.age = age;
        // this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 7) System.out.println("Age should be more then 6 years");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) System.out.println("Name should be more then 2 words and not Null");
        this.name = name;
    }

}
