import java.util.Scanner;

class CountMultiplesOf3511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int num = sc.nextInt();
            int sum = num / 3 + num / 5 + num / 11 - num / 15 - num / 33 - num / 55 - num / 165;
            System.out.println(sum);
            num_of_cases--;
        }
        sc.close();
    }
}