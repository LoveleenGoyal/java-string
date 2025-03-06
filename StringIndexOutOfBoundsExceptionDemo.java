import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
	
	// Method to generate the exception using index beyond length
	public static void generateException(String input) {
		int i = input.length();
		System.out.print(input.charAt(i));
	}
	
	// Method to handle String index out of bounds exception
	public static void handleException(String input) {
		try {
			int i = input.length();
			System.out.print(input.charAt(i));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index out of bounds exception caught: \n" + e);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String inputString = sc.next();
		
		// Uncomment the following line
		// generateException(inputString);
		
		handleException(inputString);
		
		sc.close();
	}
}
