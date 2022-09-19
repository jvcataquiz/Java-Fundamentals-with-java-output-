package StudentSimulation;

public class StudentInfo {
    String firstName;
    String lastName;
    String year;
    String course;
    String section;
    int midtermGrade;
    int finalGrade;
    StudentInfo(String firstName, String lastName, String year, String course, String section, int midtermGrade, int finalGrade){
    this.firstName = firstName;
    this.lastName= lastName;
    this.year = year;
    this.course = course;
    this.section =section;
    this.midtermGrade = midtermGrade;
    this.finalGrade = finalGrade;
    }
    void introduceSelf(){
        System.out.println(firstName +  ": I am " + firstName +" " + lastName + ", "+ course +" " + year + " "+ section );
    }
    void evaluateGrade( StudentInfo grade){
        int finalOutput = (grade.midtermGrade + grade.finalGrade)/2;
        if (finalOutput >= 95){
            System.out.println("Hey "+ grade.firstName + ", You have Honor and Passed!!! with a grade of " + finalOutput + " %");
        }
        else if(finalOutput >= 75){
            System.out.println("Hey "+ grade.firstName + ", You Passed!!! with a grade of " + finalOutput + " %");
        }
        else{
            System.out.println("Hey "+ grade.firstName + ", You Failed!!! with a grade of " + finalOutput + " %");
        }

    }
}
