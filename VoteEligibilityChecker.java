import java.util.Random;
import java.util.Scanner;

public class VoteEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[] ages = generateRandomAges(numStudents);
        String[][] eligibilityResults = checkVotingEligibility(ages);
        
        displayResults(eligibilityResults);
        
        sc.close();
    }

    // Method to generate random ages for n students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; 
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            results[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return results;
    }

    // Method to display the results in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age\tVoting Eligibility");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
/* 
	I/P:
		Enter the number of students: 10
	O/P:	
		Age     Voting Eligibility
		82      Can Vote
		14      Cannot Vote
		59      Can Vote
		89      Can Vote
		94      Can Vote
		18      Can Vote
		65      Can Vote
		39      Can Vote
		13      Cannot Vote
		25      Can Vote

 */
