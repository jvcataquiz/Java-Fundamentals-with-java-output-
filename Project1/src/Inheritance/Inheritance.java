package Inheritance;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args){
 Person person1 = new Person("Jerick Vegile","Male",20);
 Children children1 = new Children("Jerick Vegile Jr", "Male", 2, "Roblox");
  person1.getInfo();
  children1.getInfo();
  children1.drinkMilk();
  Kid Kid1 = new Kid("Vegile Jr", "Male", 2, "Roblox","Grade 3");

  Kid1.getInfo();

    }
}
