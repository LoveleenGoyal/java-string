import java.util.Scanner;

public class ToggleCaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Toggle case conversion
        String toggledString = toggleCase(input);

        // Displaying the result
        System.out.println("Toggled case string: " + toggledString);
		sc.close();
    }

    // Method to toggle case
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				result.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)) {
				result.append(Character.toUpperCase(ch));
			}
			else {
				result.append(ch);
			}
		}
		return result.toString();
    }
}

/* 
I/P:
Enter a string: tOGGLE cASE
O/P:
Toggled case string: Toggle Case 
*/

