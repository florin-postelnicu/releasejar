package com.exercises.javaprograms;

/* This class implements a "fail_soft" array wich prevents
runtime errors.
 */
public class FailSoftArray {
    private int a[] ; // reference to array
    private int errval; // value to return if get() fails
    public int length; // length is public

    /* Construct array given its size and the value to
    return if get() fails
     */

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }
    // Returning value at given index
    public int get(int index) {
        if(indexOK(index)) return a[index];
        return  errval;
    }
    // Put a value at an index. Return false on failure.
    public boolean put(int index, int val){
        if(indexOK(index)) {
            a[index] = val;
            return  true;
        }
        return  false;
    }
    // Return true if index is within the bounds.
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

// Demonstrate the fail_soft array

class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // show quite failures
        System.out.println(" Fail Quietly");
        for(int i=0; i< (fs.length*2); i++)
            fs.put(i, i*10); // access to array through accessor methods

        for(int i=0; i < (fs.length*2); i++){
            x = fs.get(i);
            if(x != -1) System.out.println((x + " "));
        }
        System.out.println(" ");

        // now, handle failures
        System.out.println("\nFail with error reports.");
        for(int i=0; i <(fs.length*2); i++)
            if (!fs.put(i, i*10))
                System.out.println("Index " + i + " out-of-bounds");


        for(int i=0; i <(fs.length*2);i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
            else
                System.out.println("Index " + i + " out- of - bounds");
        }
        }
    }
