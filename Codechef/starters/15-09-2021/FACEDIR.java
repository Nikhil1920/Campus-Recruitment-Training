import java.util.Scanner;

class FACEDIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            int temp = n % 4;
            switch (temp) {
                case 0:
                    System.out.println("North");
                    break;
                case 1:
                    System.out.println("East");
                    break;

                case 2:
                    System.out.println("South");
                    break;

                case 3:
                    System.out.println("West");
                    break;

                default:
                    break;
            }
        }
        sc.close();
    }
}