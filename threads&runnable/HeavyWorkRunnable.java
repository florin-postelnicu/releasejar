/*
HeavyWorkRunnable is a class that implements Runnable Interface

Classes that implement the Runnable interface must include the run() method, which has the
following structure:

public void run() {
 // body of the method
}

The run() method should take care of the task that the thread was created to accomplish. In
the stock-market example, the run() method could contain statements to load data from disk
and compile statistics based on that data.
When a threaded application is run, the statements in its run() method are not executed
automatically. Threads can be started and stopped in Java, and a thread doesn’t begin running
until you do two things:
 u Create an object of the threaded class by calling the Thread constructor
 u Start the thread by calling its start() method
The Thread constructor takes a single argument: the object that contains the thread’s run()
method. Often, you use the this keyword as the argument, which indicates the current class
includes the run() method.
Listing 15.1 contains a Java application that finds the first one million prime numbers, storing
them in a StringBuffer. When it has found all of the primes, they are displayed. In NetBeans,
create a new Java file named PrimeFinder in the com.java24hours package, enter the text
from the listing in the file, and—wait for it—don’t forget to save it.
 */



public class HeavyWorkRunnable implements Runnable {
    public void run(){
        System.out.println("Doing Heavy Process - Start" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Doing Heavy Process - End" + Thread.currentThread().getName());
    }
    private void doDBProcessing ()throws InterruptedException{
        Thread.sleep(5000);
    }

//    public static void main(String[] args) {
//        HeavyWorkRunnable hr = new HeavyWorkRunnable();
//        hr.run();
//    }
}
