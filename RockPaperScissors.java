import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, computerWins = 0, totalGames = 0;
        
        while (true) {
            System.out.print("Enter your choice (Rock, Paper, Scissors) or 'exit' to quit: ");
            String userChoice = sc.nextLine();
            
            if (userChoice.equalsIgnoreCase("exit")) {
                break;
            }
            
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + winner);
            
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
            
            totalGames++;
        }
        
        if (totalGames > 0) {
            String[][] statistics = calculateStatistics(userWins, computerWins, totalGames);
            displayResults(statistics);
        }
        
        sc.close();
    }

    // Method to get computer's choice
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int index = new Random().nextInt(3);
        return choices[index];
    }

    // Method to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equals("Scissors") && computerChoice.equals("Paper")) ||
                   (userChoice.equals("Paper") && computerChoice.equals("Rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate and return win percentages
    public static String[][] calculateStatistics(int userWins, int computerWins, int totalGames) {
        double userWinPercentage = (double) userWins / totalGames * 100;
        double computerWinPercentage = (double) computerWins / totalGames * 100;
        return new String[][] {{"User Wins", String.valueOf(userWins)},
                               {"Computer Wins", String.valueOf(computerWins)},
                               {"User Win %", String.format("%.2f", userWinPercentage)},
                               {"Computer Win %", String.format("%.2f", computerWinPercentage)}};
    }

    // Method to display game results and statistics
    // Method to display game results and statistics
    public static void displayResults(String[][] statistics) {
        System.out.println("\nGame Statistics:");
        for (String[] stat : statistics) {
            System.out.printf("%-15s: %s\n", stat[0], stat[1]);
        }
    }
}
/* 
	Enter your choice (Rock, Paper, Scissors) or 'exit' to quit: rock
	Computer chose: Scissors
	Winner: Computer
	Enter your choice (Rock, Paper, Scissors) or 'exit' to quit: paper
	Computer chose: Rock
	Winner: Computer
	Enter your choice (Rock, Paper, Scissors) or 'exit' to quit: rock
	Computer chose: Rock
	Winner: Computer
	Enter your choice (Rock, Paper, Scissors) or 'exit' to quit: Rock
	Computer chose: Scissors
	Winner: User
	Enter your choice (Rock, Paper, Scissors) or 'exit' to quit: Scissors
	Computer chose: Rock
	Winner: Computer
	Enter your choice (Rock, Paper, Scissors) or 'exit' to quit: Paper
	Computer chose: Paper
	Winner: Draw
	Enter your choice (Rock, Paper, Scissors) or 'exit' to quit: exit

	Game Statistics:
	User Wins      : 1
	Computer Wins  : 4
	User Win %     : 16.67
	Computer Win % : 66.67

 */
