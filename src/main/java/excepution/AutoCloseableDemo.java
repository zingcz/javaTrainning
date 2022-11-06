package excepution;

import java.io.FileOutputStream;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try (
            FileOutputStream fos = new FileOutputStream("fos.dat");
        ){
            fos.write(1);
        }catch (Exception e){
            System.out.println("something wrong");
        }
    }
}
