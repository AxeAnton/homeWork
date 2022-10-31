package repeat.serializable;

import java.io.*;

public class AppUser {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        UserChild user = new UserChild(50);
        user.staticFild = 45;
        user.childLevel = 25;
        Sword sword = new Sword();
        sword.level = 5;

        user.sword = sword;


        FileOutputStream fileOutputStream = new FileOutputStream("serializable2.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        User.staticFild = 35;

        FileInputStream fileInputStream = new FileInputStream("serializable2.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeValue);
        System.out.println(newUser.sword);
        System.out.println(user.childLevel);
        System.out.println(user.staticFild);

    }
}
