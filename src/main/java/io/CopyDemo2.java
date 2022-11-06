package io;

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./AE脚本管理器 V6.zip");
        FileOutputStream fileOutputStream = new FileOutputStream("./AE脚本管理器_copyV6.zip");
        File file = new File("./AE脚本管理器_copyV6.zip");
        file.createNewFile();
        byte[] b = new byte[1024*10];
        int len;

        len =  fileInputStream.read(b);
        while (len != -1){
            fileOutputStream.write(b,0,len);
            len = fileInputStream.read(b);
        }
    }
}
