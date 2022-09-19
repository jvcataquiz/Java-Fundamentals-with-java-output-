package Encapsulation;

public class UserInfo {
    private int userID;
    private String userName;
    private String firstName, lastName;

UserInfo(int userID, String userName, String firstName, String lastName){
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        }


        //Setter you can overwrite data //this method can only access
        void setUserName( String username){
            this.userName = username;
        }
        void setFirstName(String firstName){
            this.firstName = firstName;
        }
        void setLastName(String lastName){
            this.lastName = lastName;
        }


     //getter to set display data
        int getUserID(){
             return  userID;
        }
        String getUserName(){
            return userName;
        }
        String getFirstName(){
            return firstName;
        }
        String getLastName(){
            return lastName;
        }

}
