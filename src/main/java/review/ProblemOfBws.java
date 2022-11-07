package review;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ProblemOfBws {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./quickFileOutput",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String s = " this is add content";
        byte[] b = s.getBytes(StandardCharsets.UTF_8);
        bos.write(b);
        bos.close();
        //when use the bufferOutputStream to write something really short like a single sentence remember to use flush or close method
        //in case that you forget and write nothing because the buffer system.
    }
}
