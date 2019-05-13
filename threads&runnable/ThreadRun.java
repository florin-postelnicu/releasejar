
/*
Since Thread and Runnable are classes that belong to java.lang
packages of classes, you don't need to import them.

Methods of class Thread

1. activeCount() :java.lang.Thread.activeCount() Returns an estimate of the number of active threads

                  in the current thread’s thread group and its subgroups
Synrax :

public static int activeCount()

    Returns:
    an estimate of the number of active threads in the current
    thread's thread group and in any other thread group that has
    the current thread's thread group as an ancestor

2. checkAccess() :  java.lang.Thread.checkAccess() Determines if the currently running thread has permission
                    to modify this thread

Syntax:

public final void checkAccess()

    Throws:
    SecurityException - if the current thread is not allowed to
    access this thread.


3. clone() :java.lang.Thread.clone() Throws CloneNotSupportedException as a Thread can not be
            meaningfully cloned

Syntax:

protected Object clone() throws CloneNotSupportedException

    Throws:
    CloneNotSupportedException - always
    Returns:
    a clone of this instance



4. currentThread() :  java.lang.Thread.currentThread() Returns a reference to the currently
                     executing thread object
Syntax:

public static Thread currentThread()

    Returns:
    the currently executing thread

 */

public class ThreadRun  {
    public static void main(String[] args) {



        Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
        System.out.println("Starting Runnable Threads");

        t1.start();
        t2.start();
        System.out.println("Runnable Threads have been started");
        Thread t3 = new MyThread("t3");
        Thread t4 = new MyThread("t4");
        System.out.println("Starting MyThreads");
        t3.start();
        t4.start();
        System.out.println("MyThreads have been started");






    }


}
