package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./OSW.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        osw.write("this is a test context for osw ");
        osw.close();
    }
}
