import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Generate exception: ");
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
			System.out.println("Handle exception: ");
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for array size
        System.out.print("Enter the number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        // Initializing the array
        String[] names = new String[size];

        // Taking user input for names
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Calling method to generate exception
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        // Calling method to handle exception
        handleException(names);

        sc.close();
    }
}

/* 
	I/P:
		Enter the number of names: 4
		Enter name 1: hello
		Enter name 2: helloworld
		Enter name 3: world
		Enter name 4: hell

	O/P:
		Generate exception:
		java.lang.ArrayIndexOutOfBoundsException: 4
		Handle exception:
		ArrayIndexOutOfBoundsException caught: Index is out of bounds.
 */
