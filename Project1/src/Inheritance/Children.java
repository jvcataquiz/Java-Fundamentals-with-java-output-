package Inheritance;

public class Children extends  Person{
      String favGame;
    Children(String name, String sex, int age, String favGame){
        super(name, sex, age);
        this.favGame = favGame;
    }
    void getInfo(){
        super.getInfo();
        System.out.println(name + " Favorite game: " + favGame);

    }
 void drinkMilk(){
     System.out.println("Dringking Milk");
 }
}
