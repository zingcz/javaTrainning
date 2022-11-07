package thread;

public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("lin: YES sleep for a while zzzz");
                try {
                    Thread.sleep(5000000);
                } catch (InterruptedException e) {
                    System.out.println("lin: hei! what is wrong with you?");
                }
                System.out.println("lin: wake up");
            }
        };

        Thread zhang = new Thread(){
            public void run(){
                System.out.println("start work hitting****");
                try {
                    for(int i = 5; i > 0; i--){
                        System.out.println("80!");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("finish");
                lin.interrupt();
            }
        };


        lin.start();
        zhang.start();
    }
}
