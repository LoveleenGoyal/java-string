import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);

        String modifiedString = removeCharacter(input, charToRemove);

        System.out.println("Modified String: \"" + modifiedString + "\"");
		
		sc.close();
    }

    // Method to remove all occurrences of a specific character
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}

/*
I/P:
Enter a string: Hello World
Enter the character to remove: l

O/P:
Modified String: "Heo Word"
*/
