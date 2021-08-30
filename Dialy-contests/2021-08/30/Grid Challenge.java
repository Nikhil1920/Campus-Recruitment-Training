
// GridChallenge
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            String[] grid = new String[n];
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next();
                char[] tempArray = grid[i].toCharArray();
                Arrays.sort(tempArray);
                grid[i] = new String(tempArray);
            }
            boolean valid = true;
            for (int i = 0; i < grid[0].length() && valid; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (grid[j + 1].charAt(i) < grid[j].charAt(i)) {
                        valid = false;
                        break;
                    }
                }
            }
            System.out.println(valid ? "YES" : "NO");
        }
        sc.close();
    }
}