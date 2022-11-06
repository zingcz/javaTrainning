package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OosDemo {
    public static void main(String[] args) throws IOException {
        String name = "liu san";
        String[] otherInfo = new String[]{"good skill","love the city","cute person"};
        int age = 18;
        String address = "toukeo";
        Person person = new Person(age,name,address,otherInfo);
        FileOutputStream fileOutputStream = new FileOutputStream("./liu_san.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(person);
        System.out.println("DONE");
        oos.close();
    }
}
