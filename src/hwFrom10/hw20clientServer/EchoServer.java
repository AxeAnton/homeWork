package hwFrom10.hw20clientServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    private int port;
    private Connection connection;
    int c = 0;
    public EchoServer(int port){
        this.port = port;
    }

    public void start() throws IOException, ClassNotFoundException {
        try (ServerSocket serverSocket = new ServerSocket(port)){ // ServerSocket(port) необходим для запуска сервира на текущем порту и ждет подклучения
            System.out.println("Server started...");
            while (true){ // далее в бесконечном цикле сервирная сторона ждет клиента
                Socket socket = serverSocket.accept(); // приходит клиент, вызывается метод устанавливаия соеденения между клиентом и сервером
                connection = new Connection(socket);
                SimpleMessage message = connection.readMessage();
                c++;
                if (message.getText().equalsIgnoreCase("count")) {
                    connection.sendMessage(SimpleMessage
                            .getMessage("server", "count = "+ c));
                }

                if (message.getText().equalsIgnoreCase("help")) {
                    connection.sendMessage(SimpleMessage
                            .getMessage("server", "Help, Count, Ping, Exit")); // формирует свое сообщение и отправляет обратно
                }
/*                else if (message.getText().equalsIgnoreCase("ping")) {
                    connection.sendMessage(SimpleMessage
                            .getMessage("server", "ping = "));

                }
*/
                else {
                    connection.sendMessage(SimpleMessage
                            .getMessage("server", "invalid order"));
                }

                //printMessage(connection.readMessage()); // серверная сторона читает сообщения от клиента
            }
        }

    }

    private void printMessage(SimpleMessage message){
        System.out.println("message received: " + message);
    }

    public static void main(String[] args) {
        int port = 8090;
        EchoServer messageServer = new EchoServer(port);
        try {
            messageServer.start();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
