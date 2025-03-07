import java.util.Scanner;

public class CharacterFrequency {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencyResult = findCharacterFrequency(input);

        System.out.println("Character Frequencies:");
        System.out.println("Character\tFrequency");
        for (String[] entry : frequencyResult) {
            System.out.printf("%s\t\t%s%n", entry[0], entry[1]);
        }

        sc.close();
    }
	
    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        StringBuilder uniqueChars = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char uniqueChar = uniqueChars[i];
            int frequency = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChar) {
                    frequency++;
                }
            }
            result[i][0] = Character.toString(uniqueChar);
            result[i][1] = Integer.toString(frequency);
        }
        return result;
    }
}

/* 
Enter a string: Complete your work by end of the day
Character Frequencies:
Character       Frequency
C               1
o               4
m               1
p               1
l               1
e               4
t               2
                7
y               3
u               1
r               2
w               1
k               1
b               1
n               1
d               2
f               1
h               1
a               1
 */
