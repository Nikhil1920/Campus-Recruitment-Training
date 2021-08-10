import java.util.*;

class ComputeApowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        long result = 1;
        while (num2 > 0) {
            result = result * num1;
            num2--;
        }
        System.out.println(result);
        sc.close();
    }
}
