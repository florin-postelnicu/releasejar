package mypackage01;

public class CountImplementRunnable implements Runnable {

    Thread mythread;
    CountImplementRunnable()
    {
        mythread = new Thread(this ,"my runnable thread");
        System.out.println("my thread created " + mythread);
        mythread.start();
    }

    public void run()
    {
        try
        {
            for (int i=0;i<10; i++)
            {
                System.out.println("printing the count" + i);
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException e)
        {
            System.out.println("my thread interrupted");
        }
        System.out.println("mythread run is over");
    }
}

class RunnableExample
{
    public static void main(String[] args) {
        CountImplementRunnable cntr = new CountImplementRunnable();
        try
        {
            while(cntr.mythread.isAlive())
            {
                System.out.println("Mythread will be alive till the child threaad is alive");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main THread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}

