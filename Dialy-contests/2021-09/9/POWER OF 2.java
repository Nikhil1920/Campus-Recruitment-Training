
// POWER OF 2
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            long num = sc.nextLong();
            int count = 0;
            while (num > 0 && count < 2) {
                count += num & 1;
                num >>= 1;
            }
            System.out.println(count == 1 ? "YES" : "NO");
        }
        sc.close();
    }
}