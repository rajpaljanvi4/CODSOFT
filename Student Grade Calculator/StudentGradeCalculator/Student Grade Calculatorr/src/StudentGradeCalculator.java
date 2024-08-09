import java.util.Scanner;

public class StudentGradeCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the student's name:");
    String name = input.nextLine();

    System.out.println("Enter the student's scores in the following subjects:");
    System.out.println("Math:");
    double mathScore = input.nextDouble();

    System.out.println("Science:");
    double scienceScore = input.nextDouble();

    System.out.println("English:");
    double englishScore = input.nextDouble();

    System.out.println("History:");
    double historyScore = input.nextDouble();

    double averageScore = (mathScore + scienceScore + englishScore + historyScore) / 4;

    System.out.println("Student's name: " + name);
    System.out.println("Average score: " + averageScore);

    if (averageScore >= 90) {
      System.out.println("Grade: A");
    } else if (averageScore >= 80) {
        System.out.println("Grade: B");
    } else if (averageScore >= 70) {
        System.out.println("Grade: C");
    } else if (averageScore >= 60) {
        System.out.println("Grade: D");
    } else {
        System.out.println("Grade: F");
    }
}
}
    