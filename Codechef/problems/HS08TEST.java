import java.util.Scanner;
//HS08TEST

class HS08TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double withdraw = sc.nextDouble();
        double balance = sc.nextDouble();
        if (balance >= withdraw + 0.5 && withdraw % 5 == 0) {
            balance -= withdraw + 0.5;
        }

        System.out.printf("%.2f", balance);

        sc.close();
    }
}