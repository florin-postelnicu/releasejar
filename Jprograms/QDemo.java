package com.exercises.javaprograms;
/* the put index determines where the next element of data
will be stored


   the get index  indicates the location the next element of data
   will be obtained
   get operation is consumptive
 */


class Queue {
    char q[]; // this array holds the queue
    int putloc, getloc; // the put and get indecise

    // Queue constructor
    Queue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0; // initial settings fpr put and get
    }

    // put a character into the queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;

    }


    // get character from queue
    char get(){
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
// demonstrate the Qeue class

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue((4));
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // put some numbers into bigQ
        for(i=0; i< 26; i++)
            bigQ.put((char)('A'+ i));

        // retrieve and display elements from bigQ
        System.out.println("Contents of bigQ : ");
        for(i=0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.println(ch);


        }
        System.out.println("\n");
        System.out.println("Using smallQ to generate errors");
        for(i=0; i< 5; i++){
            System.out.println("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println("\n");

        // more errors on smallQ
        System.out.println("Contents of smallQ :   ");
        for(i=0; i<5; i++) {
            ch = smallQ.get();if( ch != (char) 0) System.out.println(ch);
        }

    }
}
