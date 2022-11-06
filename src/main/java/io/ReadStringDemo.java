package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./demo.txt");
        long len = file.length();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] b= new byte[(int) len];
        fileInputStream.read(b);
        String s = new String(b, StandardCharsets.UTF_8);
        System.out.println(s);
    }
}
