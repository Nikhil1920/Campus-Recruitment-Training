import java.util.Scanner;

class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int j = 0;
            for (; j < num - i; j++) {
                System.out.print(" ");
            }
            for (; j < num; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}