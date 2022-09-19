package StudentSimulation;

import java.util.Scanner;

public class StudentSimulation {
    public static void main(String[] args){
        StudentInfo student1 = new StudentInfo("Jerick", "Cataquiz", "2nd year","Computer", "1D", 75,100);
        student1.introduceSelf();
        student1.evaluateGrade(student1);
    }
}
