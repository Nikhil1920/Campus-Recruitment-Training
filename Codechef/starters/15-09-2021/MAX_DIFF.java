import java.util.Scanner;

class MAX_DIFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int range = sc.nextInt();
            int sum = sc.nextInt();
            int max_diff = 0;
            for (int i = 0; i <= range - 1; i++) {
                for (int j = i + 1; j <= range && j <= sum; j++) {
                    if ((i + j) > sum)
                        break;
                    if ((i + j) == sum) {
                        if (Math.abs(i - j) > max_diff) {
                            max_diff = Math.abs(i - j);
                        }
                    }
                }
                if (i > sum)
                    break;
            }
            System.out.println(max_diff);
        }
        sc.close();
    }
}