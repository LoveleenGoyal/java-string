import java.util.Scanner;

public class SubstringOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the substring to count: ");
        String subString = sc.nextLine();

        int count = countOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" appears " + count + " times in the main string.");
    }

    public static int countOccurrences(String str1, String str2) {
        if (str2.isEmpty()) return 0; 

        int count = 0, index = 0;

        while ((index = str1.indexOf(str2, index)) != -1) {
            count++;
            index += str2.length();
        }

        return count;
    }
}

/* 
I/P: 
Enter the main string: The given substring occurss in a string.
Enter the substring to count: string

O/P:
The substring "string" appears 2 times in the main string. */

