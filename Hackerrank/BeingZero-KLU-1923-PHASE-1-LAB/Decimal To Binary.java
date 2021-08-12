import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int num = sc.nextInt();
            System.out.println(Integer.toBinaryString(num));
            num_of_cases--;
        }
        sc.close();
    }
}