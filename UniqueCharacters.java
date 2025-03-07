import java.util.Scanner;

public class UniqueCharacters {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        char[] uniqueCharacters = findUniqueCharacters(input);
        
        displayUniqueCharacters(uniqueCharacters);
        
        sc.close();
    }
	
    // Method to find the length of the string without using length() method
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findStringLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to display unique characters
    public static void displayUniqueCharacters(char[] uniqueCharacters) {
        System.out.print("Unique characters: ");
		System.out.print("[");
        for (char c : uniqueCharacters) {
            System.out.print(c + ", ");
        }
		System.out.print("]");
        System.out.println();
    }
}

/* 
	I/P: Enter a string: Hello world
	O/P: Unique characters: [H, e, l, o,  , w, r, d]

 */
