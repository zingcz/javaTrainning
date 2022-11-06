package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bos = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bos);
        pw.println("today is a nice day");
        pw.println("make sure not play fool game");
        pw.flush();
        pw.close();

    }
}
