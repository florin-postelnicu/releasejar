package com.examples.hello;

//java program demonstrating accessing
// a static nested class
class OuterClass
{
    // static member
    static int outer_x = 10;

    //instance(non-static) member
    int outer_y = 20;

    //private member
    private static int outer_private = 30;

    // static nested class
    static class StaticNestedClass
    {
        void display(){
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);
            // can access display private dtatic member of outer class
            System.out.println("outer_private = " + outer_private);

            //the following statement will give compilation error
            //as static nested classes cannot directly access non-static members
            //System.out.println("outer_y " + outer_y)
        }
    }
}
//driver class
public class StaticNestedClassDemo{
    public static void main(String[] args) {
        //accessing a static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

        nestedObject.display();
    }
}