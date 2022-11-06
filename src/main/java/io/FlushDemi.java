package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FlushDemi {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./flush.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        String s = "this is a flush txt";
        bufferedOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
        //flush means do it right now;and every class extend from File class have flush method
        bufferedOutputStream.close();
    }
}
