
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics gradeStatistics = new GradeStatistics();

        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == -1) {
                break;
            }
            gradeStatistics.addGrade(userInput);
        }
        printPointAverage(gradeStatistics.average(gradeStatistics.getGrades()));
        printPassingPointAverage(gradeStatistics.average(gradeStatistics.getPassingGrades()));
        printPassPercentage(gradeStatistics.passPercentage());
        printGradeDistribution(gradeStatistics);
    }

    public static void printPointAverage(String value) {
        System.out.println("Point average (all): " + value);
    }

    public static void printPassingPointAverage(String value) {
        System.out.println("Point average (passing): " + value);
    }

    public static void printPassPercentage(double value) {
        System.out.println("Pass percentage: " + value);
    }

    public static void printGradeDistribution(GradeStatistics gradeStatistics) {
        System.out.println("Grade distribution:");
        System.out.println(gradeStatistics.getDistribution().toString());
        for(int i = 5; i >= 0; i--) {
            int value = gradeStatistics.getDistribution()[i];
            System.out.println(i + ": " + printStar(value));
        }
    }

    public static String printStar(int value) {
        String answer = "";
        for(int i = 0; i < value; i++) {
            answer += "*";
        }
        return answer;
    }
}
