package thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread max = new Thread(){
            public void run(){
                for(int i = 0; i < 1000; i++){
                    System.out.println("max");
                }
            }
        };

        Thread min = new Thread(){
            public void run(){
                for(int i = 0; i < 1000; i++){
                    System.out.println("min");
                }
            }
        };

        Thread nor = new Thread(){
            public void run(){
                for(int i = 0; i < 1000; i++){
                    System.out.println("nor");
                }
            }
        };

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        min.start();
        max.start();
        nor.start();
    }
}
