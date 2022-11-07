package review;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class QuickFileOutputDemo {
    public static void main(String[] args) throws IOException {
        //快写
        FileOutputStream fos = new FileOutputStream("./quickFileOutput");
        byte[] b;
        String sWrite = "this is what i want say";
        b = sWrite.getBytes(StandardCharsets.UTF_8);
        fos.write(b);
        fos.close();

        //快读
        FileInputStream fis = new FileInputStream("./quickFileOutput");
        byte[] b1 = new byte[1024];
        int length = fis.read(b1);
        String sGet = new String(b1,0,length,StandardCharsets.UTF_8);
        System.out.println(sGet);
        //都是借助一个byte数组进行缓冲读写。都需要字符转换
    }
}
