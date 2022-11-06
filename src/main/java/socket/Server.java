package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    private ServerSocket serverSocket;


    public void server(){
        try {
            System.out.println("try to wake up the serve");
            serverSocket = new ServerSocket(8088);
            System.out.println("wake up the serve success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            System.out.println("waiting for client connect");
            Socket socket = serverSocket.accept();
            System.out.println("a client connect success");

            InputStream input = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(input, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String message;
            while ( (message = br.readLine()) != null){
                System.out.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        Server server = new Server();
        server.server();
        server.start();
    }
}
