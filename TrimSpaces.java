import java.util.Scanner;

public class TrimSpaces {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();
        
        // Trim spaces using custom method
        int[] indices = findTrimIndices(input);
        String customTrimmed = createSubstring(input, indices[0], indices[1]);
        
        // Trim spaces using built-in trim() method
        String builtInTrimmed = input.trim();
        
        // Compare results
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);
        
        // Display results
        System.out.println("Custom Trimmed String: " + customTrimmed);
        System.out.println("Built-in Trimmed String: " + builtInTrimmed);
        System.out.println("Are both results same? " + isSame);
        
        sc.close();
    }
	
    // Method to determine start and end index after trimming spaces
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        
        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder trimmedString = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmedString.append(text.charAt(i));
        }
        return trimmedString.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
/* 
	I/P:
		Enter a string with leading and trailing spaces:     hello there!
	O/P:
		Custom Trimmed String: hello there!
		Built-in Trimmed String: hello there!
		Are both results same? true

 */
