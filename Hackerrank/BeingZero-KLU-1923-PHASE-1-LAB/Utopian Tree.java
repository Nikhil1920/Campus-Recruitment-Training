import java.util.Scanner;

class UtopianTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int num = sc.nextInt();
            int height = 1;
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    height++;
                } else {
                    height += height;
                }
            }
            System.out.println(height);
            num_of_cases--;
        }
        sc.close();
    }
}