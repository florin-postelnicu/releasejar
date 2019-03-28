package com.exam.bicycle;

/*
this keyword is used to represent the current object. As in the previous example,
 since method1 has the object of class as parameter, so when it was called inside method2,
 we passed this keyword as its argument in place of the object of the class.

Similarly, we can return this keyword instead of returning object of any class.
Here, we returned this in getObj() method.
Now, since object r1 called the 'getObj' method and this keyword represents the current object,
 here this keyword is used to represent the object r1. Thus by writing return this,
 we are returning object r1 and by writing r2 = r1.getObj(), we are assigning object r1 to object r2.
 Thus, the length and breadth of r2 also become 15 and 20 respectively.
 */

public class Rectangle {
    int length, breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;

    }
    Rectangle getObj(){
        return this;
    }
}
class This5{



    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(15, 20);
        Rectangle r2 ;
        r2 = r1.getObj();
        System.out.println("length : " + r1.length + " breadth : " + r1.breadth);
        System.out.println("Length : " + r2.length + " breadth : " + r2.breadth);
    }

}
