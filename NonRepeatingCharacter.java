import java.util.Scanner;

public class NonRepeatingCharacter {
	    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char firstNonRepeating = findFirstNonRepeatingCharacter(input);

        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }
	
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] charFrequency = new int[256]; 

        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null character if no unique character found
    }
}

/*
I/P: Enter a string: aabbcdde
O/P: First non-repeating character: c 
 */
