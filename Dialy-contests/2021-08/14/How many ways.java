import java.util.Scanner;

class HowManyWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (x == 0 && n == 0) {
                break;
            }
            int count = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        if (i + j + k == x) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}