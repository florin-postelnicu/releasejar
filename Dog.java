package com.exam.bicycle;

public class Dog {

    String name;

    public static void main(String[] args) {
        String[] namesdoggy = {"Adam", "Bertha","Calypoie","Derange", "Fuscus", "Ementhal", "Gavriluta"};
        // make a dog object and access it

        String[] names;
        names = new String[7];
        names[0] = "Al";
        names[1] = "Bal";
        names[2] = "Chal";
        names[3] = "Duwal";
        names[4] = "Erdwal";
        names[5] = "Formhal";
        names[6] = "Bisciut";

        // now make a dog array
        Dog[] myDogs = new Dog[7];

        for( int i= 0; i<= 6; i++) {
            myDogs[i] = new Dog();
            myDogs[i].name = namesdoggy[i];}


        // loop through the array and tell all the dogs to bark
        int x = 0;
        while (x < myDogs.length){
            myDogs[x].bark();
            x = x+ 1;

        }
    }
    public void bark(){
        System.out.println(name + " says RUFF!");
    }

}
