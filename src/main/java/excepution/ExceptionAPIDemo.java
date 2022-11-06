package excepution;

public class ExceptionAPIDemo {
    public static void main(String[] args) {
        System.out.println("START");
        try {
            String line = "ac";
            System.out.println(Integer.parseInt(line));
        }catch (NumberFormatException e){
            e.printStackTrace();
            String messgae = e.getMessage();
            System.out.println(messgae);
        }
        System.out.println("OVER");
    }
}
