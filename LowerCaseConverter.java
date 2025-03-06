import java.util.Scanner;

public class LowerCaseConverter {

    // Method to convert text to lowercase using charAt() and ASCII values
    public static String convertToLowerCase(String text) {
        String result = new String();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch; 
            }
        }
        return result.toString();
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = sc.nextLine();
        
        // Converting using custom method
        String customLowerCase = convertToLowerCase(inputText);
        
        // Converting using built-in method
        String builtInLowerCase = inputText.toLowerCase();
        
        // Compare and display results
		boolean isSame = compareStrings(customLowerCase, builtInLowerCase);
        System.out.println("Custom LowerCase Conversion: " + customLowerCase);
        System.out.println("Built-in LowerCase Conversion: " + builtInLowerCase);
        System.out.println("Results Matched? " + isSame);
        
        sc.close();
    }
}

/* 	I/P:
		Enter a text: HELLOworLD
	O/P:
		Custom LowerCase Conversion: helloworld
		Built-in LowerCase Conversion: helloworld
		Results Matched? true
 */
