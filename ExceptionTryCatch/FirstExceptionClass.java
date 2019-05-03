package imagesandsounds;
import javax.sound.midi.*;
import java.util.Scanner;
import java.util.Scanner.*;
/*
1) A method can throw an exception when something fails at runtime
2) An exception is always an object of type Exception.(The object is from a class that
 has Exception somhwere up its inheritance tree)

3) The compiler doesn't pay attention to exceptions of type RuntimeExceptio
4) All exception delt with at compiling time are 'checked exceptions'. Only RuntimeEx
are excluded from compiler checking. All other exceptions should be acknowledged
in your code.

5) A method throws an exception with the keyword throw, followed by a new exception object:
            throw new BadException();
6) Methods that might throw a checked exception must announce it with a throws Exception declaration.

            public void takeRisk() throws BadException

7) If your code calls a checked-exception-throwing method , it must
reassure the compiler that precautions have been taken.

8) If you are prepared to handle the exception , wrap the call in a try-catch,
and put your exception handling/recovery code in the catch block.

9) If you are not prepared to handle the exception, you can make the compiler
'ducking' the exception.

 */


public class FirstExceptionClass {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a sequencer");
        } catch (MidiUnavailableException me){
            // in the catch block put the alternative(s) to the
            // exception that was thrown
            me.printStackTrace();
        }
    }

    public void takeRisk() throws BadException {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the text or press ENTER");
        int abandonAllHope = console.nextInt();
        if (abandonAllHope != 2) {
            throw new BadException();
//
        }
    }

    public void crossFingers() {
        try {
            FirstExceptionClass mt1= new FirstExceptionClass();
            System.out.println();
            mt1.takeRisk();

        }catch (BadException ex){
            System.out.println("Arrrgh");
//            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        FirstExceptionClass mt = new FirstExceptionClass();
        mt.crossFingers();
        mt.play();
    }
}
class BadException extends Throwable {


    public BadException (){
        System.out.println("You stipped");


    }


}