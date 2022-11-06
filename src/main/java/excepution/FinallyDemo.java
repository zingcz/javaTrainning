package excepution;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            String s = "";
            System.out.println(s.length());
            return;
        }catch (Exception e){
            System.out.println("some thing wrong");
        }finally {
            System.out.println("code in finally ex");
        }
        System.out.println("over");
    }
}
