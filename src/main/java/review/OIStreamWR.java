package review;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OIStreamWR {
    public static void main(String[] args) throws IOException {
        //WARING: it is pretty easy to forget the stander of the unicode when connect the fileO/iStream to the O/IStreamW/R!!
        FileOutputStream fos = new FileOutputStream("./quickFileOutput",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        osw.write("i directly write i want write");


        //WARING: not like the outputSteamWrite that you can directly pass the String type diagram inside the
        //inputSteamRead do not return the String type directly
        //but return a int type which actually is the number of a chat,just obviously convert it!and get what you want a char!
        FileInputStream fis = new FileInputStream("./quickFileOutput");
        InputStreamReader isr = new InputStreamReader(fis,StandardCharsets.UTF_8);
        System.out.println((char) isr.read());
    }
}
