package thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("main thread: " + main);
        doSome();
        System.out.println(main + "over");
    }
    public static void doSome(){
        Thread t = Thread.currentThread();
        System.out.println("当前doSome线程： " + t);
    }
}
