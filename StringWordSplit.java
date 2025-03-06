import java.util.Scanner;
import java.util.Arrays;

public class StringWordSplit {
    // Method to find the length of a string without using length()
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] splitTextWithoutSplitMethod(String text) {
        int length = findStringLength(text);
        int wordCount = 1;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordStart = 0, wordIndex = 0;

        // Extract words based on space indexes
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[wordIndex] = text.substring(wordStart);

        return words;
    }

    // Method to generate 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordsWithLengths;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Splitting text using custom method
        String[] customSplitWords = splitTextWithoutSplitMethod(text);

        // Generating 2D array with words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(customSplitWords);

        // Displaying results in tabular format
        System.out.println("Word\tLength");
        for (String[] entry : wordsWithLengths) {
            System.out.println(entry[0] + "\t" + Integer.parseInt(entry[1]));
        }

    }
}
/* 
	I/P:
		Enter the text: What are you doing?
	O/P:
		Word    Length
		What    4
		are     3
		you     3
		doing?  6
 */