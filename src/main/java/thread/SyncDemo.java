package thread;

public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName() + ":" + bean);
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName() + ":" + bean);
                }
            }
        };
        t2.start();
    }
}
class Table{
    private int beans = 10;
    public int getBeans(){
        if(beans == 0){
            throw new RuntimeException("no beans left");
        }
        Thread.yield();
        return beans--;
    }
}
