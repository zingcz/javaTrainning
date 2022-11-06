package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("note.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        pw.println();
        Scanner sc = new Scanner(System.in);
        String s;
        while (true){
            s = sc.next();
            if(s.equals("exit")){
                break;
            };
            pw.println(s);
        }
        pw.close();
    }
}
