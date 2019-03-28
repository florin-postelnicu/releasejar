package com.exam.bicycle;

/*
this keyword can also be passed as an argument to some method in a class.
It is used to represent an object of that class.

The following example will make it clear.
 */
public class Methodic {
    void method1(Methodic m1){
        System.out.println("This is method 1");
    }
    void method2(){
            method1(this);
    }
}
class This3
{
    public static void main(String[] args) {
        Methodic m = new Methodic();
        m.method2();
    }
}
/*
Output
In the above example, method1 is called inside method2. Since method1 had an object of its class as its parameter,
 so while calling it inside method2, we passed this keyword as its argument.
 So, it will pass the current instance of the class Method with which we are dealing at that time.
 */