package com.exam.bicycle;

/*
We use this keyword to invoke a class constructor inside another class constructor.
 */
public class Accounter {
    String name;
    int balance;
    Accounter(String n){
        name = n;
        System.out.println("Happy coding");

    }
    Accounter(String n, int b){
        this(n);
        balance = b;
    }
    void printInfo(){
        System.out.println("Name : " + name + " balance : " + balance);
    }
}
class This6{
    public static void main(String[] args) {
        Accounter acer = new Accounter("Petia ", 6000);
        acer.printInfo();
    }
}
/*
Output
In the above example, when we made the object ac of class Account, the constructor with two parameters was called.
The first statement inside this constructor is this(n). Here, 'this' keyword calls the constructor
 with the String parameter. So, when the constructor with a String and an int called this(n)
 ( constructor with a String ), firstly, n was assigned to name ( in the first constructor )
 and then b was assigned to balance.
 You must have understood the rest of the code.
 */