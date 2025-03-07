import java.util.Scanner;

public class LongestWordFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the sentence: ");
		String sentence = sc.nextLine();
		
		String longestWord = findLongestWord(sentence);
		System.out.println("The longest word is: " + longestWord);
		
		sc.close();
	}
	
	// Method to find the longest word in a sentence
	public static String findLongestWord(String sentence) {
		String[] words = sentence.split(" ");
		String longestWord = "";
		
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}
}
/* 
I/P: Enter the sentence: what's happening today
O/P: The longest word is: happening */

