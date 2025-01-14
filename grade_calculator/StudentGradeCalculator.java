import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subjects = 5;
        int[] marks = new int[subjects];
        int total = 0;
        
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        double average = total / (double) subjects;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
