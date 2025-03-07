import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String text = sc.nextLine();
		
		if (isPalindrome(text)) {
			System.out.println("It is palindrome.");
		} else {
			System.out.println("It is not palindrome.");
		}
		sc.close();
	}
	
	public static boolean isPalindrome(String text) {
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
}
/*
I/P:
Enter the String: abcdef
O/P:
It is not palindrome.

I/P:
Enter the String: abc cba
O/P:
It is palindrome.
 */
