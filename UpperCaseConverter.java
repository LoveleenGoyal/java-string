import java.util.Scanner;

public class UpperCaseConverter {

    // Method to convert text to uppercase using charAt() and ASCII values
    public static String convertToUpperCase(String text) {
        String result = new String();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch; 
            }
        }
        return result;
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
        String customUpperCase = convertToUpperCase(inputText);
        
        // Converting using built-in method
        String builtInUpperCase = inputText.toUpperCase();
        
        // Compare and Display results
		boolean isSame = compareStrings(customUpperCase, builtInUpperCase);
        System.out.println("Custom UpperCase Conversion: " + customUpperCase);
        System.out.println("Built-in UpperCase Conversion: " + builtInUpperCase);
        System.out.println("Results Matched? " + isSame);
        
        sc.close();
    }
}

/*  
	I/P:
		Enter a text: hello world
	
	O/P:
		Custom UpperCase Conversion: HELLO WORLD
		Built-in UpperCase Conversion: HELLO WORLD
		Results Matched? true
 */
