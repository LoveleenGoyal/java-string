import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String modifiedString = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + modifiedString);
        
        sc.close();
    }
    
    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII character set
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}

/* 
Enter a string: hello there!
String after removing duplicates: helo tr!

 */
