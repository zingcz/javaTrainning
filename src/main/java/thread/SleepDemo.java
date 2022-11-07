package thread;

import java.util.Scanner;

public class SleepDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(; n > 0; n--){
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("END");
    }
}
