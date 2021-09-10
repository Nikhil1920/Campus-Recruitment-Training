
// LengthySort
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.next();
        }
        sort(array, length);
        sortDictionary(array, length);
        for (int i = 0; i < length; i++)
            System.out.print(array[i] + " ");
        sc.close();
    }

    static void sort(String[] s, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].length() > s[j].length()) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }

    static void sortDictionary(String[] s, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].length() == s[j].length() && s[i].compareTo(s[j]) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }
}