import java.util.Scanner;

class WaterMelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 2) {
            System.out.println("NO");
        } else
            System.out.println(num % 2 == 0 ? "YES" : "NO");
        sc.close();
    }
}