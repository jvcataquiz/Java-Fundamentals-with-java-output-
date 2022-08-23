import java.util.Scanner;
public class hello {
    public static void main(String[] args){
    String greetings ="Hello ";
        Scanner userInputs = new Scanner(System.in);
        System.out.println( "Enter text : ");


    String output =  userInputs.next();



        System.out.println(greetings + output);


    }
}
