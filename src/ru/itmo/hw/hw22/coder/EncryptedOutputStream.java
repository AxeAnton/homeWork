package ru.itmo.hw.hw22.coder;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EncryptedOutputStream extends FilterOutputStream { //1.базовый дикоратор FilterOutputStream для пакета IO
    private String key;
    public EncryptedOutputStream(OutputStream out, String key) {
        super(out);
        this.key = key;
    }
    @Override
    public void write(byte[] b) throws IOException {
        for(int i = 0;i< b.length;i++){
            b[i] = (byte) (b[i]^ key.getBytes()[i%key.getBytes().length]);
        }
        System.out.println();
        // шифрование
        // вызвали метод write родителя, передали родителю зашифрованные данные
    }
}