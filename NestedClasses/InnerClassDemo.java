package com.examples.hello;

// Java program to demonstrate accessing
// an inner class

//outer class
class OuterClass1
{
    // static member
    static int outer_x = 10;

    // instance non-static member
    int outer_y = 10;

    // private member
    private int outer_private = 39;

    // inner class
    class InnerrClass
    {
        void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            //can also access non-static members of outer class
            System.out.println("outer_y = " + outer_y);

            //can also access private members of the outer class
            System.out.println("Outer_private = " + outer_private);

        }
    }
}
// Driver class
public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass1 outerObject = new OuterClass1();
        OuterClass1.InnerrClass innerObject = outerObject.new InnerrClass();

        innerObject.display();
    }
}
