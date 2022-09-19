package Constructor;
import  java.util.Scanner;
public class Constructors {
    public static void main(String[] args){


        System.out.println("WELCOME TO GROCERY!!!");
        System.out.println("How Many Grocery you want to Put!!!");
        Scanner items = new Scanner(System.in);
        int itemsCount = items.nextInt();

        for (int i = 0; i < itemsCount; i++){
            System.out.println("Enter Item Name:");
            String itemName = items.next();
            System.out.println("Enter Item Price:");
            float itemPrice = items.nextFloat();
           Product product = new Product(itemName, itemPrice);
        }





    }
}
