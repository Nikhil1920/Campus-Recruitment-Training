import java.util.Scanner;

class AMR15A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd_count = 0;
        int even_count = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % 2 == 0)
                even_count++;
            else
                odd_count++;
        }
        System.out.println(even_count > odd_count ? "READY FOR BATTLE" : "NOT READY");
        sc.close();
    }
}