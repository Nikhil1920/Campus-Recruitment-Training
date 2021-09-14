
// String Task
// codeforces 118 a
import java.util.ArrayList;
import java.util.Scanner;

class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        ArrayList<Character> letters = new ArrayList<Character>();
        int letter_count = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'y') {
                continue;
            } else {
                letters.add(letter_count++, '.');
                letters.add(letter_count++, str.charAt(i));
            }
        }
        StringBuilder builder = new StringBuilder(letters.size());
        for (Character ch : letters) {
            builder.append(ch);
        }
        System.out.println(builder.toString());
        sc.close();
    }
}