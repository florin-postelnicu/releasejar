package com.exercises.javaprograms;

class AnimalsMam{
    private String name;
    private int age;// Age
    private int area;// Area

    AnimalsMam(String s, int a, int b){
        name = s;
        age = a;
        area = b;
    }
    AnimalsMam( AnimalsMam ob){
        name = ob.name;
        age = ob.age;
        area = ob.area;
    }
    String getName(){ return name;}
    int getAge() { return age;}
    int getArea(){ return area;}
    void setName(String s){ name = s;}
    void setAge(int a){ age = a;}
    void setArea(int b){ area = b;}

    // Display characteristics
    void showCharacter() {
        System.out.println("The Name is :" + name + "\n Age is " + age + "\n Area in acres needed is :" + area);
    }
    void showKinship(){
        System.out.println("I am an animal");
    }
}

class Felines extends AnimalsMam {
    String voice;

    Felines(String s, int a, int b, String v) {

    super(s,a,b);
    voice = v;
    }
    Felines ( Felines ob){
        super(ob);
        voice = ob.voice;
    }
    void showVoice() {
        System.out.println("The Feline says to you : " + voice);
    }
    void showKinship(String msg){
        System.out.println(msg + getName());
    }

}
class Cats extends Felines {
    String relation;
    int lives;
    Cats(String s, int a, int b, String voice, String r, int l){
        super(s,a,b,voice);
        relation = r;
        lives = l;
    }
    Cats( Cats ob){
        super(ob);
        relation = ob.relation;
        lives = ob.lives;
    }
    void showRelation() {
        System.out.println("Your cat is an inconspicuous  " + relation  + " with " + lives + " lives still to fulfil");
    }


}

class Tigers extends Felines{
    String pack;
    Tigers(String s, int a, int b, String v, String p){
        super(s, a, b, v);
        pack = p;
    }
    Tigers ( Tigers ob){
        super(ob);
        pack = ob.pack;

    }
    void showPack() {
        System.out.println("This Tiger belongs to the pack of " + pack);
    }
    @Override // It is good to use the annotation, since it informs the compiler
              // that the element is meant to override an element declared in superclass.
             //
             // Method overriding occurs only when the signatures of the two methods are identical.
            // If they are not, then the two methods are simply overloaded.
              // The Rules are:
              // If super it is used , then the method will be executed starting hierarchically;
              // from the parent down to the cild.
              //
               // If super is not used, then tha LAST definition of the method it is used across the program
               // here, the Tigers.showCharacter() will prevail for all calls.
    void showCharacter(){

        super.showCharacter();// Using super to have also the version form the superclass
                              // It is interesting to see what happens if this line is commented :
                              // all methods showCharacter(0  in the program will be overridden
                              // by this new one
        System.out.println("This tiger 's name is " + getName() + "\n at a tender time in life of " + getAge() +
                "\n and roaming an areal of " + getArea());
    }

}
public class RealAnimals {
    public static void main(String[] args) {
        Cats miau1 = new Cats("Miaurice", 7, 120," Miauuuu", "boss", 9);
        miau1.showCharacter();
        miau1.showRelation();
        miau1.showVoice();

        System.out.println();

        Tigers tiggy = new Tigers("Gerard", 9, 300, "Chhhh", "Siberian Club");
        tiggy.showPack();
        tiggy.showCharacter();
        tiggy.showVoice();

        System.out.println();

        // Generate an object in Super class using a reference from a child class
        AnimalsMam aman = miau1;
        aman.showCharacter();

        System.out.println();

        // Generate a new instance , zizi, using a Constructor with a previous object,
        // construct an object from another object
        Cats zizi= new Cats(miau1);
        // Modify some attributes
        zizi.setName("Zizi");
        zizi.relation = "Sleepy Cat";
        zizi.showCharacter();
        zizi.showRelation();

        System.out.println();

        // Generate tiron using the object tiggy
        Tigers tiron = new Tigers(tiggy);
        tiron.setName("Tiron");
        tiron.pack = "Serengety Low Lands";
        tiron.showVoice();
        tiron.showCharacter();
        tiron.showPack();

        // Using a subclass object to generate a new OBJ in the super class
        // Only the attributes ( members) of the super class would be "constructed"
        // in the new OBJ
        // A super class reference can refer to a subclass object
        AnimalsMam mman = tiron;
        mman.showCharacter();
        // Since name is a private variable  we use set and get
        mman.setName("ZITiger");
        mman.showCharacter();

        Felines felix = zizi;
        felix.setName("Felix Z Kath");
        felix.setAge(10);
        felix.setArea(200);
        felix.showCharacter();
        System.out.println(felix.getName());
        System.out.println(tiron.getArea());
        System.out.println(tiggy.getAge());

        Tigers tg1 = new Tigers(tiggy);
        // a getter can be used anyway in a program as long as the instance that refers to is already created
        tg1.setName(zizi.getName());
        System.out.println("tg1 tiger's name must be Zizi , but  it is   " + tg1.getName());

        // Overloading

        // The two methods bellow have different signature showKinship() - has no parameters,
        // showKinship(String msg) has a parameter named msg.


        zizi.showKinship();
        zizi.showKinship(" I am a Feline, and my name is :");
        // Cats miaunel = tiggy; it is not going to compile,
        // Incompatible types, a reference variable of class type can not
        // refer to an object of another class type


    }

}
