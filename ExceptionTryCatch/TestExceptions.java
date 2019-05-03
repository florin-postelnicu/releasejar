package imagesandsounds;
import java.util.Scanner;

public class TestExceptions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 1;
        boolean good = true ;

        while(count <= 3 && good ){

            System.out.println("Enter the Passowrd" + " You have Only 3 attempts " + "attempts = "+ count);

            String test = console.nextLine();

            try {
                System.out.println("start try");
                doRisky(test);
                System.out.println("end try");
                good = false;

            } catch (ScaryException se) {
                System.out.println("scary exception");
            } finally {
                System.out.println("finally");
            }
            System.out.println("end of main");
            count++;
        }

    }
    static void doRisky(String test ) throws ScaryException{
        System.out.println("start risky");
        if ("gotosleeplittlebaby".equals(test)){
            throw new ScaryException();
        }
        System.out.println("end risky");
        return;

    }
}
class ScaryException extends Throwable {
    public ScaryException(){
        System.out.println("Your mama's gone awy and your daddy's gonna stay");
        System.out.println();
        System.out.println("Didn't leave nobody but the baby");
    }

}