package IntroJavaSwing01.animationJ;
import java.util.Scanner;
public class Testlength {
    String St;
    Scanner console = new Scanner(System.in);

    String getSt() { return St;}
    public void setSt(){
        St = console.nextLine();
    }


    public static void main(String[] args) {
        System.out.println("Enter your String:");
        char[] car;


        Testlength Tl = new Testlength();
        Tl.setSt();
        car = new char[Tl.getSt().length()];
        System.out.println("The String is: " + Tl.getSt() + " \nand its length is " + Tl.getSt().length());

        for(int i=0; i< Tl.getSt().length(); i++){
            car[i] = Tl.getSt().charAt(i);
        }
        char[] stringToCharArray = Tl.getSt().toCharArray();
        String bezzo ;
        bezzo = "";

        for (char output : stringToCharArray){
            if (output == 'e')
            output = 'M';
            bezzo+= (output);
        }

        System.out.println(stringToCharArray);
        System.out.println(bezzo);

    }

}
