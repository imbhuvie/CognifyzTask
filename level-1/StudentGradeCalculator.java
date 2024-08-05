
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Grades :");
        int numGrade=sc.nextInt();
        double[] gradeArray=new double[numGrade];
        double totalGrades=0;
        double avgGrade;
        System.out.println("Enter the grades :--");
        for(int i=0;i<numGrade;i++){
            System.out.print("Grade of subject "+i+" : ");
            gradeArray[i]=sc.nextDouble();
        }
        for(double grade:gradeArray){
            totalGrades+=grade;
        }
        avgGrade=totalGrades/numGrade;
        System.out.print("\nAverage Grade of " + numGrade +"Subjects are : "+avgGrade);
        System.out.println();
    }
}
