package ObjectMethod;

import java.util.Scanner;

public class ObjectMethod {
    public static void main(String[] args){

    Character p1 = new Character("Mike","hi there!",100,100, 5);
    Character p2 = new Character("Joseph","hello there!",90,130, 15);
    Character p3 = new Character("Fia","hi!",100,10, 150);
    p1.sayDialog();
    p2.sayDialog();
    p1.introduce();
    p2.introduce();
    p1.greet("Jerick");
    p2.greet("Fia");
    p3.talkTo(p1);


    }
}
