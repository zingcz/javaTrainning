package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/java/io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
