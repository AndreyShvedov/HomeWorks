package lesson20;
import java.io.IOException;
import java.net.ServerSocket;

public class WebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8082);
        while (true) {
            var socket = serverSocket.accept();
            System.out.println("Client accepted");
            new Thread(new SocketProcessor(socket)).start();
        }
    }
}
