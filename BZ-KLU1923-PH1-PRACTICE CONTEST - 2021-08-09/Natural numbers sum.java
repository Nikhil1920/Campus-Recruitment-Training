import java.util.*;

class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long result = 0;
        while (num > 0) {
            result += num;
            num--;
        }
        System.out.println(result);
        sc.close();
    }
}
