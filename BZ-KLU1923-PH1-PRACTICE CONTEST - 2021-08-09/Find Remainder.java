import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 % num2);
            num_of_cases--;
        }
        sc.close();
    }
}