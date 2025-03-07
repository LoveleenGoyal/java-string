import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String input = sc.nextLine();
		
		int[] count = countVowelsAndConsonants(input);
		
		System.out.println("Number of vowels: " + count[0]);
		System.out.println("Number of consonants: " + count[1]);
		System.out.println("Number of character that are not letters: " + count[2]);
		
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
	Enter the String: vowels and consonants
	Number of vowels: 6
	Number of consonants: 13
	Number of character that are not letters: 2

 */