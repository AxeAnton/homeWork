package hw7school.base;

public class Subject extends NameAge {
    private String subject;

    public Subject(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject == null || subject.length() < 4) System.out.println("Subject should be more then 3 words and not Null");
        this.subject = subject;
    }

}
