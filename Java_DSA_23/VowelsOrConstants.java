import java.util.Scanner;

public class VowelOrConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
        
        scanner.close();
    }
    
    public static boolean isVowel(char ch) {
        // Convert the character to lowercase for case-insensitive checking
        char lowercaseCh = Character.toLowerCase(ch);
        
        // Check if the character is one of the vowels
        return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o' || lowercaseCh == 'u';
    }
}
