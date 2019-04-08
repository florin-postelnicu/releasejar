package com.exercises.javaprograms;
/*
Primitive values are passed by value

 */

class PassByValue{
    /*
    This method causes no changes to the arguments
    used in the call
     */

    void noChange(int i, int j){
        i = i + j;
        j = - j;
    }
}
/*
Objects are passed by reference
 */

class PassByReference{
    int x1, y1;
    PassByReference(int i, int j) {
        x1 = i;
        y1 = j;

    }
    /*
    Pass an object. Now , ob.a and ob.b in object
    used in the call will be changed.
     */
    void change(PassByReference ob){
        ob.x1 = ob.x1 + ob.y1;
        ob.y1= - ob.y1;
    }
}
public class PassObValueRef {
    public static void main(String[] args) {
        // The values are 15, 20
        PassByValue obj = new PassByValue();
        int a = 15, b = 20;
        System.out.println("The values are 15, 20");
        System.out.println(" a and b before call: " + a + " " +b);
        obj.noChange(a,b);
        System.out.println("a and b after call : " + a +" "+ b);

        // The values are 15, 20
        PassByReference ob = new PassByReference(15, 20);
        System.out.println("The values are 15, 20 ");
        System.out.println("ob.a and ob.b before call : " + ob.x1 +" " + ob.y1);
        ob.change(ob);
        System.out.println("ob.a and ob.b after  call : " + ob.x1 +" " +ob. y1);

        // The values passed on are ob.x1, ob.y1 obtained by referencing ob

        PassByValue obj1 = new PassByValue();
        int a1 = ob.x1, b1 = ob.y1;
        System.out.println("The values passed on are ob.x1, ob.y1 obtained by referencing ob");
        System.out.println(" a and b before call: " + a1 + " " +b1);

        System.out.println("The values passed on are obj1.x1, ob.y1 obtained by referencing ob");
        obj1.noChange(a1,b1);
        System.out.println("a and b after call : " + a1 +" "+ b1);

        // The values passed on are ob.x1, ob.y1 obtained by referencing ob1

        PassByReference ob1 = new PassByReference(ob.x1, ob.y1);
        System.out.println("The values passed on are ob1.x1, ob.y1 obtained by referencing ob");
        ob1.change(ob1);
        System.out.println("ob1.a and ob1.b after  call : " + ob1.x1 +" " +ob1. y1);



    }
}
