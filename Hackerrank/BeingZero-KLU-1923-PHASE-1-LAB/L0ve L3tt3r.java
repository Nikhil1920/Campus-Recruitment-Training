import java.util.Scanner;

class L0veL3tt3r {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp >= 0) {
                System.out.print((char) ('a' + temp));
            } else if (temp == -3) {
                System.out.print(".");
            } else if (temp == -2) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
        sc.close();
    }
}