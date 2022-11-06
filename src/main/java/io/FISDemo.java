package io;

import java.io.*;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./fos.dat");
        file.createNewFile();
        FileInputStream fileInputStream= new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(1);
        fileOutputStream.write(2);
        fileOutputStream.close();
        int d = fileInputStream.read();
        System.out.println(d);
        //-----------------------------
        d = fileInputStream.read();
        System.out.println(d);
        //-----------------------------
        d = fileInputStream.read();
        System.out.println(d);
        //-----------------------------
        d = fileInputStream.read();
        System.out.println(d);
        FileInputStream pictureInPutStream = new FileInputStream("./interlude_fubuki.png");
        FileOutputStream pictureOutPutStream = new FileOutputStream("./interlude_fubuki_copy.png");
        d = pictureInPutStream.read();
        while (d != -1){
            pictureOutPutStream.write(d);
            d = pictureInPutStream.read();
        }
        pictureInPutStream.close();
        pictureOutPutStream.close();
    }
}
