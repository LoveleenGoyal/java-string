import java.util.Scanner;

public class FrequencyOfCharacter {
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
	
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256]; 

        // Populate frequency array
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Count distinct characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(charFrequency[i]);
                index++;
            }
        }
        return result;
    }
}
/* 
Enter a string: Hi! My name is Loveleen
Character Frequencies:
Character       Frequency
                4
!               1
H               1
L               1
M               1
a               1
e               4
i               2
l               1
m               1
n               2
o               1
s               1
v               1
y               1

 */