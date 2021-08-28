import java.util.Scanner;

class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        int result = 0;
        while (num_of_cases-- > 0) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                count += sc.nextInt();
            }
            if (count >= 2)
                result++;
        }
        System.out.println(result);
        sc.close();
    }
}