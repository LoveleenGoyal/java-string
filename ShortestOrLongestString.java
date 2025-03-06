import java.util.Scanner;
import java.util.Arrays;

public class ShortestOrLongestString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String inputText = sc.nextLine();
        
        String[] words = splitTextIntoWords(inputText);
        String[][] wordLengthArray = getWordsWithLengths(words);
        String[] result = findShortestAndLongest(wordLengthArray);
        
        System.out.println("Words extracted: " + Arrays.toString(words));
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
        
        sc.close();
    }

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

    // Method to split text into words without using split()
    public static String[] splitTextIntoWords(String text) {
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

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengthArray;
    }

    // Method to find shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortest = wordLengthArray[0][0];
        String longest = wordLengthArray[0][0];
        
        for (String[] word : wordLengthArray) {
            if (findStringLength(word[0]) < findStringLength(shortest)) {
                shortest = word[0];
            }
            if (findStringLength(word[0]) > findStringLength(longest)) {
                longest = word[0];
            }
        }
        return new String[]{shortest, longest};
    }
}
