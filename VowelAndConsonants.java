import java.util.Scanner;

public class VowelAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String input = sc.nextLine();
		
		int[] counts = countVowelsAndConsonants(input);
        System.out.println("Total number of character in string: " + input.length());
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
		System.out.println("Remaining letters that are not letter: " + counts[2]);
		
		sc.close();
	}
	
	// Method to check if the character is vowel or consonant
	public static String checkCharacterType(char ch) {
		// Convert to lowercase if it is uppercase
        if (ch >= 'A' && ch <= 'Z') {
			ch = (char) (ch + 32); 
		}
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
        else if (ch >= 'a' && ch <= 'z') return "Consonant";
        else return "Not a Letter";
    }
	
	// Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
		int notLetterCount = 0;
        
        for (int i = 0; i < text.length(); i++) {
            String type = checkCharacterType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            } else if (type.equals("Not a Letter")) {
				notLetterCount++;
			}
        }
        
        return new int[]{vowelCount, consonantCount, notLetterCount};
    }
}
/* 
	I/P:
		Enter the String: What are you doing right now?
	O/P:
		Total number of character in string: 30
		Number of Vowels: 9
		Number of Consonants: 14
		Remaining letters that are not letter: 7

 */