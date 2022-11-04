package File;

import java.io.File;

public class ListFileDemo {
    public static void main(String[] args) {


        File file = new File("d:/");
        File[] files = file.listFiles();
        for(int i = 0; i < files.length; i++){
            System.out.println(files[i].getName());
        }
    }
}
