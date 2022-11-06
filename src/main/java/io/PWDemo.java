package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("./pw.txt");
        pw.println("the lightest star in the dark sky");
        pw.println("can you hear the voice of my soul?");
        pw.flush();
        pw.close();
    }
}
