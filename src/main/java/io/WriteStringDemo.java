package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./demo.txt");
        String s = "this is a text content.";
        byte[] data = s.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(data);
    }
}