package thread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++){
                    System.out.println("i will jump");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("rose is in the sea now");
            }
        };


        Thread jack = new Thread(){
            public void run(){
                for (int i = 0; i < 1000; i++){
                    System.out.println("i will follow");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        jack.setDaemon(true);
        //set before start or a mistake will happen
        rose.start();
        jack.start();

        //while(true){}

    }
}
