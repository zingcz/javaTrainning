package review;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferWR {
    public static void main(String[] args) throws IOException {
        //remember the theory almost the same as the BufferO/IStream write but wait util 8k data read but actually take 8
        //k data once, but just give you one every thing you aks for the object of Buffer class.
        FileOutputStream fos = new FileOutputStream("./quickFileOutput",true);
        FileInputStream fis = new FileInputStream("./quickFileOutput");

        //the same problem like bufferOutputStream when you try to write something too short like a sentence,you will write
        //nothing because the buffer and flush system.
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        pw.println(" this is content from pw or BufferWrite practice");
        pw.close();

        //when read to the end the return of the br will be null
        //just like the bufferInputStream the read method only return a int type and is the number of a char
        //suggest to use readLine method directly give you a line of string once.
        InputStreamReader isr = new InputStreamReader(fis,StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        br.close();
    }
}
