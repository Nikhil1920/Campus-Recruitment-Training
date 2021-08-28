import java.util.Scanner;

class boredWithLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = 1;
        int min = num1 < num2 ? num1 : num2;
        for (int i = 1; i <= min; i++) {
            result *= i;
        }
        System.out.println(result);
        sc.close();
    }
}