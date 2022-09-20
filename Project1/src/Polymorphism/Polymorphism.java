package Polymorphism;

import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args){
    Animal dog1 = new Dog();
    Animal cat1 = new Cat();

    dog1.makeSound();
    cat1.makeSound();

    }
}
