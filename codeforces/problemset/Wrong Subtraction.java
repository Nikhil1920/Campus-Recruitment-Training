
// Wrong Subtraction
// codeforces 977 a
import java.util.Scanner;

class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        while (k-- > 0) {
            if (num % 10 != 0)
                num -= 1;
            else
                num /= 10;
        }
        System.out.println(num);
        sc.close();
    }
}