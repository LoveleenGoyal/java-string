import java.util.Scanner;

public class VowelConsonantIdentifier {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String[][] analysis = analyzeString(input);
        displayResults(analysis);
        
        sc.close();
    }

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if it is uppercase
        if (ch >= 'A' && ch <= 'Z') {
			ch = (char) (ch + 32); 
		}
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    // Method to analyze the string and store results in a 2D array
    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        
        return result;
    }

    // Method to display the result in a tabular format
    public static void displayResults(String[][] result) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        for (String[] entry : result) {
            System.out.printf("%-10s %-15s%n", entry[0], entry[1]);
        }
    }
}
/*
	I/P:	
		Enter a string: What's happening today?
	O/P:
		Character  Type
		W          Consonant
		h          Consonant
		a          Vowel
		t          Consonant
		'          Not a Letter
		s          Consonant
				   Not a Letter
		h          Consonant
		a          Vowel
		p          Consonant
		p          Consonant
		e          Vowel
		n          Consonant
		i          Vowel
		n          Consonant
		g          Consonant
				   Not a Letter
		t          Consonant
		o          Vowel
		d          Consonant
		a          Vowel
		y          Consonant
		?          Not a Letter

 */
