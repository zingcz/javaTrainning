package review;

import java.io.*;

public class BufferOIStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./AE脚本管理器 V6 copy.zip");
        FileInputStream fis = new FileInputStream("./AE脚本管理器 V6.zip");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int b;
        //yes when talk about bufferOutputString we use the origin int type as the first time we only use the basic
        //FileOutputStream to write byte.and also we use the int type to accept what we read by the bufferInputStream
        while (true){
            if ((b = bis.read()) != -1){
                bos.write(b);
            }else {
                return;
            }
        }
    }
}
