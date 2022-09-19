package Encapsulation;

import java.util.Scanner;

public class Encapsulation {

    public static void main(String[] args){

        UserInfo user = new UserInfo(0001,"default","default" , "default" );

        //For Setting username once, firstname and lastname always, but default user id
        int answe = 1;
        while(answe == 1){
        System.out.println("Welcome to Text Game!!!");
        Scanner playerInfo = new Scanner(System.in);
        System.out.println("Enter Username!!!");
        String username =  playerInfo.next();
        user.setUserName(username);

        System.out.println("Enter Firstname!!!");
        String userfirstname = playerInfo.next();
        user.setFirstName(userfirstname);

        System.out.println("Enter lastname!!!");
        String userlastname = playerInfo.next();
        user.setLastName(userlastname);

        System.out.println("\n UserID :" + user.getUserID() + "\n Username :" + user.getUserName() +
                 "\n Firstname :" + user.getFirstName() + "\n Lastname :" + user.getLastName() +"\n\n");



        System.out.println("Do you want to try in again?: 1 yes 2. no ");
        answe = playerInfo.nextInt();

        }





//        user.setUserID(1245);
//        int id = user.getUserID();
//        System.out.println(randUserid);
    }
}
