package review;

public class Person {
    private String name;
    private int age;

    public void sayMyName(){
        System.out.println(name);
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if(age < 0 || age > 100){
            throw new RuntimeException("AGE IS ILLEGAL!");
        }
        this.age = age;
    }
}
