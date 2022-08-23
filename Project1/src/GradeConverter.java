import java.util.Scanner;

public class GradeConverter {

    public static  void main(String[] args){
        System.out.println("Welcome to GradeConverter App \n\n");
        Scanner numberSubject = new Scanner(System.in);
        System.out.println("How many subject you had this sem? ");
        int number_Subject = numberSubject.nextInt();
        int[] noSubj = new int[number_Subject];
        String[] nameSubj = new String[number_Subject];
        Double[] gradeSubj = new Double[number_Subject];
        for(int i = 0; i < number_Subject ; i++){
            System.out.println("\n\n Enter name of the Subject: ");
            Scanner nameSubject = new Scanner(System.in);
            nameSubj[i] = nameSubject.nextLine();
            System.out.println((i+1) + ".) What is your Grades in " + nameSubj[i] + " ?");
            Scanner gradeSubject = new Scanner(System.in);
            gradeSubj[i] = gradeSubject.nextDouble();
        }
        double average = 0.0;
        double sum = 0.0;
        for (int i =0 ; i < gradeSubj.length ; i++){
            sum = sum + gradeSubj[i];
        }
        average = (sum/ noSubj.length);
        System.out.println("Total Sum: " + sum);
        System.out.println("Total Average: " + average);
        System.out.println("\n What is the Passing Grade? ");
        double passingGrade = numberSubject.nextDouble();
        if ( average >= passingGrade ){
            System.out.println("\n\n Congrats for Passing this Semester!!! ");
        }else{
            System.out.println("\n\n Sorry!!! You Failed this Semester ");
        }
    }
}
