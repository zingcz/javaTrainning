package excepution;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            s = "a";
            String[] sAarray = new String[]{"one"};
            System.out.println(s.length());
            System.out.println(sAarray[0]);
            System.out.println(Integer.parseInt(s));
            System.out.println("if error show up this will not show up");
//        }catch (NullPointerException e){
//            System.out.println("NullPointerException error");
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("IndexOutOfBoundsException error");
        }catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println("TWO ERROR");
        }catch (Exception e){
            System.out.println("unknown exception");
        }
        System.out.println("if error happen start from here or will not show up");
    }
}
