package review;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./little red.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person littleRed = new Person("red",18);
        oos.writeObject(littleRed);
        oos.close();
    }
}
