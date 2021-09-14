
// Elephant
// codeforces 617 a
import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int moves = 0;
        while (num > 0) {
            if (num >= 5) {
                moves += num / 5;
                num = num % 5;
            } else if (num >= 4) {
                moves += num / 4;
                num = num % 4;
            } else if (num >= 3) {
                moves += num / 3;
                num = num % 3;
            } else if (num >= 2) {
                moves += num / 2;
                num = num % 2;
            } else {
                num--;
                moves++;
            }
        }
        System.out.println(moves);
        sc.close();
    }
}