package excepution;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException{
        if(age < 0 || age > 100){
//            throw new RuntimeException("age illgile");
            throw new IllegalAgeException("age illgile");
        }
        this.age = age;
    }
}
