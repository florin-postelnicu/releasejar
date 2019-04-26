package mypackage01;

public class MultiThreadingDemo extends Thread {
    public void run(){
        System.out.println("My thread is in running state.");
    }

    public static void main(String[] args) {
        MultiThreadingDemo mtd = new MultiThreadingDemo();
        mtd.start();

    }
}
