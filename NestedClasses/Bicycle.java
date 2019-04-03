package com.examples.hello;

public class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public  int speed;

    // the Bicycle class has one constructor
    public Bicycle( int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }
    //toString() method to print info about Bicycle
    public String toString()
    {
        return("Number of gears are " + gear +"\n" +
                "speed of bicycle is  " + speed);
    }
}
class MountainBike extends Bicycle{
    public int seatHeight;
    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight)
    {
        // invoking base-class (Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString()
    {
        return(super.toString() + "\nseat height is " + seatHeight);
    }

}

class SuperBikes extends MountainBike{
    public int wheelSize;

    // the SuperBike class has one constructor
    public SuperBikes(int gear, int speed, int startHeight, int newSize)
    {
        //invoking MountainBike class constructor
        super(gear, speed, startHeight);
        wheelSize = newSize;

    }
    // the new class adds also a method
    public void whellsThick(int newerValue)
    {
        wheelSize = newerValue;
    }
    // overriding the MB toString()
    @Override
    public String toString()
    {
        return(super.toString() + "\nsize of the tires" + wheelSize);
    }

}


