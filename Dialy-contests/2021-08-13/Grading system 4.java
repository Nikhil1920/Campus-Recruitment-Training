import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if (m == -1 || f == -1) {
                if (r == -1) {
                    continue;
                }
                System.out.println("F");
                continue;
            }
            int sum = m + f;
            if (sum >= 80) {
                System.out.println("A");
                continue;
            } else if (sum >= 65) {
                System.out.println("B");
                continue;
            } else if (sum >= 50) {
                System.out.println("C");
                continue;
            } else if (sum >= 30) {
                System.out.println(r >= 50 ? "D" : "C");
            } else {
                System.out.println("F");
            }
        }
        sc.close();
    }
}