import java.util.Scanner;

class TLG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] max_lead = { 0, 0 };
        int cum_score_1 = 0, cum_score_2 = 0;
        for (int i = 0; i < n; i++) {
            cum_score_1 += sc.nextInt();
            cum_score_2 += sc.nextInt();
            int diff = Math.abs(cum_score_1 - cum_score_2);
            if (cum_score_1 > cum_score_2) {
                if (diff > max_lead[0]) {
                    max_lead[0] = diff;
                }
            } else {
                if (diff > max_lead[1]) {
                    max_lead[1] = diff;
                }
            }
        }
        System.out.println(max_lead[0] > max_lead[1] ? "1 " + max_lead[0] : "2 " + max_lead[1]);
        sc.close();
    }
}