package File;

import java.io.File;
import java.io.FileFilter;

public class ListFileDemo2 {
    public static void main(String[] args) {
        File file = new File(".");
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.contains("t");
            }
        };
        File[] files = file.listFiles(fileFilter);
        for(File item: files){
            System.out.println(item.getName());
        }
    }
}
