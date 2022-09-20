package ExmpleofPolymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args){


        Enemy weakEnemy = new WeakEnemy();
        Enemy strongEnemy = new StrongEnemy();


        weakEnemy.sayDialog();
        weakEnemy.displayStat();
        strongEnemy.sayDialog();
        strongEnemy.displayStat();


    }
}
