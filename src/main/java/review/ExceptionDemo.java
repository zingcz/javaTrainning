package review;

public class ExceptionDemo {
    public static void main(String[] args) {
        Person zhang = new Person("zhang",18);
        try {
            zhang.setAge(12);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("no matter how this will show up");
        }
    }
}
