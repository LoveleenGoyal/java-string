import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char mostFrequentChar = findMostFrequentChar(input);

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
		
		sc.close();
    }

    // Method to find the most frequent character
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; 

        // Counting frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Finding the character with the maximum frequency
        int maxFreq = 0;
        char mostFrequentChar = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxFreq) {
                maxFreq = freq[str.charAt(i)];
                mostFrequentChar = str.charAt(i);
            }
        }

        return mostFrequentChar;
    }
}

/* 
I/P:
Enter a string: success

O/P:
Most Frequent Character: 's' 
*/