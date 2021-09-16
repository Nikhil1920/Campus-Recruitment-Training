
// UniqueSubstring
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int num_of_cases = sc.nextInt();
            sc.nextLine();
            while (num_of_cases-- > 0) {
                String s = sc.nextLine();
                int[] count = new int[128];
                int result = 0;
                for (int i = 0, j = 0; i < s.length(); i++) {
                    j = (count[s.charAt(i)] > 0) ? Math.max(j, count[s.charAt(i)]) : j;
                    count[s.charAt(i)] = i + 1;
                    result = Math.max(result, i - j + 1);
                }
                System.out.println(result);
                sc.close();
            }
        } catch (Exception e) {
            System.out.println(0);
        }

    }
}