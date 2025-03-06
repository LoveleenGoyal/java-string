import java.util.Scanner;
import java.util.Arrays;

public class SplitText {

    // Method to find the length of a string without using length() method
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

    // Method to split text into words using charAt() method
    public static String[] splitTextIntoWords(String text) {
        int length = findStringLength(text);
        int wordCount = 1;
        
        // Count number of spaces to determine word count
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        
        // Store space indexes
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' && index < spaceIndexes.length) {
                spaceIndexes[index++] = i;
            }
        }
        
        String[] words = new String[wordCount];
        int start = 0;
        
        // Extract words using space indexes
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        words[wordCount - 1] = text.substring(start);
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = sc.nextLine();
        
        // Splitting text using custom method and usinng built-in method
        String[] customSplitWords = splitTextIntoWords(inputText);
        String[] builtInSplitWords = inputText.split(" ");
        
        // Comparing results
        boolean isSame = compareStringArrays(customSplitWords, builtInSplitWords);
        
        // Displaying results
        System.out.println("Words extracted using custom method: " + Arrays.toString(customSplitWords));
        System.out.println("Words extracted using built-in split method: " + Arrays.toString(builtInSplitWords));
        System.out.println("Comparing results? " + isSame);
        
        sc.close();
    }
}

/* 
	I/P:
		Enter a text: Welcome to bridgelabz!
	O/P:
		Words extracted using custom method: [Welcome, to, bridgelabz!]
		Words extracted using built-in split method: [Welcome, to, bridgelabz!]
		Comparing results? true
 */