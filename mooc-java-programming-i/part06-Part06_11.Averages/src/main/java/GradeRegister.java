
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public static int pointsToGrade(int points) {
        int grade = 0;

        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        int sum = 0; 
        int count = 0;
        for(int grade: this.grades) {
            count += 1;
            sum += grade;
        }
        return sum/(double) count;
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }
        int sum = 0; 
        int count = 0;
        for(int point: this.points) {
            count += 1;
            sum += point;
        }
        return sum/(double) count;
    }



    
}
