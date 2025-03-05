import java.util.Scanner;

public class CharacterArrayComparison {

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to display character array
    public static void displayCharArray(char[] charArray) {
        System.out.print("[");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
            if (i != charArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.next();

        // Getting character arrays using both methods
        char[] customCharArray = getCharacters(inputString);
        char[] builtInCharArray = inputString.toCharArray();

        // Comparing both character arrays
        boolean comparisonResult = compareCharArrays(customCharArray, builtInCharArray);

        System.out.print("Character array using custom method: ");
        displayCharArray(customCharArray);

        System.out.print("Character array using toCharArray(): ");
        displayCharArray(builtInCharArray);

        System.out.println("Arrays match: " + comparisonResult);

        sc.close();
    }
}
