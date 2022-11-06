package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OisDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("./liu_san.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p = (Person) objectInputStream.readObject();
        System.out.println(p.toString());
    }
}
