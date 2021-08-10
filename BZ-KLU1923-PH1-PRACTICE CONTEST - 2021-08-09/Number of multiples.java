import java.util.*;

class NumberOfMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(num / 3 + num / 5 - num / 15);
        sc.close();
    }
}
