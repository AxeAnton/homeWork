package ru.itmo.hw.hw22.coder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {


        EncryptedOutputStream outputStream = new EncryptedOutputStream(new FileOutputStream("test.txt"),"sdfsdf");
        outputStream.write("hello".getBytes());

        EncryptedInputStream inputStream = new EncryptedInputStream (new FileInputStream("test.txt"), "sdfsdf");
        byte[] bytes = new byte["hello".getBytes().length];
        inputStream.read(bytes);

        System.out.println(new String(bytes));

    }
}


/*
    Условия задачи
    String key = "tgege";

// шифрует данные ^ (xor) write(byte[] b)
// дешифрует данные ^ (xor) read(byte[] b)

    шифрует данные extends FilterOutputStream
    дешифрует данные extends FilterInputStream

    int read(byte [] b) //
    int count = super.read(b); // 1. когда у super вызовите метод read массива "b"& то он вернет количество прочитанных байт count. После того как super.read отработает, данные физически окажутся в массиве byte [],
    // 2. вот здесь массив перебераем и байты дешефруем.
    return count;
*/
