
// Bear and Big Brother
// codeforces 791 a
import java.util.Scanner;

class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limak_weight = sc.nextInt();
        int bob_weight = sc.nextInt();
        int count = 0;
        while (limak_weight <= bob_weight) {
            limak_weight *= 3;
            bob_weight *= 2;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}