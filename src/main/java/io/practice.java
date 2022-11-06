package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fileOutputStream = new FileOutputStream("./demo.txt",true);
        String s = sc.next();
        while (!s.equals("exit")){
            byte[] b = s.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(b);
            s = sc.next();
        }
        fileOutputStream.close();
    }
}
