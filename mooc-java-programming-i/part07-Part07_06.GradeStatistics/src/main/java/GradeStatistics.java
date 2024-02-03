import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> grades;
    private int[] gradeDistribution = new int[6];

    public GradeStatistics() {
        this.grades = new ArrayList<>();
        this.gradeDistribution = new int[]{0,0,0,0,0,0};
    }

    public void addGrade(int value) {
        if(value >= 0 && value <= 100) {
            this.grades.add(value);
            this.addDistribution(value);
        }
    }

    public void addDistribution(int value) {
        if(value < 50) {
            this.gradeDistribution[0] += 1;
        } else if (value < 60) {
            this.gradeDistribution[1] += 1;
        } else if (value < 70) {
            this.gradeDistribution[2] += 1;
        }else if (value < 80) {
            this.gradeDistribution[3] += 1;
        }else if (value < 90) {
            this.gradeDistribution[4] += 1;
        }else if (value <= 100) {
            this.gradeDistribution[5] += 1;
        }
    }

    public String average(ArrayList<Integer> array) {
        int sum = 0;
        for(int grade: array) {
            sum += grade;
        }
        if (sum == 0) {
            return "-";
        }
        return String.valueOf(sum /(double) array.size());
    }

    public int[] getDistribution() {
        return this.gradeDistribution;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public ArrayList<Integer> getPassingGrades() {
        ArrayList<Integer> passingGrades = new ArrayList<>();
        for(int grade: this.getGrades()) {
            if(grade >= 50) {
                passingGrades.add(grade);
            }
        }
        return passingGrades;
    }

    public double passPercentage() {
        return (100 * this.getPassingGrades().size()) / (double) this.getGrades().size();
    }
    
}
