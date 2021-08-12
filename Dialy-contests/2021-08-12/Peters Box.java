import java.util.Scanner;

class PetersBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int num = sc.nextInt();
            int count = 0;
            for (int i = 0; i < num; i++) {
                count += i;
            }
            System.out.println(count);
            num_of_cases--;
        }
        sc.close();
    }
}