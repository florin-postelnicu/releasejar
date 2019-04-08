package com.exercises.javaprograms;

public class PublicVersusPrivate {

    private int alpha;// private access
    public  int beta;// public access
    int gamma; // default access

    /* Merthods to to access alpha. It is OK for a
    member of a class to access a private member
    of the same class.
     */

    void setAlpha(int a) {
        alpha = a;
    }
    int getAlpha() {
        return alpha;
    }

}

class AccessDemo {
    public static void main(String[] args) {
        PublicVersusPrivate ob = new PublicVersusPrivate();

        /* Access to alpha is allowed only through
        its accessor methods
         */

        ob.setAlpha(-99);
        System.out.println("ob.alpha is  " + ob.getAlpha());

        // You can't access alpha like this:
        // ob.alpha = 10; Because alpha is private

        // These are OK because beta, gamma are public:
        ob.beta = 88;
        ob.gamma = 99;
        System.out.println("ob.beta is " + ob.beta);
        System.out.println("ob.gama is   " + ob.gamma);
    }
}
