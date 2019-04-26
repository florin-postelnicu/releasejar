package mypackage01;

public class CountUsingThreads extends Thread {
    CountUsingThreads() {
        super("my extending thread");
        System.out.println("my thread created " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("My thread run is over");
    }
}
class ExtendingExample
{
    public static void main(String[] args) {

        CountUsingThreads cnt = new CountUsingThreads();
        try
        {
            while(cnt.isAlive())
            {
                System.out.println("main thread will be alive as long child thread  is alive");
                Thread.sleep(1500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("main thread ' s run is over");
    }
}
