import java.util.*;

class ComputeNFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;
        while (num > 0) {
            result *= num;
            num--;
        }
        System.out.println(result);
        sc.close();
    }
}
