package com.exam.bicycle;

public class Account {
    String name;
    int balance;

    Account(String n, int b) {
        name = n;
        balance = b;
    }

    void printInfo() {
        System.out.println("Name: " + name + " balance " + balance);
    }
}
class This0
    {
        public static void main(String[] args) {
            Account ac = new Account("Peter", 5000);
            ac.printInfo();
        }
    }

