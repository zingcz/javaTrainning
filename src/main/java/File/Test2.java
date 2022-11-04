package File;

import java.io.File;
import java.io.FileFilter;

public class Test2 {
    public static void main(String[] args) {
        File searchFile = new File("d:/");
        //-------------------------------------------------------
        FileFilter fileFilter = (File file) -> {
            return file.getName().endsWith(".txt");
        };
        //-------------------------------------------------------
        FileFilter fileFilterWithOutTypeName = (file)->{
            return file.getName().endsWith(".txt");
        };
        //-------------------------------------------------------
        FileFilter fileFilterWithOutBigParethese = (file)->file.getName().endsWith(".txt");
        //-------------------------------------------------------
        FileFilter fileFilterWithOutParethese = file->file.getName().endsWith(".txt");
        //-------------------------------------------------------
        File[] fileList = searchFile.listFiles(f->f.getName().endsWith(".txt"));
        for(File file:fileList){
            System.out.println(file.getName());
        }
    }
}
