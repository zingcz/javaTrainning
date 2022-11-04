package File;

import java.io.File;
import java.io.IOException;

/**
 * java.io.File
 *
 */
public class FileDmo {
    public static void main(String[] args) throws IOException {
        File file1 = new File("test.txt");
        if(file1.exists()){
            file1.delete();
            System.out.println("DELETED FILE SUCCESS");
        }else {
            file1.createNewFile();
            System.out.println("NEW FILE CREATE SUCCESS");
        }

        String[] fileNames = new String[10];
        for(int i = 0; i < 10; i++){
            File file2 = new File("test.txt");
            if(file1.exists()){
                file1.delete();
                System.out.println("DELETED FILE SUCCESS");
            }else {
                file1.createNewFile();
                System.out.println("NEW FILE CREATE SUCCESS");
            }
        }

        File file = new File("./demo.txt");
        String name = file.getName();
        long length = file.length();
        System.out.println(name + length);
        boolean cr = file.canRead();
        boolean cw = file.canWrite();
        boolean ih = file.isHidden();
        System.out.println(cr + " " + cw + " " + ih);
    }
}
