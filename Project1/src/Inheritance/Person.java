package Inheritance;

public class Person {
    String name, sex;
    int age;
    Person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;

    }
 void getInfo(){
     System.out.println("Name : "+  name);
     System.out.println("Sex : "+  sex);
     System.out.println("Age : "+  age);

 }
}
