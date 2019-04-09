package com.exercises.javaprograms;

// Use accessor methods to set and get private members

// A class for two dimensional objects
class TwoDShape {
    private double width;
    private double height;
    // Parameterized constructor.
    TwoDShape( double w, double h){
        width = w;
        height = h;
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

    Triangle( String s, double w, double h) {
        super(w, h); // call superclass constructor
        style = s;
    }
    double area() {
        return getWidth() * getHeight()/2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
public class Shape2Constructors {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("filled", 4.0 , 4.0);
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);

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
    }
}
