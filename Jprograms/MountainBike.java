package com.exam.bicycle;


public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
    }

    public void seatHeight(int newValue) {
        seatHeight = newValue;


    }
    void printFeatures( int a, int b, int c, int d){
        MountainBike mb = new MountainBike(a, b, c, d);
        System.out.println(mb.seatHeight);
        System.out.println(mb.cadence);
        System.out.println(mb.speed);
        System.out.println(mb.gear);

    }

}