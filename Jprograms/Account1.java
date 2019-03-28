package com.exam.bicycle;
/*
this keyword is used to refer to the instance variables of the current class.
So in the above example by writing this.name = name, this.name refers to the instance variable
whereas name on the right side of the equality operator (=) refers to the parameter value.
So the value of parameter gets assigned to the instance variable.
Thus, "Peter" gets stored in the instance variable 'name' and '5000' gets stored in the instance variable 'balance'.
 */

public class Account1 {
    String name;
    int balance;
    Account1(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
    void printInfo(){
        System.out.println("Name : " + name + " Balance : " + balance);
    }
}
class This1
{
    public static void main(String[] args) {
        Account1 ac = new Account1("Peter ", 5001);
        ac.printInfo();
    }
}