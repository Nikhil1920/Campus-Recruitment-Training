import java.util.Scanner;

class LittleHarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
        sc.close();
    }
}