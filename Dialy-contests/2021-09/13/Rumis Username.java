
// Rumi's Username
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        String result = "";
        result += first.charAt(0);
        for (int i = 1; i < first.length(); i++) {
            if (first.charAt(i) < second.charAt(0))
                result += first.charAt(i);
            else
                break;
        }
        result += second.charAt(0);
        System.out.println(result);
        sc.close();
    }
}