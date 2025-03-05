import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt() method
    public static String createSubstringCharAt(String str, int start, int end) {
        String substring = new String();
        for (int i = start; i < end; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStringsCharAt(String str1, String str2) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = sc.next();
        System.out.print("Enter start index: ");
        int startIndex = sc.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = sc.nextInt();

        String charAtSubstring = createSubstringCharAt(inputString, startIndex, endIndex);
        String builtInSubstring = inputString.substring(startIndex, endIndex);

        // Comparing the two substrings
        boolean comparisonResult = compareStringsCharAt(charAtSubstring, builtInSubstring);

        // Displaying results
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using built-in substring(): " + builtInSubstring);
        System.out.println("Substrings match: " + comparisonResult);

        sc.close(); 
    }
}
