import java.util.Scanner;

class FloatorInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println(num % 1 > 0 ? "NOT INT" : "INT");
        sc.close();
    }
}