import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
        
        sc.close();
    }

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charFrequency = new int[256];
        
        for (int i = 0; i < str1.length(); i++) {
            charFrequency[str1.charAt(i)]++;
            charFrequency[str2.charAt(i)]--;
        }
        
        for (int freq : charFrequency) {
            if (freq != 0) {
                return false;
            }
        }
        
        return true;
    }
}

/* 
I/P: 	Enter the first string: silent
o/P: 	Enter the second string: listen
		Are the two strings anagrams? true
 */
