package com.examples.hello;

public class TestBikes {
    public static void main(String[] args) {
        // using superclass reference
        // first approach
        Bicycle mb2 = new MountainBike(4,200,20);

        //using sub-class reference
        //second approach

        MountainBike mb1 = new MountainBike(3, 100, 25);

        System.out.println(" seat height of first bicycle is " + mb1.seatHeight);

        SuperBikes mb0 = new SuperBikes(7, 250,20, 45);

        // In case of overriden methods
        //always sub-class method
        // will be executed
        System.out.println(mb1.toString());
        System.out.println(mb2.toString());
        System.out.println(mb0.toString());
    }
}
