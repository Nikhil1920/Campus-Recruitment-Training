
// Soldier and Bananas
// codeforces 546 A
import java.util.Scanner;

class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_banana_price = sc.nextInt();
        long soilder_cash = sc.nextLong();
        int bananas_needed = sc.nextInt();
        int bananas_cost = 0;
        for (int i = 1; i <= bananas_needed; i++) {
            bananas_cost += (i * first_banana_price);
        }
        System.out.println(bananas_cost - soilder_cash <= 0 ? "0" : bananas_cost - soilder_cash);
        sc.close();
    }
}