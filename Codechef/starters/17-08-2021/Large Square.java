import java.util.Scanner;

class LargeSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int num = sc.nextInt();
            int side_length = sc.nextInt();
            int a = (int) Math.sqrt(num);
            System.out.println(a * side_length);
            num_of_cases--;
        }
        sc.close();
    }
}