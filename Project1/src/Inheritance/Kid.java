package Inheritance;

public class Kid extends Children{
    String gradeLevel;
    Kid(String name, String sex, int age,String favGame, String gradeLevel){
        super(name, sex, age , favGame);
        this.gradeLevel = gradeLevel;

    }
    void getInfo(){
        super.getInfo();
        System.out.println(" Grade level: " + gradeLevel);

    }
}
