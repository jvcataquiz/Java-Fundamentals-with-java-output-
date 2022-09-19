import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

   public static void main(String[] args){

       ArrayList<String> ToDoMorning = new ArrayList<String>();
       String todomorning = "Todo in the Morning:";
       System.out.println("Welcome to my ToDo List App");
         func1(todomorning,ToDoMorning);
         func2(ToDoMorning);
   }
    public static  void func1(String stringlist, ArrayList<String>  value1){
        Scanner userInput = new Scanner(System.in);
        System.out.println(stringlist);
        String userInputsString =  userInput.next() ;
        while(!userInputsString.equals("break")){
            value1.add(userInputsString);
            System.out.println("stringlist");
            userInputsString =  userInput.next() ;
        }

    }
   public static  void func2(ArrayList<String>  value2){
       int j = 1;
       for (String i : value2) {
           System.out.println(j++ + " " + i);
       }
   }
}
