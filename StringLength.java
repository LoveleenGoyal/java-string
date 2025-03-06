import java.util.Scanner;

public class StringLength {
	
	// Method to find the length of a string withoud length() method
	public static int findStringLength(String text) {
		int count = 0;
		try {
			while (true) {
				text.charAt(count);
				count++;
			}
		} catch (RuntimeException e) {
			System.out.println("Handling the exception for index out of bounds.");
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input 
		System.out.print("Enter the input string: ");
		String inputText = sc.nextLine();
		
		int customLength = findStringLength(inputText);
		int builtInLength = inputText.length();
		
		// Compare and Display results
		boolean isSame = customLength == builtInLength;
        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length method: " + builtInLength);
        System.out.println("Results Matched? " + isSame);
		
		sc.close();
	}
}
/*  
	I/P:
		Enter the input string: hello there!
	O/P:
		Handling the exception for index out of bounds.
		Custom Length: 12
		Built-in Length method: 12
		Results Matched? true

*/
