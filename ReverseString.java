import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        
        String reversed = reverseString(input); 
        System.out.println("Reversed string: " + reversed);
        
        sc.close();
    }
    
    // Method to reverse a string without using built-in functions
    public static String reverseString(String str) {
        char[] charArray = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(str.length() - 1 - i);
        }
        
        return new String(charArray);
    }
}

/* 
Enter a string to reverse: reverse a string
Reversed string: gnirts a esrever */

