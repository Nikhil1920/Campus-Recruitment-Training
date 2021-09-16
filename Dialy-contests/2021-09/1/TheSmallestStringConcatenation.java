
// TheSmallestStringConcatenation
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++)
            strings[i] = sc.nextLine();

        Arrays.sort(strings, new Comp());

        String result = "";
        for (int i = 0; i < n; i++)
            result += strings[i];

        System.out.println(result);
        sc.close();
    }
}

class Comp implements Comparator<String> {
    public int compare(String a, String b) {
        return (a + b).compareTo(b + a);
    }
}
