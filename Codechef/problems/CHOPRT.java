import java.util.Scanner;

class CHOPRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int num = sc.nextInt();
            int num2 = sc.nextInt();
            if (num == num2)
                System.out.println("=");
            else
                System.out.println(num < num2 ? "<" : ">");
        }
        sc.close();
    }
}