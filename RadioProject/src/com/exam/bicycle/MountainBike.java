package com.exam.bicycle;


public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
    }

    public void seatHeight(int newValue) {
        seatHeight = newValue;
    }

}