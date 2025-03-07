import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean iterativeResult = isPalindromeIterative(input);
        boolean recursiveResult = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean arrayResult = isPalindromeUsingArray(input);

        System.out.println("Palindrome check using Iterative Method: " + iterativeResult);
        System.out.println("Palindrome check using Recursion: " + recursiveResult);
        System.out.println("Palindrome check using Character Array: " + arrayResult);

        sc.close();
    }
	
    // Logic 1: Compare characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Check palindrome using character arrays
    public static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(original).equals(new String(reversed));
    }
}

/* 
I/P: Enter a string: abccba
O/P:
Palindrome check using Iterative Method: true
Palindrome check using Recursion: true
Palindrome check using Character Array: true 
*/
