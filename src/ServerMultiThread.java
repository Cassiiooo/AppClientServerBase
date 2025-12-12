import java.io.*;
import java.net.*;

public class ServerMultiThread {
    public static void main(String[] args) throws IDException {
        int port = 12345;
        ServerSocket serverSocket = new ServerSoccket(port);
        System.out.println("Server avviato sulla porta: " + port);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Nuovo client connesso: " + clientSocket.getInetAddress());
            ClientHandler clientHandler = new ClientHandler(clientSocket);
            new Thread(clientHandler).start();
        }
    }
}