package IntroJavaSwing01.animationJ;

import java.util.*;
import java.util.Scanner;


public class ListImplement {
    private String Origtext;


    Scanner console = new Scanner(System.in);

//    public ListImplement(){
//        String Origtext;
//    }

    String getOrigtext() {return Origtext;}

    void setOrigtext (){
        Origtext = console.nextLine();
    }

    public static void main(String[] args) {
        List listA = new ArrayList();
        List listutza = new ArrayList();

        ListImplement LsT = new ListImplement();
        System.out.println("Enter your Text");
        LsT.setOrigtext();

        char[] stringToCharArray = LsT.getOrigtext().toCharArray();


        for (char let : stringToCharArray) {
            listA.add(let);
        }
        System.out.println("The OrigText is :" + LsT.getOrigtext());
        System.out.println(listA);
        int count = 0;
        for (Object element : listA){

            System.out.println("Element at index  " + count + "   is   "+ element);
            count++;
            listutza.add(element);
        }

        //convert a list to an Array

        System.out.println(listutza);
        //convert Array to list
        String stringy = "";
        for(Object elem : listutza){
            stringy+= elem;
        }
        System.out.println(stringy);





    }
}
