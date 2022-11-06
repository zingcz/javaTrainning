package io;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
    private int age = 10;
    private String name;
    private String address;
    //not contain the ignore property will be null when get back
    private transient String[] otherInfo;

    public Person(int age, String name, String address, String[] otherInfo) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.otherInfo = otherInfo;
    }
    public Person(){
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
