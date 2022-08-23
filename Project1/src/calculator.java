import java.util.Scanner;

public class calculator {

    public static void  main(String[] args) {
       int answe = 1;
        Scanner userInputs = new Scanner(System.in);
        while(answe == 1){
            System.out.println("Simple Calcu \n\n");
            System.out.println("Choose a number: \n 1. Add \n 2. Subract \n 3. Multiple \n 4 Divide");

            Scanner Numbers = new Scanner(System.in);
            System.out.println("Enter Operation, First and Second number: ");
            int user_Input =  userInputs.nextInt();
            int firstNumber = Numbers.nextInt();
            int SecondNumber = Numbers.nextInt();
            choose(user_Input, firstNumber, SecondNumber);
            System.out.println("Do you want to try in again?: ");
            answe = Numbers.nextInt();
        }


    }


    public static void choose(int x, int a, int b){
        int finalouput;
        switch (x)
        {
            case 1:
                System.out.println( "\n Addition \n");
                finalouput = a + b;
                System.out.println( "Answer: " + finalouput);
                break;
            case 2:
                System.out.println( "\n Subtraction \n");
                finalouput = a - b;
                System.out.println( "Answer: " + finalouput);
                break;
            case 3:
                System.out.println( "\n Multiplication \n");
                finalouput = a * b;
                System.out.println( "Answer: " + finalouput);
                break;
            case 4:
                System.out.println( "\n Division \n");
                finalouput = a - b;
                System.out.println( "Answer: " + finalouput);
                break;
            default:
                System.out.println( "\n Error!!!");
                break;

        }

    }


}
