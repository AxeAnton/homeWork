package hw122coderDecoder;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
/*       DeCoder inToProg = new DeCoder(new FileInputStream(new File("f")), "lkajsdflk");
       byte[] bytes= new byte[10000];
        inToProg.read( bytes);*/


        Coder coder = new Coder(new FileOutputStream("test.txt"),"sdfsdf");
        coder.write("hello".getBytes());

        DeCoder deCoder = new DeCoder(new FileInputStream("test.txt"), "sdfsdf");
        byte[] bytes = new byte["hello".getBytes().length];
        deCoder.read(bytes);

        System.out.println(new String(bytes));

    }
}
