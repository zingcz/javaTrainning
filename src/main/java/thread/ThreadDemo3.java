package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        //匿名内部类创建
        Thread t2 = new Thread(){
            public void run(){
                for(int i = 0; i < 1000; i++){
                    System.out.println("who are you?");
                }
            }
        };
        //lambda
        Thread t1 = new Thread(()->{
            for(int i = 0; i < 1000; i++){
                System.out.println("FBI! open the door");
            }
        });
        t1.start();
        t2.start();
    }
}
