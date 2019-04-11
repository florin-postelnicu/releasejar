package com.exercises.javaprograms;
/*
Polymorphism and Inheritance in Java

Overridden methods allow Java to support run-time polymorphism (dynamic method dispatch).
Polymorphism is essential to object-oriented programming for one reason:
it allows a general class to specify methods that will be common to all of its derivatives,
while allowing subclasses to define the specific implementation of some or all of those methods.
 Overridden methods are another way that Java implements the “one interface, multiple methods” aspect of polymorphism.
 Part of the key to successfully applying polymorphism is understanding that the superclasses and subclasses
 form a hierarchy that moves from lesser to greater specialization.
 Used correctly, the superclass provides all elements that a subclass can use directly.
 It also defines those methods that the derived class must implement on its own.
 This allows the subclass the flexibility to define its own methods, yet still enforces a consistent interface.
Thus, by combining inheritance with overridden methods,
 a superclass can define the general form of the methods that will be used by all of its subclasse
 */
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

    // This method will be overridden in subclass Tigers
    void showCharacter() {
        System.out.println("The Name is :" + name + "\n Age is " + age + "\n Area in acres needed is :" + area);
    }
    // This method will be overridden in Felines , and Cats subclasses
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
    void showKinship(){
        System.out.println("In top of everything,  I am a COOL Cat!");
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




        //When an overridden method is called through a superclass reference, Java determines which version
        // of the method to execute (Dynamic Method Dispatch) based upon the type of the object being referred to
        // It is the type of the object being referred to (not the type of the reference variable) that
        // determines which overridden method is executed.

        //Therefore, if a superclass contains a method that is overridden by a sublcass, then when different
        // types of objects are referred to through a superclass reference variable,
        // different versions of the methods are executed.


        zizi.showKinship();
        zizi.showKinship(" I am a Feline, and my name is :");
        AnimalsMam katie = zizi;// This shows that when creating katie as a variable for the superclass AnimalsMam,
                                // referencing an object(zizi) from the subclass Felines-Cats,
                                // the showKinship() method from Cats overrides the homonymous method in superclass.
        katie.showKinship();
        AnimalsMam darnel = tg1;
        darnel.showKinship();
        System.out.println();
        System.out.println(katie.getClass());
        System.out.println();
        System.out.println(katie.equals(zizi));
        System.out.println();
        System.out.println(zizi.toString());
        System.out.println(zizi);

        // Cats miaunel = tiggy; it is not going to compile,
        // Incompatible types, a reference variable of class type can not
        // refer to an object of another class type


    }

}
