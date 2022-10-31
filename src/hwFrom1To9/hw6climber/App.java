package hwFrom1To9.hw6climber;

public class App {
    public static void main(String[] args) {

        Climber climber1 = new Climber("Anton", "St.Petersburg");
        //System.out.println(climber1.getAddress() + " " + climber.getName());
        Climber climber2 = new Climber("Petr", "St.Petersburg");
        Climber climber3 = new Climber("Valera", "St.Petersburg");
        Climber climber4 = new Climber("Kosta", "St.Petersburg");
        Climber climber5 = new Climber("Anna", "St.Petersburg");
        Climber climber6 = new Climber("Ira", "St.Petersburg");

        Climber climber7 = new Climber();
        climber7.setNameClimber("Ivan");
        climber7.setAddressClimber("Chelyabinsk");

        Mountain mountain1 = new Mountain("K190", "Russia", 190);
        Mountain mountain2 = new Mountain("K200", "Russia", 200);
        Mountain mountain3 = new Mountain("K250", "Russia", 250);

        Group group1 = new Group(mountain1);
        group1.addToGroup(climber1);
        group1.addToGroup(climber2);
        group1.addToGroup(climber3);
        group1.addToGroup(climber4);
        group1.checkGroup();
        System.out.println("Group 1 - " + group1);

        Group group2 = new Group(mountain2);
        group2.addToGroup(climber4);
        group2.addToGroup(climber5);
        group2.checkGroup();
        System.out.println("Group 2 - " + group2);

        Group group3 = new Group(mountain3);
        group3.addToGroup(climber6);
        group3.addToGroup(climber7);
        group3.checkGroup();
        System.out.println("Group 3 - " + group3);


    }
}
