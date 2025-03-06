import java.util.Random;
import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number students: ");
        int numStudents = sc.nextInt(); 

        // Generate random scores
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, percentage
        double[][] stats = calculateStatistics(scores);

        // Calculate grades
        String[] grades = calculateGrades(stats);

        displayScoreCard(scores, stats, grades);
		sc.close();
    }

    // Generate random scores for PCM subjects (Physics, Chemistry, Math)
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(41) + 30; 
            scores[i][1] = rand.nextInt(41) + 30; 
            scores[i][2] = rand.nextInt(41) + 30; 
        }
        return scores;
    }

    // Calculate total, average, and percentage
    public static double[][] calculateStatistics(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round(average * 100.0) / 100.0; 

            stats[i][0] = total;
            stats[i][1] = average;
            stats[i][2] = percentage;
        }
        return stats;
    }

    // Determine grades based on percentage
    public static String[] calculateGrades(double[][] stats) {
        int numStudents = stats.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = stats[i][2];

            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Display scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("--------------------------------------------------------------");
        System.out.println(" ID | Physics | Chemistry | Math | Total | Avg  | %   | Grade");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf(" %2d |   %3d   |    %3d    |  %3d |  %3.0f  | %.2f | %.2f |  %s  \n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
        System.out.println("--------------------------------------------------------------");
    }
}
