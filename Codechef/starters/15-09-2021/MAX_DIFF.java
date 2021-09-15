import java.util.Scanner;

class MAX_DIFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int range = sc.nextInt();
            int sum = sc.nextInt();
            int max_diff = 0;
            for (int i = 0; i <= range && i <= sum; i++) {
                int j = sum - i;
                if (j <= range) {
                    int diff = (int) Math.abs(i - j);
                    if (diff > max_diff)
                        max_diff = diff;
                }
            }
            System.out.println(max_diff);
        }
        sc.close();
    }
}