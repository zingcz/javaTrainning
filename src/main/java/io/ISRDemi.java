package io;

import java.io.*;

public class ISRDemi {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./OSW.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        int d;
        while ((d = isr.read()) != -1){
            //important easy to make mistake here
            System.out.print((char) d);
        }
    }
}
