package ObjectMethod;

public class Character {
    String name, dialog;
    int hp, mp, lvl;

   Character( String name, String dialog, int hp,int mp, int lvl){
       this.name = name;
       this.dialog = dialog;
       this.hp = hp;
       this.mp = mp;
       this.lvl = lvl;

   }
   void introduce(){
       System.out.println(name + ": " + "I am " + name);
   }
    void sayDialog(){
        System.out.println(name + ": " + dialog);
    }
    void greet(String firstname){
        System.out.println(name + ": hello, " + firstname);
    }
    void talkTo(Character nameofCharacter){
        System.out.println(name + ": hello, " + nameofCharacter.name);
    }
}
