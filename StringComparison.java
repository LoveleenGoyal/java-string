import java.util.Scanner;

public class StringComparison {
	
	// Method to compare strings using charAt() method
    public static boolean compareStringsCharAt(String str1, String str2) {
		// if lengths are not equal
        if (str1.length() != str2.length()) {
            return false;
        }
		// Compare strings at each index
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking user input for 2 string variables
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean charAtComparison = compareStringsCharAt(str1, str2);
        boolean equalsMethodComparison = str1.equals(str2);

		// Display comparison results
        System.out.println("Comparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + equalsMethodComparison);
        System.out.println("Results match: " + (charAtComparison == equalsMethodComparison));

        sc.close();
    }
}
