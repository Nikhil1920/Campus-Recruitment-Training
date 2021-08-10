import java.util.*;

class NumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long reverse_num = 0;
        while (num != 0) {
            long temp = num % 10;
            num = num / 10;
            reverse_num = reverse_num * 10 + temp;
        }
        System.out.println(reverse_num);
        sc.close();
    }
}