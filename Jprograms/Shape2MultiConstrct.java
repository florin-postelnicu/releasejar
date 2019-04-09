package com.exercises.javaprograms;

// Use accessor methods to set and get private members

// A class for two dimensional objects
//Add more constructors to TwoDShape
class TwoDShape {
    private double width;
    private double height;

    // A default constructor
    TwoDShape() {
        width = height = 0.0;
    }
    // Parameterized constructor.
    TwoDShape( double w, double h){
        width = w;
        height = h;
    }

    // A constructor for equal width and height
    TwoDShape( double x) {
        width = height = x;
    }

    // Accessor methods for width and height
    double getWidth() { return width;}
    double getHeight() { return height;}
    void setWidth( double w) { width = w;}
    void setHeight( double h) { height = h;}

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

}
// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    String style;

    //A default constructor
    Triangle() {
        super();
        style = "none";
    }

    // Constructor

    Triangle( String s, double w, double h) {
        super(w, h); // call superclass constructor
        style = s;
    }

    // One argument constructor

    Triangle(double x) {
        super(x);
        style = "filled";
    }
    double area() {
        return getWidth() * getHeight()/2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
public class Shape2MultiConstrct{
    public static void main(String[] args) {
        Triangle t1 = new Triangle("filled", 4.0 , 4.0);
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
        Triangle t3 = new Triangle(6.0);

//        t1.setWidth(4.0);
//        t1.setHeight(4.0);
//        t1.style = "filled";
//
//        t2.setWidth(8.0);
//        t2.setHeight(12.0);
//        t2.style = "outlied";

        System.out.println("Info for triangle t1");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area for t1 is :"  + t1.area());

        System.out.println();

        System.out.println("Info for triangle t2");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area for t2 is :" + t2.area());

        System.out.println();

        System.out.println("Info for triangle t3");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area for t3 is :" + t3.area());
    }
    }

