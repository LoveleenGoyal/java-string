import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
		System.out.println("Generating Exception...");
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
			System.out.println("Handling Exception...");
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Input is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a number: ");
        String inputString = sc.next();

        // Calling method to generate exception
        try {
            generateException(inputString);
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        // Calling method to handle exception
        handleException(inputString);


        sc.close();
    }
}

/*
I/P :  
Enter a number: 08bh

O/P: 
Generating Exception...
java.lang.NumberFormatException: For input string: "08bh"
Handling Exception...
NumberFormatException caught: Input is not a valid integer.

 */
