import java.util.Scanner;

class Solution {
    static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.next();
        char[] given_as_char = given.toCharArray();
        String vowels = "";
        int vowel_count = 0;
        for (int i = 0; i < given.length(); i++) {
            char temp = given.charAt(i);
            if (isVowel(temp)) {
                vowel_count++;
                vowels += temp;
            }
        }
        for (int i = 0; i < given.length(); i++) {
            if (isVowel(given.charAt(i))) {
                given_as_char[i] = vowels.charAt(--vowel_count);
            }
        }
        System.out.println(String.valueOf(given_as_char));
        sc.close();
    }
}