
// AlphabetCount
import java.util.Scanner;

class AlphabetCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++)
            count[input.charAt(i) - 'a']++;
        char start = 'a';
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0)
                System.out.println(start + " - " + count[i]);
            start = (char) (start + 1);
        }
        sc.close();
    }
}