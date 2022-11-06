package io;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./AE脚本管理器 V6.zip");
        FileOutputStream fileOutputStream = new FileOutputStream("./AE脚本管理器2and V6.zip");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        int d;
        while( (d = bufferedInputStream.read()) != -1);
            bufferedOutputStream.write(d);
    }
}
