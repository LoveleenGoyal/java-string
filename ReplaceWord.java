import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        // Replacing the word in the sentence
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Displaying the result
        System.out.println("Modified Sentence: " + modifiedSentence);
		
		sc.close();
    }

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}

/*
I/P:
Enter a sentence: given word
Enter the word to replace: given
Enter the new word: another

O/P:
Modified Sentence: another word
 
 */