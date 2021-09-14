
// Petya and Strings
// codeforces 112a
import java.util.Scanner;

class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = toSmall(str1);
        str2 = toSmall(str2);
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        int val = 0;
        for (int i = 0; i < char1.length && val == 0; i++) {
            if (char1[i] < char2[i])
                val = -1;
            else if (char1[i] > char2[i])
                val = 1;
        }
        System.out.println(val);
        sc.close();
    }

    // This function returns string in lower case
    public static String toSmall(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int val = chars[i] - 'a';
            if (val < 0) {
                chars[i] = (char) (chars[i] - 'A' + 97);
            }
        }
        return new String(chars);
    }
}