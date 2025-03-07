import java.util.Scanner;

public class CharacterFrequencyUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequencyArray = findCharacterFrequency(text);
        System.out.println("\nCharacter Frequencies:");
        for (String entry : frequencyArray) {
            if (entry != null) {
                System.out.println(entry);
            }
        }
    }

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int length = characters.length;
        int[] frequency = new int[length];

        // Initialize frequency array and mark duplicates as '0'
        for (int i = 0; i < length; i++) {
            if (characters[i] == '0') continue;
            frequency[i] = 1;

            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        // Store characters and their frequencies in a 1D array
        String[] result = new String[length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + ": \t\t" + frequency[i];
            }
        }

        return result;
    }
}

/*
Enter a string: Frequency of characters using loop

Character Frequencies:
F:              1
r:              3
e:              3
q:              1
u:              2
n:              2
c:              3
y:              1
 :              4
o:              3
f:              1
h:              1
a:              2
t:              1
s:              2
i:              1
g:              1
l:              1
p:              1
*/