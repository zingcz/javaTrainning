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

//对于无法传参——不允许参数或该方法被底层自动执行没有机会输入参数的情况，用类的构造器获取和暂存
    private class ClientHandler implements Runnable{
        Socket socket;
        ClientHandler(Socket socket){
            this.socket = socket;
        }

        public void run(){
            try {
                InputStream input = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(input, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String message;
                while ( (message = br.readLine()) != null){
                    System.out.println("a client say " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {

            }
        }
    }

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
            while (true){
                System.out.println("waiting for client connect");
                Socket socket = serverSocket.accept();
                System.out.println("a client connect success");

                ClientHandler handler = new ClientHandler(socket);
                Thread t1 = new Thread(handler);
                t1.start();
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
