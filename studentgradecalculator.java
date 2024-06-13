import java.util.Scanner;
public class studentgradecalculator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Number of subjects");
        int numofsubjects = scr.nextInt();

        int totalmarks = 0;
        for (int x = 1; x <= numofsubjects; x++) {
            System.out.print("marks in different subject" + x);
            int mark = scr.nextInt();
            totalmarks += mark;
        }
        double avgpercentage = (double) totalmarks / (numofsubjects * 100) *100;
        char grade;
        if (avgpercentage >= 90) {
            grade = 'A';
        } else if (avgpercentage >= 80) {
            grade = 'B';
        }  else if (avgpercentage >= 70) {
            grade = 'C';
        }  else if (avgpercentage >= 60) {
            grade = 'D';
        }  else if (avgpercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks Obtained: " + totalmarks);
        System.out.println("Avg. Percentage Obatined: " + avgpercentage);
        System.out.println("Grade: " + grade);
        scr.close();
    }
}