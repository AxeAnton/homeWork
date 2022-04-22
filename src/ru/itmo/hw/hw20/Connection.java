package ru.itmo.hw.hw20;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connection implements AutoCloseable { //

    private Socket socket; // нуден для соединения со стороны сервиса
    private ObjectInputStream input;
    private ObjectOutputStream output;

    public Connection(Socket socket) throws IOException { //необходимо для организации исходящего и входящего потока.
        this.socket = socket; // после установки соединения
        output = new ObjectOutputStream(this.socket.getOutputStream()); // Не понял что написал, лучше объяснения в строке 22. получаем this.socket.getOutputStream поток. ObjectOutputStream отдавет данные другой программе
        input = new ObjectInputStream(this.socket.getInputStream()); // это уже входящий поток, здесь проще, после установки соеденения socket, получаем входящие данные через this.socket.getInputStream(), затем 27 строка
    } // необходимо при написании сохранять последовательность сначало исходящий потом входящий

    public void sendMessage(SimpleMessage message) throws IOException {
        message.setDateTime();
        output.writeObject(message); // output = new ObjectOutputStream(this...... сериализует мессаже который передается в последовательность byt и он уйдет по this.socket.getOutputStream строчка 16.
        output.flush();// Если данные передаются не в файл а из программы в программу то flush обязателен (иначе данные застрянут)
    }

    public SimpleMessage readMessage() throws IOException, ClassNotFoundException {
        return (SimpleMessage) input.readObject(); // ObjectInputStream он же переменная input. преобразует полученные данные в сообщение и мы его получаем.
    }

    @Override
    public void close() throws Exception {
        input.close();
        output.close();
        socket.close();
    }
}
