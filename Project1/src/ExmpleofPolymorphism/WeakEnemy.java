package ExmpleofPolymorphism;

public class WeakEnemy extends  Enemy{
    WeakEnemy(){
        name ="Jerry";
        hp = 50;
    }


    void sayDialog(){
        System.out.println("I am "+ name + "a weak enemy!." );

    }
}
