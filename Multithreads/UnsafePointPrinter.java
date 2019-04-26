package mypackage01;

class Point{
    private float x, y;
    public float x(){
        return x;
    }
    public float y() {
        return y;
    }

}

public class UnsafePointPrinter {
    public void print(Point p){
        System.out.println("The point's x is : " + p.x() + " and y is :" + p.y() + ".");

    }

    public static void main(String[] args) {
        Point p = new Point();
        UnsafePointPrinter up = new UnsafePointPrinter();
        up.print(p);

    }
}
