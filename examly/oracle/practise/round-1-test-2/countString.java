import java.util.Scanner;

class countString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String org = inp;
        inp = inp.toLowerCase();
        int[] count = new int[26];
        int spaceCount = 0;
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                spaceCount++;
            } else {
                count[inp.charAt(i) - 'a']++;
            }
        }
        Character max_char = org.charAt(0);
        Character min_char = org.charAt(0);
        int[] freq = new int[inp.length()];
        char str[] = org.toCharArray();
        for (int i = 0; i < str.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j] && str[i] != ' ' && str[i] != '0') {
                    freq[i]++;
                    str[j] = '0';
                }
            }
        }
        int min = freq[0];
        int max = freq[0];
        for (int i = 0; i < freq.length; i++) {
            if (min > freq[i] && freq[i] != '0') {
                min = freq[i];
                min_char = str[i];
            }
            if (max < freq[i]) {
                max = freq[i];
                max_char = str[i];
            }
        }
        int char_count = inp.length() - spaceCount;
        int vowel_count = count[0] + count['e' - 'a'] + count['i' - 'a'] + count['o' - 'a'] + count['u' - 'a'];
        int consonant_count = char_count - vowel_count;
        System.out.println("Total characters: " + char_count);
        System.out.println("Vowels: " + vowel_count);
        System.out.println("Consonants: " + consonant_count);
        System.out.println("White spaces: " + spaceCount);
        System.out.println("Words: " + (spaceCount + 1));
        System.out.println("Most frequent: " + max_char);
        System.out.println("Least frequent: " + min_char);
        sc.close();
    }
}