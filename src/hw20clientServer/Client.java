package hw20clientServer;

import java.io.IOException;
import java.net.Socket;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Client { // клиент первый начинает запрос о подсоединении

    private int port; // local.... 8090
    private String ip; // ip клиента 127.0.0.1
    private Scanner scanner;
    private LocalDateTime time;

    public Client() {
    }

    public Client(int port, String ip) {
        this.port = port;
        this.ip = ip;
        scanner = new Scanner(System.in);
    }


    public void start() throws Exception { // когда у клиента начинается метод Start
        System.out.println("Enter a name");
        String name = scanner.nextLine(); // сканер получает значение из консолки
        String messageText;


        while (true) { // запускается бесконечный цикл
            System.out.println("Enter a message"); // клиент просит ввести командду
            messageText = scanner.nextLine(); // сама команда
            long start = System.currentTimeMillis(); // FIXME время ввода сообщения
            if (messageText.equalsIgnoreCase("exit")) { // выходит из
                break;
            }
            SimpleMessage.getMessage(name, messageText);

            sendAndPrintMessage(SimpleMessage.getMessage(name, messageText));// формируется сообщение


        }
    }

    private void sendAndPrintMessage(SimpleMessage message) throws Exception {
        try (Connection connection = new Connection(getSocket())) { // клиентская сторона устанавливает соединение по getSoket

            time = LocalDateTime.now();

            connection.sendMessage(message); // после того как соединение установленно, клиенская сторона отправляет сообщение серверу (другой программе)
            SimpleMessage formServer = connection.readMessage(); // другая программа формирует собственное сообщение и отправляет его клиенту

            Duration str = Duration.between(time, LocalDateTime.now()); // LocalDateTime.now() // formServer.getDateTime().getNano()

            if (message.getText().equalsIgnoreCase("ping")) {
                System.out.println("answer from the server, ping = " + str);
            } else System.out.println("answer from the server: " + formServer);

        }
    }

    private Socket getSocket() throws IOException {
        Socket socket = new Socket(ip, port); // благодоря soket клиенская сторана подключается к серверу.
        return socket;
    }


    public static void main(String[] args) {
        int port = 8090;
        String ip = "127.0.0.1";

        try {
            new Client(port, ip).start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}