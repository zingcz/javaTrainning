package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Client {
    private Socket socket;


    public Client(){
        try {
            System.out.println("try to find the serve");
            socket = new Socket("localhost",8088);
            System.out.println("connect to the serve success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner sc = new Scanner(System.in);
            String s;
            while (true){
                s = sc.nextLine();
                if(s.equals("exit")){
                    break;
                }
                pw.println(s);
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
