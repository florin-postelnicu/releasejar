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
        Testlength Tl = new Testlength();
        Tl.setSt();
        System.out.println("The String is " + Tl.getSt() + " \nand its length is " + Tl.getSt().length());
    }

}
