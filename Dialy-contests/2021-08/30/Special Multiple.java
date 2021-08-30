import java.util.Scanner;

// SpecialMultiple
class SpecialMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            for (int i = 1; i < 0x10000; ++i) {
                String value = Integer.toBinaryString(i).replace('1', '9');
                if (Long.parseLong(value) % n == 0) {
                    System.out.println(value);
                    break;
                }
            }
        }
        sc.close();
    }
}