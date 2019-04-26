package mypackage01;

/*
1) How to think multithreaded
2) How to protect your methods and variables from unintended thread conflicts
3) How to create, start, and stop threads and threads classes
4) How the scheduler works in Java
 */

public class MyMultiThreadOne {
    int crucialValue ;

    public synchronized void countMe() {
        crucialValue += 1;
    }

    public int howMany() {
        return crucialValue;
    }


    public static void main(String[] args) {
        MyMultiThreadOne mt1 = new MyMultiThreadOne();
        mt1.countMe();

        System.out.println(mt1.howMany());
        mt1.countMe();
        System.out.println(mt1.howMany());
    }
}